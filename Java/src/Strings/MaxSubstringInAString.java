package Strings;

public class MaxSubstringInAString {

    public static void main(String[] args) {
        String str = "abcba";
        int len = maxSubstringInAString(str);
        System.out.println(len);
    }

    public static int maxSubstringInAString(String str) {
        int[] arr = new int[26];
        int maxLength = -1;

        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 'a';

            if (arr[idx] > 0) {
                maxLength = Math.max(maxLength, i - arr[idx]);
            } else {
                arr[idx] = i + 1;
            }
        }
        return maxLength;
    }
}