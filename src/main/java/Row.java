import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Row {
    private String projectName;
    private String taskName;
    private LocalDateTime timeStart;
    private LocalDateTime timeStop;


    public Row() {
    }

    public Row(String projectName, String taskName, String timeStartString, String timeStopString) {
        this.projectName = projectName;
        this.taskName = taskName;

        this.timeStart = new Parser().parse(timeStartString);
        this.timeStop = new Parser().parse(timeStopString);

    }

    public String getProjectName() {
        return projectName;
    }

    public String getTaskName() {
        return taskName;
    }

    public LocalDateTime getTimeStart() {
        return timeStart;
    }

    public LocalDateTime getTimeStop() {
        return timeStop;
    }

    public void setProjectname(String projectname) {
        this.projectName = projectname;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setTimeStart(LocalDateTime timeStart) {
        this.timeStart = timeStart;
    }

    public void setTimeStop(LocalDateTime timeStop) {
        this.timeStop = timeStop;
    }

    public void setTimeStart(String timeStartString) {
        this.timeStart = new Parser().parse(timeStartString);
    }

    public void setTimeStop(String timeStopString) {
         this.timeStop = new Parser().parse(timeStopString);
    }

    @Override
    public String toString() {
        return projectName  + ' ' + taskName + ' ' + timeStart + " - " + timeStop +'\n';
    }
}
