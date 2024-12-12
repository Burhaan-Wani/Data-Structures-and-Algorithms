package Basics;

public class Loops {
    public static void main(String[] args) {

        /*
         * Print Arithematic progression
         * AP for n=6
         * 1,3,5,7,9,11
         * 
         * formula to fint nth term in AP= a*(n-1)d
         */
        // int n = 6;
        // for (int i = 1; i <= 2 * n - 1; i += 2) {
        // System.out.print(i + " ");
        // }
        // int a = n == 6 ? 10 : 12;
        // System.out.println(a);

        // count no of digit in a number.
        int count = 0;
        int n = 123456;
        while (n != 0) {
            n /= 10;
            count += 1;
        }
        System.out.println(count);
    }
}
