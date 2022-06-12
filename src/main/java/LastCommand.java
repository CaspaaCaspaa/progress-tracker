import java.util.List;

public class LastCommand implements Command {
    @Override
    public void execute(String[] parameters) {
        List<Row> rowList = rowManager.readFile();
        int size = rowList.size();
        int i;
        if (size > 9) i = 9;
        else i = size;

        while (i > 0) {
            //System.out.print(10-i + " ");
            System.out.print(i + " ");

            System.out.println(rowList.get(size - i));
            i--;
        }

    }
}