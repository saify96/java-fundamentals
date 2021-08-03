package inheritance01;
import java.util.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {
    @Test public void testRestaurant() {
        Resturant classUnderTest = new Resturant("burgeeeeeer",10,10);
        assertEquals("burgeeeeeer", classUnderTest.getName());
        assertEquals(10, classUnderTest.getStars());
        assertEquals(10, classUnderTest.getPrice());
        Review testReview = new Review("Mohammad","wow",10);
        classUnderTest.addReviewInter(testReview);
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
        testRes.addReviewInter(testReview);
        assertEquals("[Reviewer Name : Mohammad\nReview : wow\nStars : 100]",testRes.getReviewsList().toString());
    }
    @Test public void avgAndAddReview(){
        Resturant testRes = new Resturant("mansaaaf",10,10);
        Review testReview = new Review("Mohammad","wow",8);
        Review testReview1 = new Review("majd","wow",10);
        testRes.addReviewInter(testReview);
        testRes.addReviewInter(testReview1);
        assertEquals("[Reviewer Name : Mohammad\nReview : wow\nStars : 8, Reviewer Name : majd\nReview : wow\nStars : 10]",testRes.getReviewsList().toString());
    }
    //lab07
    @Test public void testShop() {
        Shop cryptoShop = new Shop("cryptoShop", "shop for trading cryptocurrencies", 4);
        assertEquals("Shop Name : cryptoShop\nDescription about shop : shop for trading cryptocurrencies\nRange of price : 4", cryptoShop.toString());
    }

    @Test public void testShopStars() {
        Shop cryptoShop = new Shop("cryptoShop", "shop for trading cryptocurrencies", 4);
        Review review = new Review("saify", "amazing", 6);
        Review review2 = new Review("anas", "woow", 10);
        Review review3 = new Review("anas", "woow", 5);
        cryptoShop.addReviewInter(review);
        cryptoShop.addReviewInter(review2);
        cryptoShop.addReviewInter(review3);
        System.out.println(cryptoShop.getStars());
        assertEquals(7.0,cryptoShop.getStars(),0.0000);
    }

    @Test public void testShopReviewsList() {
        Shop cryptoShop = new Shop("cryptoShop", "shop for trading cryptocurrencies", 4);
        Review review = new Review("saify", "amazing", 6);
        Review review2 = new Review("anas", "woow", 10);
        cryptoShop.addReviewInter(review);
        cryptoShop.addReviewInter(review2);
        assertEquals("[Reviewer Name : saify\nReview : amazing\nStars : 6, Reviewer Name : anas\nReview : woow\nStars : 10]", cryptoShop.getReviewsList().toString());
    }

    @Test public void testTheater() {
        ArrayList<String> moviesList = new ArrayList<String>();
        moviesList.add("godFather");
        moviesList.add("dark Knight");
        Theater theater = new Theater("theater1",moviesList);
        assertEquals("Theater Name : theater1\nList of movies : [godFather, dark Knight]\nAnd got : 0 Stars", theater.toString());
    }




}
