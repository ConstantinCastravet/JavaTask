package algorithms;

import java.util.Arrays;

public class TestAlgorithm {
    public static void main(String[] args) throws Exception {
//        System.out.println(new DigitsCounter().countDigit(565));
//        System.out.println(new ReverseString().reverseString("The quick brown fox"));
//        System.out.println(new PalindromeChecker().check(12321));
//        new TypeCharCounter().countTypes("123Hello World!!!&%");

        Number[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] arr2 = {9, 2, 4, 5, 5, 7, 1, 2, 3, 4};
        System.out.println(Arrays.toString(new ReverseArray().reverseArray(arr, 3)));
        System.out.println(Arrays.toString(new ReverseArray().sortArray(arr2)));

    }
}
