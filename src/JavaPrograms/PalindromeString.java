package JavaPrograms;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a string");
        String s1=in.next();
        String rev="";
        for (int i=s1.length()-1;i>=0;i--){
            rev=rev+s1.charAt(i);
        }
        System.out.println(rev);

        if(s1.equals(rev)) {
            System.out.println("is palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}
