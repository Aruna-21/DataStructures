package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    //Anagram checks if two strings contain same characters

    public static boolean anagram() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter two strings");
        String s1 = in.next();
        String s2 = in.next();
        char[] a = s1.toLowerCase().toCharArray();
        char[] b = s2.toLowerCase().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        if (a.length != b.length) {
            return false;
        } else {
            return Arrays.equals(a, b);
        }
    }


    public static void main(String[] args) {
        //System.out.println(anagram());
        if(anagram())
            System.out.println("is anagram");
        else
            System.out.println("not anagram");
    }
}

