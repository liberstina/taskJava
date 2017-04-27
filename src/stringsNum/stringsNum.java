package stringsNum;

import java.util.Scanner;


/**
 * Created by Marinka on 23.04.2017.
 */
//For class names we use UPPER Camel Case
//it is a bad practice to name all variables as 'a', 'b' 'c' etc. Hard to understand your code at all.
public class stringsNum {
    //not understandable variable names
    private int n;
    //a is not used in code at all
    private int a;
    private String[] arrStrings;

    //Default constructor is not necessary to write in your code class
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