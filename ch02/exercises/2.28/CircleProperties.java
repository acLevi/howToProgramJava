// Exercise 2.28: Program that reads the radius of a circle and returns its diameter, circumference and area.

import java.util.Scanner;

public class CircleProperties {
    public static void main(String[] args) {
        double PI = Math.PI;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insert the radius (integer): ");
        int radius = input.nextInt();

        System.out.printf("Diameter: %d%n", 2 * radius);
        System.out.printf("Circumference: %.3f%n", 2 * PI * radius);
        System.out.printf("Area: %.3f%n", (PI * radius) * (PI * radius));
    }
}