package JavaPrograms;

import java.util.ArrayList;

public class CountNumOfDigits {
    public static void main(String[] args) {
// counts total number of elements
        int num = 123456;
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println("number of digits is:" + count);//o/p=6

    }
}
