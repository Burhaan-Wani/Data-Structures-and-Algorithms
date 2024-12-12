package Strings.StringBuilders;

public class ReplaceAscii {
    public static void main(String[] args) {
        String str = "cdEfG";
        System.out.println(str);
        String newStr = replaceAscii(str);
        System.out.println(newStr);

    }

    public static String replaceAscii(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            if (i % 2 == 0) {
                sb.setCharAt(i, (char) (sb.charAt(i) + 1));
            } else {
                sb.setCharAt(i, (char) (sb.charAt(i) - 1));
            }
        }
        return sb.toString();
    }
}
