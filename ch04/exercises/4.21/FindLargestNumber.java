/* Exercise 4.21:
The process of finding the largest value is widely used in a computer applications.
For example, a program that determines the winner of a sales competition would input the number of units sold by each salesperson.
The salesperson who sells the most units wins the competition. 
Write a pseudocode program and, subsequently, a Java application that accepts as input as seires of 10 integers and 
determines and prints the largest of the integers.
Your program must use least the following three variables:

a) counter: a counter to count up to 10 (that is, to monito how many numbers have been entered and determine when all 10 numbers have been processed).
b) number: the integer most recently entered by the user.
c) largest: the largest number found so far.

# pseudocode

initialize counter to 1
initialize number to 0
initialize numberID to 0
initialize largest to 0


WHILE counter is less than or equal to 10 do
    prompt number
    read number

    IF number is greater than largest
        largest = number
        numberID = counter

    increment counter
*/

import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1, number = 0, numberID = 0, largest = Integer.MIN_VALUE;

        while (counter <= 10) {
            System.out.printf("Insert integer %d: ", counter);
            number = input.nextInt();

            if (number > largest) {
                largest = number;
                numberID = counter;
            }

            counter++;
        }

        System.out.printf("The largest number is the %d° number: %d %n", numberID, largest);

        input.close();
    }
}
