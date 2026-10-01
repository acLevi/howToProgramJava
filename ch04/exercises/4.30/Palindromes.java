/* Exercise 4.30
A palindrome is a sequence of characters that reads the same from left to right and from right to left.
For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554, and 11611.
Write an application that reads a five-digit integer and determines whether or not it is a palindrome.
If the number is not five digits long, display an error message and allow the user to enter a new value.
*/

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 1, reversedNumber = 0;

        while (number < 10000 || number > 99999) {
            System.out.print("Enter a five-digit integer: ");
            number = input.nextInt();
            if (number < 10000 || number > 99999) {
                System.out.println("Error: the number must have five digits.");
            }
        }

        int tempNumber = number;
        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            tempNumber = tempNumber / 10;
        }

        if (reversedNumber == number) {
            System.out.printf("%d is a palindrome! %n%n", number);
        } else {
            System.out.printf("%d is not a palindrome.  %n%n", number);
        }

        input.close();
    }
}
