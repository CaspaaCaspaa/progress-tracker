import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class ReportTime {

    private Map<String, Duration> data = new HashMap<>();

    private String projectName;
    private Duration time;

    public ReportTime() {
    }

    public void addToReport(String projectName, Duration timespan) {
        if (!data.containsKey(projectName)) {
            data.put(projectName, timespan);
        } else {
            Duration v = data.get(projectName);
            v = v.plus(timespan);
            data.put(projectName, v);
        }

    }

    public Duration get(String projectName) {
        return data.get(projectName);
    }

    @Override
    public String toString() {
        String info="";
        int lengthDiff = 0;

        for (String project : data.keySet()) {

            info += project;

        if (project.length()>lengthDiff) lengthDiff=project.length();
            for (int i = 0; i < (lengthDiff-project.length()+10); i++) {
                info += " ";
            }

            long sec = data.get(project).getSeconds();

            int p1 = (int) (sec % 60);
            int godz= (int) (sec / 60);
            int min = godz % 60;
            godz= godz /60;

            info += godz + " Godzin " + min + " minut " + "\n";
        }

        return info;
    }
}
