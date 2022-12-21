package Arrays;

import static java.util.Arrays.sort;

public class MinMax {
    public static void main(String[] args) {
        int[] n = {1, 2, 5, 7, 9, 4};
        int max = n[0];//1
        int min = n[0];//1
        //finds maximum ele in an array
        for (int i = 1; i <= n.length - 1; i++) {
            if (n[i] > max)//2>1,5>2,7>5t,9>7,9!>4
                max = n[i];//2,5,7,9
        }
        System.out.println("maximum:" + max);

        //finds minimum ele in an array
        for (int i = 1; i <= n.length - 1; i++) {
            if (n[i] < min)//2!<1,1!<5,1!<7,1!<9,1!<4
                min = n[i];//1
        }
        System.out.println("minimum:" + min);
    }
}
