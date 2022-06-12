import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LastCommand implements Command {
    @Override
    public void execute(String[] parameters) {

        List<Row> rows = rowManager.readFile();

        Map<String, String> rowMap = new HashMap<>();
        int k = 1;
        String i = String.valueOf(k);
        for (Row row : rows) {
            if (!rowMap.containsValue(row.getProjectName() + " " + row.getTaskName())) {
                rowMap.put(i, row.getProjectName() + " " + row.getTaskName());
                System.out.println("Identyfikator " + i + " ----------------------- "
                        + row.getProjectName() + " " + row.getTaskName());
                k++;
                i = String.valueOf(k);

            }
            if (k > 9 ) {
                break;
            }
        }

        String userChoice = getUserAnswer(rowMap);

        if (userChoice != null ){
            Command command = new StartCommand();
            String[] params = new String[2];
            params[0] = rowMap.get(userChoice).split(" ")[0];
            params[1] = rowMap.get(userChoice).split(" ")[1];
            command.execute(params);
        }

    }

    private String getUserAnswer(Map<String, String> rowMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj identyfikator zadania: ");

        int id = scanner.nextInt();
        System.out.println("Wybrales zadanie " + id + ": " + rowMap.get(id) + ".");

        String id = scanner.next();
        if (!rowMap.containsKey(id)){
            System.out.println("Podano nieprawidlowy identyfikator!");
            return null;
        }

        System.out.print("Wybrales zadanie " + id + ": " + rowMap.get(id) + ".");

        return id;
    }
}