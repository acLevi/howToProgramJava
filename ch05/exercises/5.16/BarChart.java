/* Exercise 5.16:
Write an application that reads five numbers, each between 1 and 30.
For each number read, your program should isplay that same number of adjacent asterisks.
For examples, if your program reads the number 7, it should display *******.
Display the bars of asterisks after reading all five numbers.
*/

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2, n3, n4, n5;

        System.out.print("Enter the first number (1-30): ");
        n1 = input.nextInt();

        while (n1 < 1 || n1 > 30) {
            System.out.print("Invalid number. Enter a number between 1 and 30: ");
            n1 = input.nextInt();
        }

        System.out.print("Enter the second number (1-30): ");
        n2 = input.nextInt();

        while (n2 < 1 || n2 > 30) {
            System.out.print("Invalid number. Enter a number between 1 and 30: ");
            n2 = input.nextInt();
        }

        System.out.print("Enter the third number (1-30): ");
        n3 = input.nextInt();

        while (n3 < 1 || n3 > 30) {
            System.out.print("Invalid number. Enter a number between 1 and 30: ");
            n3 = input.nextInt();
        }

        System.out.print("Enter the fourth number (1-30): ");
        n4 = input.nextInt();

        while (n4 < 1 || n4 > 30) {
            System.out.print("Invalid number. Enter a number between 1 and 30: ");
            n4 = input.nextInt();
        }

        System.out.print("Enter the fifth number (1-30): ");
        n5 = input.nextInt();

        while (n5 < 1 || n5 > 30) {
            System.out.print("Invalid number. Enter a number between 1 and 30: ");
            n5 = input.nextInt();
        }

        for (int i = 0; i < n1; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < n2; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < n3; i++) {
            System.out.print("*");
        }
        System.out.println();
        
        for (int i = 0; i < n4; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < n5; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
