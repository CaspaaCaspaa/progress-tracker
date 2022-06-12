import java.util.List;

public class HelpCommand implements Command {
    @Override
    public void execute(String[] parameters) {
        List<Row> rowList = rowManager.readFile();

        for (Row row : rowList) {
            System.out.println(row);
        }
    }
}
