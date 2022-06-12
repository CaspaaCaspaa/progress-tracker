public class App {
    public static void main(String[] args) {

        CommandOptionChecker commandOptionChecker = new CommandOptionChecker();
        if (!commandOptionChecker.canContinue(args)) {
            System.exit(0);
        }

        Command command = commandOptionChecker.findCommand(args);
        String[] parameters = commandOptionChecker.extractAdditionalParameteres(args);

        command.execute(parameters);
        System.out.println(command.getClass());
    }
}
