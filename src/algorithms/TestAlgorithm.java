package algorithms;

import algorithms.handler.Gender;
import algorithms.handler.HandlerParameters;
import algorithms.handler.Person;

import java.util.Arrays;

public class TestAlgorithm {
    public static void main(String[] args) throws Exception {
        System.out.println(new DigitsCounter().countDigit(565));

        System.out.println(new ReverseString().reverseString("The quick brown fox"));
        System.out.println(new PalindromeChecker().check(12321));
        new TypeCharCounter().countTypes("123Hello World!!!&%");

        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] arr2 = {9, 2, 4, 5, 5, 7, 5, 2, 3, -1};
        System.out.println(Arrays.toString(new ReverseArray().reverseArray(arr, 5)));
        System.out.println(Arrays.toString(new ReverseArray().sortArray(arr2)));


        HandlerParameters handlerParameters = new HandlerParameters();
        Object[] arrOfObjects = {1, 2.4F, 2.5, "Hello", 'g', "World", new Person("Kate", 18, Gender.FEMALE),
                new Person("Johny", 20, Gender.MALE)};
        handlerParameters.handleParameters(arrOfObjects);

    }
}
