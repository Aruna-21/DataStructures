package JavaPrograms;

import java.util.Scanner;

public class Palindrome {
    //A palindrome is a string that reads the same forward and backward(
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int n = in.nextInt();//121
        int s = 0, c, r;
        c = n;
        while (n > 0) {
            r = n % 10;
            s = (s * 10) + r;
            n = n / 10;
        }
        if (c == s)
            System.out.println("is palindrome");
        else
            System.out.println("not palindrome");
    }
}
