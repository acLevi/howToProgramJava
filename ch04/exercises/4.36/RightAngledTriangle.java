/* Exercise 4.36:
Write an application that reads three non-zero integers and determines and prints whether 
they could represent the sides of a right triangle.
*/

import java.util.Scanner;;

public class RightAngledTriangle {
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
            if ((a*a) + (b*b) == (c*c) || (a*a) + (c*c) == (b*b) || (b*b) + (c*c) == (a*a)) {
                System.out.println("Yes, it is a right-angled triangle!");
            } else {
                System.out.println("It is a triangle, but NOT right-angled.");
            }
        } else {
            System.out.println("Isn't a triangle.");
        }
    }
}
