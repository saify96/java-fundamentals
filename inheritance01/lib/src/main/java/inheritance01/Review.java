package inheritance01;

public class Review {
    private String author;
    private String body;
    private int stars;
    private String favMovie;

    public Review(String author, String body, int stars) {
        this.author = author;
        this.body = body;
        this.stars = stars;
    }

    public Review(String author, String body, int stars, String favMovie) {
        this.author = author;
        this.body = body;
        this.stars = stars;
        this.favMovie = favMovie;
    }

    @Override
    public String toString() {
        if (this.favMovie == null) {
            return "Reviewer Name : " + this.author + "\nReview : " + this.body + "\nStars : " + this.stars;
        }
        return "Reviewer Name : " + this.author + "\nReview : " + this.body + "\nStars : " + this.stars + "\nAnd the favorite movie is : " + this.favMovie;
    }

    public String getFavMovie() {
        return favMovie;
    }

    public void setFavMovie(String favMovie) {
        this.favMovie = favMovie;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
}
