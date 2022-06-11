import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class ParserTest {

    private Parser parser;

    @BeforeEach
    void beforeEach() {
        parser = new Parser();
    }

    // dd-MM-yyyy HH:mm

    @Test
    void parseCorrectString() {
        LocalDateTime expected = LocalDateTime.of(2022,6,11,21,28);
        assertEquals(expected, parser.parse("11-06-2022 21:28"));

        expected = LocalDateTime.of(2022,6,3,9,8);
        assertEquals(expected, parser.parse("03-06-2022 09:08"));
        assertEquals(expected, parser.parse("3-6-2022 9:8"));

    }

    @Test
    void returnNullWhenStringIsIncorrect(){
        assertNull(parser.parse("11-06-2022"));
        assertNull(parser.parse("2022-06-11 21:28"));
        assertNull(parser.parse("ala ma kota"));
        assertNull(parser.parse(""));
        assertNull(parser.parse(null));

    }
}
