package Basics;

import java.util.Scanner;

public class OperatorsInputsAndIfStatement {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        // take input using the scanner class
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        System.out.println(num);

        int num1 = 12;
        if (num1 == 12) {
            System.out.println("correct");
        } else if (num1 == 13) {
            System.out.println("even better");
        } else {
            System.out.println("not good");
        }
    }
}
