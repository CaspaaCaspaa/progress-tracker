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
                if (parameters[0].equals(row.getProjectName()) && row.getTimeStop() != null) {
                    Duration between = Duration.between(row.getTimeStart(), row.getTimeStop());
                    report.addToReport(row.getProjectName(), between);
                }
            }

        }


        System.out.println(report.toString());
    }
}
