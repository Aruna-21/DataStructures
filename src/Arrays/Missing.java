package Arrays;

public class Missing {
    public static void main(String[] args) {
        //finds missing ele in an array
        int n[] = {1, 2, 4, 5};
        int sum1 = 0;
        for (int i = 0; i < n.length; i++) {
            sum1 = sum1 + n[i];
        }
        System.out.println("sum of ele's:" + sum1);//1+2+4+5=12
        int sum2 = 0;
        for (int i = 1; i <= 5; i++) {
            sum2 = sum2 + i;
        }
        System.out.println("sum of range:" + sum2);//1+2+3+4+5=15

        System.out.println("missing ele:" + (sum2 - sum1));//o/p=15-12=3
    }
}
