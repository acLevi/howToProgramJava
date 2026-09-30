/* Exercise 4.35:
Write an application that reads three non-zero values entered by the user and 
determines and prints wheter they could represent the sides of a triangle.
*/

import java.util.Scanner;

public class TriangleSides {
    public static void main(String[] args) {
        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first side of the triangle: ");
        a = input.nextInt();

        System.out.print("Enter the second side of the triangle: ");
        b = input.nextInt();

        System.out.print("Enter the third side of the triangle: ");
        c = input.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("It's a triangle!");
        } else {
            System.out.println("Isn't a triangle.");
        }
    }
}
