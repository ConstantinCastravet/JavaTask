package algorithms;

public class DigitsCounter {

    public Integer countDigit(Integer num) throws Exception {
        if (num < 0 || num > 1000) {
            throw new IllegalArgumentException("Number must be between 0 and 1000");
        }

        int sum = 0;
        for (String value : Integer.toString(num).split("")) {
            sum += Integer.parseInt(value);
        }
        return sum;
    }
}
