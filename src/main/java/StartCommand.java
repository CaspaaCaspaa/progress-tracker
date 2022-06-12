import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


    public class StartCommand implements Command {

        @Override
        public void execute(String[] parameteres) {


            LocalDateTime dateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
            String timeStart = dateTime.format(formatter);
            String timeStop = "";

            RowManager rowManager = new RowManager();

            rowManager.insertRow(parameteres[0], parameteres[1], timeStart, timeStop);

        }
    }