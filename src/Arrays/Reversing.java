package Arrays;

public class Reversing {
    public static void main(String[] args) {
        //reverses an array
        int[] n = {1, 2, 3, 4, 5};
        for (int i = 0; i <= n.length - 1; i++)
            System.out.print(n[i] + " ");
        System.out.println();
        System.out.println("reversed array:");
        for (int i = n.length - 1; i >= 0; i--)
            System.out.print(n[i] + " ");
    }
}
