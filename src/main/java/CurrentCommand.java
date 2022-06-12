import java.util.List;

public class CurrentCommand implements Command {
    @Override
    public void execute(String[] parameters) {
        List<Row> rowList = rowManager.readFile();
        int size = rowList.size();
System.out.println(rowList.get(size-1).getTimeStop());
        if (rowList.get(size - 1).getTimeStop() == null)
            System.out.println(rowList.get(size-1));
        else System.out.println("wszystkie zakonczone");

    }
}