// Exercise 2.25: Program that reads am integer input and returns whether it is odd or even.

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;

        System.out.print("Insert the integer: ");
        x = input.nextInt();

        if (x % 2 == 0) {
            System.out.printf("%d is even.", x);
        } else {
            System.out.printf("%d is odd.", x);
        }
    }
}