import java.util.HashSet;
import java.util.Set;

public class a_11_9 {

    /*
    9. Write a method hasEven that accepts a set of integers as a parameter and returns true if the set contains at least
    one even integer and false otherwise. If passed the empty set, your method should return false.
     */

    public static void main(String[] args) {

        Set<Integer> testSet1 = new HashSet<>();
        Set<Integer> testSet2 = new HashSet<>();

        testSet1.add(1);
        testSet1.add(2);
        testSet1.add(3);

        System.out.println("Should return true: " + hasEven(testSet1));
        System.out.println("Should return false: " + hasEven(testSet2));

    }

    public static boolean hasEven(Set<Integer> set) {

        for (int n : set) {

            if (n % 2 == 0) {

               return true;
            }
        }
        return false;
    }
}
