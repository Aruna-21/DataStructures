package JavaPrograms;

public class SumOfDigits {
    public static void main(String[] args) {
        //prints sum of all digits
        int n=1234;
        int sum=0;
        while (n>0){
            sum=sum+n%10;
            n=n/10;
        }
        System.out.println("Sum of Digits:"+sum);//0/p=10
    }
}
