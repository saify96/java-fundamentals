package inheritance01;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {
    @Test public void testRestaurant() {
        Resturant classUnderTest = new Resturant("burgeeeeeer",10,10);
        assertEquals("burgeeeeeer", classUnderTest.getName());
        assertEquals(10, classUnderTest.getStars());
        assertEquals(10, classUnderTest.getPrice());
        Review testReview = new Review("Mohammad","wow",10);
        classUnderTest.addReview(testReview);
        assertEquals("Restaurant Name : burgeeeeeer\nRestaurant Rate : 10\nRestaurant Price Category : 10\nand they got these reviews [Reviewer Name : Mohammad\nReview : wow\nStars : 10]", classUnderTest.toString());
    }
    @Test public void testReview(){
        Review classUnderTest = new Review("saify","amazing",5);
        assertEquals("saify", classUnderTest.getAuthor());
        assertEquals("amazing", classUnderTest.getBody());
        assertEquals(5, classUnderTest.getStars());
        assertEquals("Reviewer Name : saify\nReview : amazing\nStars : 5", classUnderTest.toString());
    }
    @Test public void testAddReview(){
        Resturant testRes = new Resturant("mansaaaf",100,100);
        Review testReview = new Review("Mohammad","wow",100);
        testRes.addReview(testReview);
        assertEquals("[Reviewer Name : Mohammad\nReview : wow\nStars : 100]",testRes.getReviewsList().toString());
    }
    @Test public void avgAndAddReview(){
        Resturant testRes = new Resturant("mansaaaf",100,100);
        Review testReview = new Review("Mohammad","wow",100);
        testRes.addReview(testReview);
        testRes.addReview(testReview);
        testRes.addReview(testReview);
        assertEquals("[Reviewer Name : Mohammad\nReview : wow\nStars : 100]",testRes.getReviewsList().toString());
    }

}
