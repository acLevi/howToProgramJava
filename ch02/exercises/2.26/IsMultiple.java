// Exercise 2.26: Program that reads two integers 
// and returns whether the first is a multiple of the second.

import java.util.Scanner;

public class IsMultiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, y;

        System.out.print("Insert the first integer: ");
        x = input.nextInt();
        System.out.print("Insert the second integer: ");
        y = input.nextInt();

        if (x % y == 0) {
            System.out.printf("%d is multiple of %d", x, y);
        } else {
            System.out.printf("%d isn't multiple of %d", x, y);
        }
    }
}