import java.util.*;
import java.util.Collections;
import java.io.*;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.lang.*;


public class Main {

    public static void main(String[] args) {
        int[] RandomArray = roll(3);
        if (containsDuplicates(RandomArray)) {
            System.out.println("True >> There are duplicates inside the Array");
        } else {
            System.out.println("False >> There are no duplicates inside the Array");
        }
        System.out.println("The avarage of the of the values in the array =" + calculateAvg(RandomArray));
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int[] newArr = arrayOfArrays(weeklyMonthTemperatures);
        System.out.print("The Array with the lowest avg is : [");
        for (int i = 0; i < newArr.length - 1; i++) {
            System.out.print(newArr[i] + ",");
        }
        System.out.print(newArr[newArr.length - 1] + "]");
        System.out.println();

        System.out.println(analyzingWeatherData(weeklyMonthTemperatures));

        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        String winner = tally(votes);
        System.out.println(winner + " received the most votes!");
        readFiles();
    }

    public static int[] roll(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (6 * Math.random()) + 1;
            System.out.println(array[i]);
        }
        return array;
    }

    public static boolean containsDuplicates(int[] RandomArray) {
        for (int i = 0; i < RandomArray.length; i++) {
            for (int j = i + 1; j < RandomArray.length; j++) {
                if (RandomArray[i] == (RandomArray[j])) {
                    return true;
                }
            }
        }
        return false;
    }

    public static double calculateAvg(int[] RandomArray) {
        double sum = 0;
        for (int i : RandomArray) {
            sum += i;
        }
        return sum / RandomArray.length;
    }

    public static int[] arrayOfArrays(int[][] weeklyMonthTemperatures) {
        List<Double> avgList = new ArrayList<Double>();
        for (int i = 0; i < weeklyMonthTemperatures.length; i++) {
            double sum = 0;
            for (int j = 0; j < weeklyMonthTemperatures[i].length; j++) {
                sum += weeklyMonthTemperatures[i][j];
            }
            avgList.add(sum / weeklyMonthTemperatures[i].length);
        }
        System.out.println("The Array with the lowest average at index: "
                + avgList.indexOf(Collections.min(avgList)));
        return weeklyMonthTemperatures[avgList.indexOf(Collections.min(avgList))];
    }

    public static String analyzingWeatherData(int[][] weeklyMonthTemperatures) {
        int minValue = weeklyMonthTemperatures[0][0];
        int maxValue = weeklyMonthTemperatures[0][0];
        for (int i = 0; i < weeklyMonthTemperatures.length; i++) {
            for (int j = 1; j < weeklyMonthTemperatures[i].length; j++) {
                if (weeklyMonthTemperatures[i][j] < minValue) {
                    minValue = weeklyMonthTemperatures[i][j];
                } else if (weeklyMonthTemperatures[i][j] > maxValue) {
                    maxValue = weeklyMonthTemperatures[i][j];
                }
            }
        }
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < weeklyMonthTemperatures.length; i++) {
            for (int j = 0; j < weeklyMonthTemperatures[i].length; j++) {
                set.add(weeklyMonthTemperatures[i][j]);
            }
        }
        List<Integer> arrayList = new ArrayList<Integer>(set);
        Collections.sort(arrayList);
        String missingTemps = "";
        for (int i = minValue; i <= maxValue; i++) {
            if (!arrayList.contains(i)) {
                missingTemps += "\nNever saw temperature " + i;
            }
        }
        System.out.println("High: " + maxValue);
        System.out.print("Low: " + minValue);
        return missingTemps;
    }

    public static String tally(List<String> votes) {
        Set<String> votesOptins = new HashSet<String>();
        for (String i : votes) {
            votesOptins.add(i);
        }

        HashMap<String,Integer> namesAndVotes = new HashMap<String,Integer>();
        for (String j : votesOptins){
            int counter=0;
            for (String i : votes) {
                if(i==j){
                    counter++;
                }
                namesAndVotes.put(j,counter);
            }
        }

        int max = Collections.max(namesAndVotes.values());
        String winner = "";
        for(String key: namesAndVotes.keySet()){
            if (namesAndVotes.get(key)==max){
                winner =key;
            }
        }
        return winner;
    }

    public static void readFiles (){
        Path path = Paths.get("../linter/resources/gates.js");
            try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line = reader.readLine();
            char last = line.charAt(line.length()-1);
            String msg ="Missing semicolon.";
                int lineCounter=0;
                while (line != null){
                    lineCounter++;
                    if (last==';'|| last=='{' || last=='}' || line.contains("if")|| line.contains("else")){
                        System.out.println(line);
                    }else if (last!=';'){
                        System.out.println("line "+ lineCounter +": "+msg);
                    }
                    line = reader.readLine();
                    try{
                        if(!line.isEmpty()){
                            last = line.charAt(line.length()-1);
                        }
                    }catch(NullPointerException e){}
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

