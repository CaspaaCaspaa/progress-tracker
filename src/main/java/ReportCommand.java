import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class ReportCommand implements Command {
    @Override
    public void execute(String[] parameters) {
        List<Row> rowList = rowManager.readFile();
        LocalDateTime now = java.time.LocalDateTime.now();
        ReportTime report = new ReportTime();
        int dayOfWeek = now.getDayOfWeek().getValue();
        int dayOfYear = now.getDayOfYear();

        if (parameters.length == 0) {

            for (Row row : rowList) {

                if (row.getTimeStop() != null) {
                    Duration between = Duration.between(row.getTimeStart(), row.getTimeStop());
                    report.addToReport(row.getProjectName(), between);
                }

            }
        } else {

            for (Row row : rowList) {
                if (parameters[0].equals("today") && row.getTimeStart().isAfter(now) && row.getTimeStop() != null) {
                    Duration between = Duration.between(row.getTimeStart(), row.getTimeStop());
                    report.addToReport(row.getProjectName(), between);
                }

                if (parameters[0].equals("yesterday") &&
                        row.getTimeStop() != null &&
                        row.getTimeStart().isAfter(now.minusDays(2)) &&
                        row.getTimeStop().isBefore(now.minusDays(1))) {

                    Duration between = Duration.between(row.getTimeStart(), row.getTimeStop());
                    report.addToReport(row.getProjectName(), between);
                }
                if (parameters[0].equals("last-7-days") &&
                        row.getTimeStop() != null &&
                        row.getTimeStart().isAfter(now.minusDays(7)) &&
                        row.getTimeStop().isBefore(now.minusDays(1))) {

                    Duration between = Duration.between(row.getTimeStart(), row.getTimeStop());
                    report.addToReport(row.getProjectName(), between);
                }

                if (parameters[0].equals("this-week") &&
                        row.getTimeStop() != null &&
                        row.getTimeStart().isAfter(now.minusDays(dayOfWeek)) &&
                        row.getTimeStop().isBefore(now.minusDays(1))) {

                    Duration between = Duration.between(row.getTimeStart(), row.getTimeStop());
                    report.addToReport(row.getProjectName(), between);
                }
                if (parameters[0].equals("this-year") &&
                        row.getTimeStop() != null &&
                        row.getTimeStart().isAfter(now.minusDays(dayOfYear)) &&
                        row.getTimeStop().isBefore(now.minusDays(1))) {

                    Duration between = Duration.between(row.getTimeStart(), row.getTimeStop());
                    report.addToReport(row.getProjectName(), between);
                }


//                if (parameters[1].equals("-n") && parameters[0].equals(row.getProjectName()) && row.getTimeStop() != null) {
//                    Duration between = Duration.between(row.getTimeStart(), row.getTimeStop());
//                    report.addToReport(row.getProjectName(), between);
//                }
            }

        }


        System.out.println(report.toString());
    }
}
