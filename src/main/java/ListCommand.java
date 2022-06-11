import java.util.List;

public class ListCommand implements Command {
    @Override
    public void execute() {
        List<Row> rowList = rowManager.getRows();

        for (Row row : rowList) {
            System.out.println(row);
        }
    }
}
