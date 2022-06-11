import java.util.List;

public class CurrentCommand implements Command {
    @Override
    public void execute() {
        List<Row> rowList = rowManager.readFile();
        int size = rowList.size();

        if ( rowList.get(size-1).getTimeStop().equals(null))
            System.out.println(rowList.get(size-1));
        else System.out.println("wszystkie zakonczone");

    }
}