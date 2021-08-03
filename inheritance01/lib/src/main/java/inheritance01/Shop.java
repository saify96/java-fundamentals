package inheritance01;
import java.util.*;

public class Shop implements addReview {
    private String name;
    private String description;
    private int numOfDollarSigns;
    private double stars;
    private ArrayList<Review> reviewsListShop = new ArrayList<Review>();

    public Shop(String name, String description, int numOfDollarSigns) {
        this.name = name;
        this.description = description;
        this.numOfDollarSigns = numOfDollarSigns;
    }

    public double getStars() {
        return stars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumOfDollarSigns() {
        return numOfDollarSigns;
    }

    public void setNumOfDollarSigns(int numOfDollarSigns) {
        this.numOfDollarSigns = numOfDollarSigns;
    }

    public ArrayList<Review> getReviewsList() {
        return reviewsListShop;
    }

    @Override
    public void addReviewInter(Review review ) {
        this.stars = ((this.stars * reviewsListShop.size()) + review.getStars()) / (reviewsListShop.size()+1);
        reviewsListShop.add(review);
    }

    @Override
    public String toString() {
        if (reviewsListShop.size()>0){
            return "Shop Name : " + this.name + "\nDescription about shop : " + this.description + "\nRange of price : " + this.numOfDollarSigns +"\nAnd got : " + this.stars +" Stars";
        }
        return "Shop Name : " + this.name + "\nDescription about shop : " + this.description + "\nRange of price : " + this.numOfDollarSigns;
    }
}
