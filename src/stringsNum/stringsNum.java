package stringsNum;

import java.util.Scanner;


/**
 * Created by Marinka on 23.04.2017.
 */
public class stringsNum {
    private int n;
    private int a;
    private String[] arrStrings;


    public stringsNum() {
    }

    public String[] stringsEnter() {
        System.out.println("Enter the strings quantity");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arrStrings = new String[n];
        for (int i = 0; i < n+1; i++) {
            arrStrings[i] = sc.nextLine();
        }

        return arrStrings;
    }

    public int[] calculateQty() {

        int[] arrQty = new int[a];
        for (int i = 0; i < n+1; i++) {
            int lengthStr = arrStrings[i].length();
            for (int j = 0; j < a+1; j++) {
                arrQty[a] = lengthStr;
            }

        }

        return arrQty;
    }
    public void calculateAve(){
        int s = 0;
        int[] arr = new int[a];
        for (int i = 0; i < a; i++){
           s = s + arr[i];
        }
        s = s/arr.length;
        System.out.println(s);
    }

}