package algorithms;

public class PalindromeChecker {

    public boolean check(int num) {
        if (num < 0)
            return false;

        String[] arrStr = Integer.toString(num).split("");
        String[] arrStr2 = new ReverseString().reverseString(Integer.toString(num)).split("");

        for (int i = 0; i < arrStr.length; i++) {
            if (!arrStr[i].equals(arrStr2[i])) {
                return false;
            }
        }

        return true;
    }
}
