import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class RowManager {

    ArrayList<Row> rowCollection = new ArrayList<>();

    ArrayList<Row> readFile() {

        try (Scanner scanner = new Scanner(new File("PrzykladowyPlik"))) {
            while (scanner.hasNextLine()) {
                rowCollection.add(getRow(scanner.nextLine()));
                for(int i = 0; i < rowCollection.size(); i++) {
                    System.out.print(rowCollection.get(i));
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Brak pliku");
        }
        return rowCollection;
    }

    void saveDocument(ArrayList<Row> rowCollection) {
        try (FileWriter writer = new FileWriter("TestowyPlik.txt")) {
            for (Row rows : rowCollection) {
                writer.append(rows.getProjectName());
                writer.append(",");
                writer.append(rows.getTaskName());
                writer.append(",");
                writer.append(rows.getTimeStart().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")));
                writer.append(",");

                if (rows.getTimeStop() == null) {
                    writer.append(",\n");
                } else {
                    writer.append(rows.getTimeStop().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")));
                    writer.append(",\n");

                }
            }
        } catch (IOException e) {
            System.err.print("Nie moge zapisac pliku");
        }

    }

    private Row getRow(String file) {
        Row row = new Row();
        try (Scanner sc = new Scanner(file)) {
            sc.useDelimiter(",");

            String projectName = sc.next();
            String taskName = sc.next();
            String timeStart1 = sc.next();
            String timeStop2 = sc.next();

            row.setProjectname(projectName);
            row.setTaskName(taskName);
            row.setTimeStart(timeStart1);
            row.setTimeStop(timeStop2);

            if (sc.hasNext()) {
                row.setTimeStop(sc.next());
            }
            return row;

        }

        }

        void insertRow(String projectName, String taskName, String timeStartString, String timeStopString){

        Row row = new Row(projectName, taskName, timeStartString, timeStopString);
        readFile().add(row);

        saveDocument(rowCollection);
            for(int i = 0; i < rowCollection.size(); i++) {
                System.out.print(rowCollection.get(i));
            }

    }
}


