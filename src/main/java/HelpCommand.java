public class HelpCommand implements Command {
    @Override
    public void execute(String[] parameters) {
        System.out.println("Opcje, ktore mozes wybrac: ");
        for (String s : OptionToCommandMapper.commandMap.keySet()) {
            System.out.println(s);
        }
    }
}
