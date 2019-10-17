package algorithms;

public class ReverseString {


    public String reverseString(String str) {
        String[] arrayOfChars = str.split("");
        String reversString = "";

        for (int i = arrayOfChars.length - 1; i >= 0; i--) {
            reversString += arrayOfChars[i];
        }

        return reversString;
    }
}
