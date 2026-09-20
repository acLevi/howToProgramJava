/* Exercise 3.16:
Create a class named HeartRates. The class attributes must include the person's first name, last name,
and date of birth (consisting of separate attributes for the birth month, day, and year).
Your class must have a constructor that receives this data as parameters. Provide set and get methods for each attribute.
The class must also include a method that calculates and returns the age (in years), one that calculates and returns the maximum heart rate,
and one that calculates and returns the person's target heart rate.

Write a Java application that prompts for the person's information, instantiates a HeartRates object, and
prints the information from that object—including the person's first name, last name, and date of birth—
calculates and prints the person's age (in years), their maximum heart rate, and their target heart rate range.

The formula for calculating the maximum heart rate per minute is 220 minus the age in years.
The target heart rate is a range between 50% and 85% of the maximum heart rate.
[Note: these formulas are estimates provided by the AHA]
*/

import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args) {
        String userFirstName, userLastName;
        int birthDay, birthMonth, birthYear;
        HeartRates user1;

        Scanner input = new Scanner(System.in);

        System.out.print("Insert your first name: ");
        userFirstName = input.next();

        System.out.print("Insert your last name: ");
        userLastName = input.next();

        System.out.print("Your day of birth: ");
        birthDay = input.nextInt();

        System.out.printf("Your month of birth: %d/", birthDay);
        birthMonth = input.nextInt();

        System.out.printf("Your year of birth: %d/%d/", birthDay, birthMonth);
        birthYear = input.nextInt();

        user1 = new HeartRates(userFirstName, userLastName, birthDay, birthMonth, birthYear);

        System.out.printf(" %n ------------------------ %n");

        System.out.printf("Name: %s %s - Birthday: %s - %d years old %n", 
            user1.getFirstName(), user1.getLastName(), user1.getBirthDate(), user1.getAge());
        System.out.printf("Your max heart rate: %d %nYour target heart rate: %s %n%n", 
            user1.getMaxHeartRate(), user1.displayTargetHeartRate());

        input.close();
    }
}
