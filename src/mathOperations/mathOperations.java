package mathOperations;

import java.util.Scanner;

/**
 * Created by Marinka on 23.04.2017.
 */
//For class names we use UPPER Camel Case
public class mathOperations {

    public mathOperations() {

    }
    //static mathOperations mathOperations = new mathOperations();

    //You need to add an explanation to the end user about actions that takes place during method execution
    public void calculations(){
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }
/*
    public static void main(String[] args) {
        mathOperations.calculations();
    }
    */
}
