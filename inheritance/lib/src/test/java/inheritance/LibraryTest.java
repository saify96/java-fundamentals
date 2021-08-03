package inheritance;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {
    @Test public void testRestaurant() {
        Restaurant classUnderTest = new Restaurant("burgeeeeeer",5,10);
        assertEquals("burgeeeeeer", classUnderTest.getName());
        assertEquals(5, classUnderTest.getStars());
        assertEquals(10, classUnderTest.getPrice());
    }
}
