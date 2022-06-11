import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class RowManager {

    ArrayList<Row> readFile ()  {
        ArrayList<Row> rowCollection= new ArrayList<>();
        try(Scanner scanner = new Scanner(new File("PrzkladowyPlik"))){
            while (scanner.hasNextLine()) {
                rowCollection.add(getRows(scanner.nextLine()));
            }
        } catch (FileNotFoundException e) {
            System.err.println("Brak pliku");
        }
        return rowCollection;
    }

    void saveDocument(ArrayList<Row> rowCollection ){
        try(FileWriter writer = new FileWriter("TestowyPlik")) {
            for(Row rows : rowCollection){
                writer.append(rows.getProjectName());
                writer.append(",");
                writer.append(rows.getTaskName());
                writer.append(",");
                writer.append(rows.getTimeStart().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")));
                writer.append(",");
                if(rows.getTimeStop() == null){
                    writer.append("");
                }else{
                    writer.append(rows.getTimeStop().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")));
                }
            }
        } catch (IOException e) {
            System.err.print("Nie moge zapisac pliku");
        }

    }

    Row getRows(String s) {

        return null;
    }



}

