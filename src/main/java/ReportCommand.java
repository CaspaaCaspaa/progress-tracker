import java.time.Duration;
import java.util.List;

public class ReportCommand implements Command {
    @Override
    public void execute() {
        List<Row> rowList = rowManager.readFile();
        ReportTime report = new ReportTime();

        for (Row row : rowList) {
            if(row.getTimeStop() != null ){ Duration between = Duration.between(row.getTimeStart(), row.getTimeStop());

                report.addToReport(row.getProjectName(),between);
            }
            //System.out.println(row);
        }

        System.out.println(report.toString());
    }
}