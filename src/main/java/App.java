import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(args));
        CommandOptionChecker commandOptionChecker = new CommandOptionChecker();
        Command command = commandOptionChecker.check(args);
        System.out.println(command.getClass());

    }
}
