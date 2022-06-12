import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StopCommand implements Command {


    @Override
    public void execute(String[] parameteres) {

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String timeStop = dateTime.format(formatter);
        String timeStart= "";

        RowManager rowManager = new RowManager();

        rowManager.insertRow(parameteres[0], parameteres[1], timeStart, timeStop);

    }
}