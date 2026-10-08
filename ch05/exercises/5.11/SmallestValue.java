/* Exercise 5.11:
Write an application that finds the smallest of several integers.
Assume that the first value read specifies the number of values to be entered by the user.
 */

import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        int counter, smallest = Integer.MAX_VALUE;
        Scanner input = new Scanner(System.in);

        System.out.print("Insert the number of integers to be read: ");
        counter = input.nextInt();

        if (counter == 0) {
            System.out.println("END");
        } else {
            for (int i = 1; i <= counter; i++) {
                int number;
                System.out.print("Insert the integer: ");
                number = input.nextInt();

                if (number < smallest) {
                    smallest = number;
                }
            }
        }

        System.out.printf("Of the %d numbers read, the smallest is %d%n", counter, smallest);
    }
}
