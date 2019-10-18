package algorithms;

import java.util.ArrayList;
import java.util.List;

public class ReverseArray {

    public Integer[] sortArray(Integer[] arr) throws Exception {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j <= arr.length - 1; j++) {
                if (arr[j - 1] > arr[j]) {
                    Integer[] flagArr = reverseArray(new Integer[]{arr[j - 1], arr[j]}, 2);
                    arr[j - 1] = flagArr[0];
                    arr[j] = flagArr[1];
                }
            }
        }
        return arr;
    }

    public Integer[] reverseArray(Integer[] arr, Integer k) throws Exception {
        if (arr.length < k || k < 0)
            throw new IllegalArgumentException("k more then array size");

        List<Integer> newArray = new ArrayList<>();

        for (int i = k - 1; i >= 0; i--) {
            newArray.add(arr[i]);
        }

        for (int i = 0; i < k; i++) {
            arr[i] = newArray.get(i);
        }

        return arr;
    }

}
