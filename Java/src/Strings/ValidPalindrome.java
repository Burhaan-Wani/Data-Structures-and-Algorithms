package Strings;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal; Panama";
        System.out.println(validPalindrome(str));
    }

    public static boolean validPalindrome(String str) {
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            while (i < j && !Character.isLetterOrDigit(str.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(str.charAt(j))) {
                j--;
            }
            if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))) {
                return false;
            }
        }
        return true;
    }
}
