// Exercise 2.17: Program that receives three numbers entered by the 
// user and returns the sum, average, product and the largest and smallest among them.

import java.util.Scanner;

/**
 * ArithmeticSmallestLargest
 */
public class ArithmeticSmallestLargest {

    public static void main(String[] args) {
        int x, y, z, sum, avg, prod, smallest, largest;
        Scanner input = new Scanner(System.in);

        System.out.print("Insert the first integer: ");
        x = input.nextInt();
        largest = x;
        smallest = x;

        System.out.print("Insert the second integer: ");
        y = input.nextInt();
        if (y > largest)
            largest = y;
        if (y < smallest)
            smallest = y;

        System.out.print("Insert the third number: ");
        z = input.nextInt();
        if (z > largest)
            largest = z;
        if (z < smallest)
            smallest = z;

        sum = x + y + z;
        avg = (x + y + z) / 3;
        prod = (x * y * z);

        System.out.printf("Sum: %d%nProduct: %d%nAverage: %d%nLargest: %d%nSmallest: %d%n", sum, prod, avg, largest, smallest);
    }
}