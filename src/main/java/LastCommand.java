import java.util.List;

public class LastCommand implements Command {
    @Override
    public void execute() {
        List<Row> rowList = rowManager.getRows();
        int size = rowList.size();

        for (int i = 10; i > 0; i--)
            System.out.println(rowList.get(size-i));

    }
}