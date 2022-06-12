import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StopCommand implements Command {


    @Override
    public void execute(String[] parameteres) {

        RowManager rowManager = new RowManager();

        rowManager.updateRow();



    }
}