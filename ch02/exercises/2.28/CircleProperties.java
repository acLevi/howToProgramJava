// Exercise 2.28: CircleProperties.java
// Program that reads the radius of a circle and displays its
// diameter, circumference, and area.

import java.util.Scanner; // program uses class Scanner

public class CircleProperties {
    // main method begins the Java application execution
    public static void main(String[] args) {
        // creates a Scanner to obtain input from the command line
        Scanner input = new Scanner(System.in);

        // prompts the user to enter the radius and reads it
        System.out.print("Insert the radius (integer): ");
        int radius = input.nextInt();

        // diameter: twice the radius (d = 2r)
        System.out.printf("Diameter: %d%n", 2 * radius);

        // circumference: 2 times pi times the radius (c = 2*pi*r);
        // Math.PI is the constant 3.14159... provided by class Math
        System.out.printf("Circumference: %.3f%n", 2 * Math.PI * radius);

        // area: pi times the radius squared (a = pi*r^2);
        // (radius * radius) is the way to square a value in Java
        // %.3f: formats the floating-point result with 3 decimal places
        System.out.printf("Area: %.3f%n", Math.PI * (radius * radius));

        input.close(); // releases the resources used by the Scanner
    } // end method main
} // end class CircleProperties