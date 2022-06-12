import java.util.List;


    public class Start implements Command {
        @Override
        public void execute(String projectName, String taskName) {
            String timeStop = "";
            Row row = new Row();
            RowManager rowManager = new RowManager();
            String timeStart = row.getTimeStop().toString();
            rowManager.insertRow(projectName, taskName, timeStart, "dd-MM-yyyy HH:mm");


        }


    }

