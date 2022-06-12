import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HelpCommand implements Command {
    @Override
    public void execute(String[] parameters) {
        System.out.println("Opcje, ktore mozesz wybrac");

        List<String> options = OptionToCommandMapper.commandMap.keySet().stream().toList();
        List<String> modifiableList = new ArrayList<String>(options);

        Collections.sort(modifiableList);

        for (String o : modifiableList) {
            System.out.println(o);
        }
    }
}
