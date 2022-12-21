package JavaPrograms;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        // swaps two numbers
        Scanner in = new Scanner(System.in);
        int a=5;
        int b=10;
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swap");
        System.out.println("a="+a+ "," +"b="+b);
    }
}
