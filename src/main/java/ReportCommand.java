import java.time.Duration;
import java.util.List;

public class ReportCommand implements Command {
    @Override
    public void execute(String[] parameters) {
        List<Row> rowList = rowManager.readFile();
        ReportTime report = new ReportTime();

        for (Row row : rowList) {
            Duration between = Duration.between(row.getTimeStart(), row.getTimeStop());
            report.addToReport(row.getProjectName(),between);
            System.out.println(row);
        }

        System.out.println(report.toString());
    }
}