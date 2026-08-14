// Exercise 2.24: Program that reads 5 integers 
// entered by the user and returns the largest and smallest integers.

import java.util.Scanner;

public class SmallestAndLargestInteger {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n1, n2, n3, n4, n5, smallest, largest;

        System.out.print("Insert the first integer: ");
        n1 = input.nextInt();

        smallest = n1;
        largest = n1;

        System.out.print("Insert the second input: ");
        n2 = input.nextInt();

        if (n2 > largest) largest = n2;
        if (n2 < smallest) smallest = n2;

        System.out.print("Insert the third number: ");
        n3 = input.nextInt();

        if (n3 > largest) largest = n3;
        if (n3 < smallest) smallest = n3;

        System.out.print("Insert the fourth number: ");
        n4 = input.nextInt();

        if (n4 > largest) largest = n4;
        if (n4 < smallest) smallest = n4;
            
        System.out.print("Insert the fifth number: ");
        n5 = input.nextInt();

        if (n5 > largest) largest = n5;
        if (n4 > smallest) smallest = n5;

        System.out.printf("%d, %d, %d, %d, %d%n", n1, n2, n3, n4, n5);
        System.out.printf("The largest integer: %d%nThe smallest integer: %d%n", largest, smallest);
    }
}