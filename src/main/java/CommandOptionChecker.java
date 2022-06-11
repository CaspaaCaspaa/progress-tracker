public class CommandOptionChecker {

    Command check(String[] args) {
        String option = args[0];

        if (!OptionToCommandMapper.commandMap.containsKey(option)) {
            System.out.println("Nie znaleziono opcji");
            return null;
        }

        return OptionToCommandMapper.commandMap.get(option);
    }
}