/* Exercise 4.23:
Using an approach similar to that of Exercise 4.21, find the two largest values among the 10 entered values
[Note: You may enter each number only once]
 */

import java.util.Scanner;

public class TwoLargestIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1, number = 0, largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        while (counter <= 10) {
            System.out.print("Insert integer: ");
            number = input.nextInt();

            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }

            counter++;
        }

        System.out.printf("The largest number is: %d %n", largest);
        System.out.printf("The second largest number: %d %n", secondLargest);

        input.close();
    }
}
