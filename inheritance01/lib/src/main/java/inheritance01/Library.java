package inheritance01;
import java.util.*;

public class Library {
    public static void main(String[] args) {
//        Resturant shawermaConsumers = new Resturant("shawermaConsumers", 10, 4);
//        Review review = new Review("saify", "amazing", 5);
//        Review review2 = new Review("anas", "woow", 10);
//        Review review3 = new Review("anas", "woow", 6);
//        shawermaConsumers.addReviewInter(review);
//        shawermaConsumers.addReviewInter(review2);
//        shawermaConsumers.addReviewInter(review3);
//        shawermaConsumers.addReview(review);
//        shawermaConsumers.addReview(review2);
//        System.out.println(shawermaConsumers.toString());
//
////
//        Shop cryptoShop = new Shop("cryptoShop", "shop for trading cryptocurrencies", 4);
//        Review review = new Review("saify", "amazing", 6);
//        Review review2 = new Review("anas", "woow", 10);
//        cryptoShop.addReviewInter(review);
//        cryptoShop.addReviewInter(review2);
//
//        System.out.println(cryptoShop.getReviewsList());

        Shop cryptoShop = new Shop("cryptoShop", "shop for trading cryptocurrencies", 4);
        Review review = new Review("saify", "amazing", 6);
        Review review2 = new Review("anas", "woow", 10);
        Review review3 = new Review("anas", "woow", 5);
        cryptoShop.addReviewInter(review);
        cryptoShop.addReviewInter(review2);
        cryptoShop.addReviewInter(review3);
        System.out.println(cryptoShop.getStars());

//        ArrayList<String> list = new ArrayList<String>();
//        list.add("godFather");
//        list.add("dark Knight");
//        Theater theater = new Theater("theater1",list);
//        System.out.println(theater.toString());


    }
}
