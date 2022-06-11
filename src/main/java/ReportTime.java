import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class ReportTime {

    private Map<String, Duration> data = new HashMap<>();

    private String projectName;
    private Duration time;

    public ReportTime() {
    }

    public void addToReport(String projectName, Duration timespan){
        if (!data.containsKey(projectName)){
            data.put(projectName,timespan);
        }
        else {


            Duration v = data.get(projectName);
            v.plus(timespan);
            data.put(projectName, v);
        }

    }

    @Override
    public String toString() {
        return "ReportTime{" +
                "data=" + data +
                '}';
    }
}
