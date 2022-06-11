import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Row {
    private String projectname;
    private String taskName;
    private LocalDateTime timeStart;
    private LocalDateTime timeStop;


    public Row(String projectname, String taskName, String timeStartString, String timeStopString) {
        projectname = projectname;
        taskName = taskName;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime timeStart = LocalDateTime.parse(timeStartString, formatter);
        LocalDateTime timeStop = LocalDateTime.parse(timeStopString, formatter);

    }

    public String getProjectname() {
        return projectname;
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
        this.projectname = projectname;
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
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime timeStart = LocalDateTime.parse(timeStartString, formatter);
        this.timeStart = timeStart;
    }

    public void setTimeStop(String timeStopString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime timeStop = LocalDateTime.parse(timeStopString, formatter);
        this.timeStop = timeStop;
    }

    @Override
    public String toString() {
        return projectname  + ' ' + taskName + ' ' + timeStart + '-' + timeStop +'\n';
    }
}