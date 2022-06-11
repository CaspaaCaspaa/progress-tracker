import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class ReportTimeTest {

    @Test
    public void sumTwoValues(){
        ReportTime rt = new ReportTime();

        rt.addToReport("p1", Duration.ofHours(1));
        rt.addToReport("p1", Duration.ofHours(2));

        assertEquals(Duration.ofHours(3), rt.get("p1"));
    }

    @Test
    public void sumValuesFromTwoProjects(){
        ReportTime rt = new ReportTime();

        rt.addToReport("p1", Duration.ofHours(1));
        rt.addToReport("p1", Duration.ofHours(2));

        rt.addToReport("p2", Duration.ofHours(2));
        rt.addToReport("p2", Duration.ofHours(4));



        assertEquals(Duration.ofHours(6), rt.get("p2"));

    }
}
