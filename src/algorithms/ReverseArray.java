package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArray {

    public Integer[] sortArray(Integer[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j <= arr.length - 1; j++) {

                if (arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public Number[] reverseArray(Number[] arr, Integer k) throws Exception {
        if (arr.length < k)
            throw new IllegalArgumentException("k more then array size");

        List<Number> newArray = new ArrayList<>();

        for (int i = k - 1; i >= 0; i--) {
            newArray.add(arr[i]);
        }

        for (int i = 0; i < k; i++) {
            arr[i] = newArray.get(i);
        }

        return arr;
    }

}
