package mentoring.lesson1;

import java.util.*;

/**
 * Created by Anna_Chystaya on 12-Dec-17.
 */
public class TaskStringArray {
    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1() {
        String str1 = "We make work HUMAN.";
        String str2 = "Unlock full potential. Celebrate positive moments.";
        String str3 = "Every day.";

        System.out.println("TASK1");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println();
        System.out.println("Length of the second string is " + str2.length());
        System.out.println();
        System.out.println(str1.toLowerCase());
        System.out.println(str2.toLowerCase());
        System.out.println(str3.toLowerCase());
        System.out.println();
        System.out.println(str1.replace('e', 'E'));
        System.out.println(str2.replace('e', 'E'));
        System.out.println(str3.replace('e', 'E'));
        System.out.println();
    }

    private static void task2() {
        System.out.println("TASK2");
        char[] strArray = {'G', 'l', 'o', 'b', 'o', 'f', 'o', 'r', 'c', 'e'};
        System.out.println("Array size is " + strArray.length);
        String str4 = new String(strArray);
        System.out.println(str4.replace("b", "$"));

        System.out.println(replaceCharInArray(strArray, 'o', '0'));
        System.out.println(strArray);
    }

    private static char[] replaceCharInArray(char[] initialArray, char oldChar, char newChar) {
        if (initialArray == null)
            return null;
        char[] resultArray = Arrays.copyOf(initialArray, initialArray.length);
        for (int i = 0; i < resultArray.length; i++) {
            if (resultArray[i] == oldChar) {
                resultArray[i] = newChar;
            }
        }
        return resultArray;

    }

}
