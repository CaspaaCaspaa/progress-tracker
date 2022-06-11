import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Parser {

    private DateTimeFormatter formatter;

    public Parser() {
        formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
    }

    public LocalDateTime parse(String textedDateTime) {
        LocalDateTime timeStart = null;

        try {
            if (textedDateTime != null) {
                timeStart = LocalDateTime.parse(textedDateTime, formatter);
            }
        } catch (DateTimeParseException e) {

        }
        ;

        return timeStart;
    }
}
