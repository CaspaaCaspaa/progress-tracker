import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


    public class StartCommand implements Command {

        @Override
        public void execute(String[] parameters) {

            if (parameters.length < 2) {
                System.out.println("Nie podano nazwy projektu i/lub zadania!");
                return;
            }

            LocalDateTime dateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
            String timeStart = dateTime.format(formatter);
            String timeStop = "";

            RowManager rowManager = new RowManager();

            rowManager.insertRow(parameters[0], parameters[1], timeStart, timeStop);

        }
    }