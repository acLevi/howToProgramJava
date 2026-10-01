/* Exercise 4.37:
The factorial of a non-negative integer n is written as n! and is defined as follows:
n! = n * (n -1) * (n - 2) * ... * 1 (for values of n greater than or equal to 1) and
n! = 1 (for n = 0)
For example, 5! = 5 * 4 * 3 * 2 * 1, which equals 120.

c) Write an application that computes the value of e^x using the following formula.
Allow the user to enter the number of terms to calculate.

e^x = 1 + x^1/1! + x^2/2! + x^3/3! + ....
*/

import java.util.Scanner;

public class FactorialC {
    public static void main(String[] args) {
        int terms = -1, counter = 1;
        long factorial;
        double constant = 1.0, x = 1.0, power = 1.0;
        Scanner input = new Scanner(System.in);

        System.out.println("e^x = x^1/1! + x/1! + x^2/2! + x^3/3! + ...");
        System.out.print("Enter the value of X: ");
        x = input.nextDouble();

        while (terms < 0) {
            System.out.print("Enter a number of terms: ");
            terms = input.nextInt();
        }

        System.out.print("e^x = 1 ");

        while (counter <= terms) {
            int number = counter;
            if (number == 0) {
                factorial = 1;
            } else {
                factorial = number;
                long predecessor = number;
                while (predecessor > 1) {
                    predecessor--;
                    factorial *= predecessor;
                }
            } 

            power *= x;

            System.out.printf("+ %.4f/%d! ", power, counter);
            constant += power / factorial;
            counter++;
        }

        System.out.printf("= %f%n", constant);
        input.close();
    }
}
