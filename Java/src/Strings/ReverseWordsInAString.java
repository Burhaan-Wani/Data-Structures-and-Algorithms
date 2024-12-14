package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String str = "the sky is blue";
        String s = reverseWordsInAString(str);
        System.out.println(s);
    }

    public static String reverseWordsInAString(String str) {
        str = str.trim();
        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("\\s+")));
        Collections.reverse(list);

        return String.join(" ", list);
    }
}
