import org.junit.Test;

import static org.junit.Assert.*;

public class CamelCaserTest {

    @Test
    public void handoutTestCamelCase() {
        assertEquals("thisIsMyString", CamelCaser.camelCase("this is my string"));
    }
    @Test
    public void firstLetterCapital() {
        assertEquals("thisIsMyString", CamelCaser.camelCase("This is my string"));
    }
    @Test
    public void upperCaseWord() {
        assertEquals("thisIsMyString", CamelCaser.camelCase("This is MY string"));
    }
}