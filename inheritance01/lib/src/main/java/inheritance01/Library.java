package inheritance01;

public class Library {
    public static void main(String[] args) {
        Resturant shawermaConsumers = new Resturant("shawermaConsumers", 10, 4);
        Review review = new Review("saify", "amazing", 8);
        Review review2 = new Review("anas", "woow", 10);
        shawermaConsumers.addReview(review);
        shawermaConsumers.addReview(review2);
        System.out.println(shawermaConsumers.toString());
    }
}
