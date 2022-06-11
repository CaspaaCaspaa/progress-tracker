import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.print("Test");
        System.out.println(Arrays.toString(args));

        Row test = new Row("A","zadanie1","12-06-2022 08:00","12-06-2022 10:00");
        System.out.println(test.toString());
        test.setTimeStop("---");
        System.out.println(test.toString());
    }
}
