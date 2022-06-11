import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RowManager {

    void readFile(String path) throws FileNotFoundException {

        ArrayList<Row> rowCollection= new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;



        File file = new File(path);
        Scanner sc = new Scanner(file);
        sc.useDelimiter(",");
        while (sc.hasNext()) {
            Row row = new Row();
            String projectName = sc.next();
            String taskName = sc.next();
//            LocalDateTime timeStart = LocalDateTime.parse(sc.next(), formatter);
//            LocalDateTime timeStop = LocalDateTime.parse(sc.next(), formatter);
            String timeStart1 = sc.next();
            String timeStop2 = sc.next();

            row.setProjectname(projectName);
            row.setTaskName(taskName);
            row.setTimeStart(timeStart1);
            row.setTimeStart(timeStop2);

            

            System.out.println(projectName + " " + taskName + " " + timeStart1 + " " + timeStop2);
        }
        sc.close();
    }

        List<Row> getRows() {
            return null;
        }

        void printRow () {

        }


    }