package Strings;

public class LargestOddNumberInAString {
    public static void main(String[] args) {
        String str = "123456";
        System.out.println(largestOddNumberInAString(str));
    }

    public static String largestOddNumberInAString(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) % 2 != 0)
                return str.substring(0, i + 1);
        }
        return "";
    }
}
