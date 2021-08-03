package inheritance;

public class Restaurant {
    private String name;
    private int stars;
    private int price;

    public Restaurant (String name,int stars,int price){
        this.name=name;
        this.stars=stars;
        this.price=price;
    }

    @Override
    public String toString(){
        return "Restaurant Name " + this.name + "\nRestaurant Rate " + this.stars + "\nRestaurant Price Category " + this.price ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

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
