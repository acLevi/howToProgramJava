// Exercise 2.33: CalculateBMI.java
// Program that calculates the body mass index (BMI) and displays the
// BMI categories table so the user can assess their result.
// Uses the metric system: weight in kilograms and height in meters.

import java.util.Scanner; // program uses class Scanner

public class CalculateBMI {
    // main method begins the Java application execution
    public static void main(String[] args) {
        // height and weight: values entered by the user
        // bmi: result of the calculation (weight divided by height squared)
        double height, weight, bmi;

        // creates a Scanner to obtain input from the command line
        Scanner input = new Scanner(System.in);

        // prompts the user to enter their height in meters and reads it
        System.out.print("Insert your height (in meters): ");
        height = input.nextDouble();

        // prompts the user to enter their weight in kilograms and reads it
        System.out.print("Insert your weight (in kilograms): ");
        weight = input.nextDouble();

        // calculates the BMI using the metric formula: weight / height^2
        bmi = weight / (height * height);

        // prints an empty line, then the BMI categories table from
        // the Department of Health and Human Services / National Institutes
        // of Health, so the user can assess their result
        System.out.println();
        System.out.println("BMI VALUES");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal: between 18.5 and 24.9");
        System.out.println("Overweight: between 25 and 29.9");
        System.out.println("Obese: 30 or greater");

        // prints the calculated BMI with two decimal places
        // %.2f: formats the floating-point value with 2 digits after the point
        System.out.printf("-> Your BMI: %.2f %n", bmi);

        input.close(); // releases the resources used by the Scanner
    } // end method main
} // end class CalculateBMI
