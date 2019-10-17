package algorithms;

import java.util.Arrays;
import java.util.List;

public class TypeCharCounter {




    public void countTypes(String string) {

        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        int other = 0;

        char[] arrChar = string.toLowerCase().toCharArray();

        for (char value : arrChar) {
            if ((int) value >= 97 && (int) value <= 122) {
                letters++;
            }

            if ((int) value >= 48 && (int) value <= 57) {
                numbers++;
            }

            if (value == ' ') {
                spaces++;
            }

            if (!(value == ' ' || ((int) value >= 48 && (int) value <= 57) || ((int) value >= 97 && (int) value <= 122))) {
                other++;
            }

        }

        System.out.println("Letters: " + letters);
        System.out.println("Spaces: " + spaces);
        System.out.println("Numbers: " + numbers);
        System.out.println("Others: " + other);
    }
}
