import java.util.Map;

import static java.util.Map.entry;

public class OptionToCommandMapper {
    public static Map<String, Command> commandMap = Map.ofEntries(
            entry("list", new ListCommand()),
            entry("current", new CurrentCommand()),
            entry("last", new LastCommand()),
            entry("report", new ReportCommand()),
            entry("start", new StartCommand()),
            entry("stop", new StopCommand()),
            entry("h", new HelpCommand())

    );
}
