package inheritance01;

import java.util.*;

public class Theater implements addReview {
    private String name;
    private int stars;
    private ArrayList<String> moviesList = new ArrayList<String>();
    private ArrayList<Review> reviewsListTheater = new ArrayList<Review>();

    public Theater(String name, ArrayList<String> moviesList) {
        this.name = name;
        this.moviesList = moviesList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getMoviesList() {
        return moviesList;
    }

    public void addMovie(String movieName) {
        moviesList.add(movieName);
    }

    public void removeMovie(String movieName) {
        moviesList.remove(movieName);
    }

    @Override
    public void addReviewInter(Review review) {
        this.stars = ((this.stars * reviewsListTheater.size()) + review.getStars()) / (reviewsListTheater.size() + 1);
        reviewsListTheater.add(review);
    }

    @Override
    public String toString() {
        if (moviesList.size()>0){
            return "Theater Name : " + this.name + "\nList of movies : " + this.moviesList + "\nAnd got : " + this.stars +" Stars";
        }
        return "Theater Name : " + this.name + "\nList of movies : " + this.moviesList;

    }


}



