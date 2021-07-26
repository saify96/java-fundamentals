import java.util.*;
import java.util.Collections;

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
        for (int i = 0; i < newArr.length-1; i++) {
            System.out.print(newArr[i] + ",");
        }
        System.out.print(newArr[newArr.length-1] + "]");
        System.out.println();
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
//        double[] avgArray = new double[weeklyMonthTemperatures.length];
        for (int i = 0; i < weeklyMonthTemperatures.length; i++) {
            double sum = 0;
            for (int j = 0; j < weeklyMonthTemperatures[i].length; j++) {
                sum += weeklyMonthTemperatures[i][j];
            }
            avgList.add(sum/weeklyMonthTemperatures[i].length);
//            avgArray[i] = sum / weeklyMonthTemperatures[i].length;
        }
        System.out.println( "The Array with the lowest average at index: "
                + avgList.indexOf(Collections.min(avgList)) );
        return weeklyMonthTemperatures[avgList.indexOf(Collections.min(avgList))];
    }
}