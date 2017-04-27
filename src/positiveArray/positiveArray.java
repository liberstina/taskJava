package positiveArray;

import java.util.Random;

/**
 * Created by Marinka on 21.04.2017.
 */
//For class names we use UPPER Camel Case
public class positiveArray {
    private int[] arr;
    private Random rand = new Random();

    public positiveArray(int n) {
        arr = new int[n];
    }
    public int[] randomArr() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt()%100;
        }
        return arr;
    }
    public int[] doPositiveArr(){
        for (int i = 0; i < arr.length; i++) {
           if(arr[i] < 0)
               arr[i] = 0;
        }
        return arr;
    }

}



