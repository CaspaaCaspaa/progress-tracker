public class HelpCommand implements Command {
    @Override
    public void execute(String[] parameters) {
        System.out.println("Opcje, ktore mozesz wybrac");
        for (String option : OptionToCommandMapper.commandMap.keySet()) {
            System.out.println(option);
        }
    }
}
