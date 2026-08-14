// Exercise 2.16: Program that compares two integers 
// and returns which one is larger or whter they are equal.

import java.util.Scanner;

public class Comparing {
    public static void main(String[] args) {
        int x, y;
        Scanner input = new Scanner(System.in);

        System.out.print("Insert the first integer: ");
        x = input.nextInt();
        System.out.print("Insert the second integer: ");
        y = input.nextInt();

        if (x > y)
            System.out.printf("%d is larger than %d.", x, y);
        if (x == y)
            System.out.printf("These numbers are equal (%d = %d).", x, y);
    }
}
