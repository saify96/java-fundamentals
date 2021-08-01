package inheritance01;
import java.util.*;

public class Resturant {
    private String name;
    private int stars;
    private int price;
    private ArrayList<Review> reviewsList = new ArrayList<Review>();

    public ArrayList<Review> getReviewsList() {
        return reviewsList;
    }

    public void addReview(Review review) {
        if(!reviewsList.contains(review)){
            reviewsList.add(review);
            this.stars = ((this.stars*reviewsList.size())+ review.getStars()) / (reviewsList.size()+1);
        }
    }

    public Resturant(String name, int stars, int price) {
        this.name = name;
        this.stars = stars;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Restaurant Name : " + this.name + "\nRestaurant Rate : " + this.stars + "\nRestaurant Price Category : " + this.price + "\nand they got these reviews " + reviewsList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}