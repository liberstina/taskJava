import positiveArray.positiveArray;
import stringsNum.stringsNum;
import mathOperations.mathOperations;


/**
 * Created by Marinka on 22.04.2017.
 */
public class demoClass {
    public static void main(String[] args) {
        //Заполнить массив данными (рандомными). Распечатать. Все негативные значения заменить на 0. Распечатать.

        positiveArray fillArray = new positiveArray(10);
        for (int i : fillArray.randomArr()) {
            System.out.println(i);
        }

        for (int i : fillArray.doPositiveArr()) {
            System.out.println(i);
        }

        //Пользователь вводит количество строк, потом значения этих строк. Программа считает среднюю длину строк и выводит на экран.
        stringsNum newNum = new stringsNum();
        newNum.stringsEnter();
        newNum.calculateQty();
        newNum.calculateAve();
    }

    //Пользователь вводит значения двух переменных. Программа реализует базовые математические операции над этими переменными (+ - * /).

    //Pay attention to the cyclomatism. Perhaps you write your code in a place not intended for it.
    mathOperations mathOperations = new mathOperations();
    mathOperations.
}
