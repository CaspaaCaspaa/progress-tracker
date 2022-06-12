import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LastCommand implements Command {
    @Override
    public void execute(String[] parameters) {

        List<Row> rows = rowManager.readFile();

        Map<Integer, String> rowMap = new HashMap<>();
        int i = 1;
        for (Row row : rows) {
            if (!rowMap.containsValue(row.getProjectName() + " " + row.getTaskName())) {
                rowMap.put(i, row.getProjectName() + " " + row.getTaskName());
                System.out.println("Identyfikator " + i + " ----------------------- "
                        + row.getProjectName() + " " + row.getTaskName());
                i++;
            }
            if (i > 9 ) {
                break;
            }
        }

        int userChoice = getUserAnswer(rowMap);
//        Row rowToInsert = new Row(rowMap.get(userChoice).split(" ")[0], rowMap.get(userChoice).split(" ")[1])

//        tu wywołanie option-start

    }

    private int getUserAnswer(Map<Integer, String> rowMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj identyfikator zadania: ");
        int id = scanner.nextInt();
        System.out.print("Wybrales zadanie " + id + ": " + rowMap.get(id) + ".");
        return id;
    }
}