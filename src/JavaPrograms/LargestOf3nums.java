package JavaPrograms;

import java.util.Scanner;

public class LargestOf3nums {
    /* finds largest of 3 numbers */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter three numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        //(a > b ? a : b) --> if a is greater than b, prints a as largest or b as largest
        int largest = (a > b ? a : b) > c ? (a > b ? a : b) : c;//Ternary operator
        System.out.println("largest is:" + largest);
    }
}
