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

    @Test
    public void authorizedDigit() {
        assertEquals("myNameIsShivani1", CamelCaser.camelCase("My name is Shivani1"));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testCharacter() {
        CamelCaser.camelCase("My name is @Shivani");
    }

    @Test (expected = IllegalArgumentException.class)
    public void illegalCharacter() {
        CamelCaser.camelCase("My name, is Shivani");
    }

    @Test (expected = IllegalArgumentException.class)
    public void emptyString() {
        CamelCaser.camelCase("");
    }

    @Test
    public void oneWord() {
        assertEquals("this", CamelCaser.camelCase("This"));
    }

    @Test (expected = IllegalArgumentException.class)
    public void unauthorizedDigit() {
        CamelCaser.camelCase("5Shivani");
    }

    @Test (expected = IllegalArgumentException.class)
    public void spaceInput() {
        CamelCaser.camelCase(" ");
    }

    @Test (expected = IllegalArgumentException.class)
    public void doubleSpaceInput() {
        CamelCaser.camelCase("  ");
    }

    @Test (expected = IllegalArgumentException.class)
    public void startWithSpace() {
        CamelCaser.camelCase(" Shivani");
    }

    @Test (expected = IllegalArgumentException.class)
    public void onlyIllegalCharacter() {
        CamelCaser.camelCase("&");
    }

    @Test (expected = IllegalArgumentException.class)
    public void nullInput() {
        CamelCaser.camelCase(null);
    }



}