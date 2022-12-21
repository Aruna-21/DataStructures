package Arrays;

import java.util.HashSet;
import java.util.Set;

public class Duplicates {
    //Finds repeated element in an array
    public static void main(String[] args) {
        int[] n = {2, 10, 5, 8, 10, 6, 5};
//        for (int i = 0; i <= n.length - 1; i++) {
//            for (int j = i + 1; j <= n.length - 1; j++) {
//                if (n[i] == n[j]) {
//                    System.out.println("duplicate ele:" + n[i]);
//                }
//            }
//        }


        //Using Set to decrease time complexity
        Set<Integer> integerSet = new HashSet<>();
        for (Integer number : n) {
            if (!integerSet.add(number)) {
                System.out.println("duplicate ele:" + number);
            }
        }

        //Using Set to removing duplicate ele
        Set<Integer> integerSets = new HashSet<>();
        for (Integer number : n) {
            integerSet.add(number);
        }
        System.out.println("List after removing duplicate ele:" + integerSet);
    }
}