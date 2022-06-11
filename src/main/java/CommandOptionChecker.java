public class CommandOptionChecker {

    String extractOption(String[] args) {
        return args[0];
    }

    Command findCommand(String[] args) {
        String option = extractOption(args);
        return OptionToCommandMapper.commandMap.get(option);
    }

    public boolean canContinue(String[] args) {
        if (args.length == 0) {
            System.out.println("Nie podano zadnych parametrow!");
            return false;
        } else if (!OptionToCommandMapper.commandMap.containsKey(extractOption(args))) {
            System.out.println("Nie znaleziono opcji");
            return false;
        }
        System.out.println("Wybrano opcje " + extractOption(args) + ".");
        return true;
    }
}