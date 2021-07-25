import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        System.out.println("hellooooo");
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");
        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
        flipNHeads(1);
        clock();
    }

    public static String pluralize(String word, int number) {
        if (number == 1) {
            return word;
        } else {
            return word + "s";
        }
    }

    public static void flipNHeads (int n) {
        int counter=0;
        int trial =0;
            while(counter<n){
                trial++;
                Random rand = new Random();
                double double_random=rand.nextDouble();
                if(double_random>=0.5){
                    System.out.println("heads");
                    counter++;
                }else{
                    System.out.println("tails");
                    counter=0;
                }
            }
        System.out.println("It took " + trial +  " flips to flip " + n + " head in a row." );
    }

    public static void clock (){
        while(true){
            LocalDateTime now = LocalDateTime.now();
            String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            System.out.println(time);
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {}
        }
    }
}