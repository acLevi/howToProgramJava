/* Exercise 3.17
In this exercise, you will design an "initial" HealthProfile class for a person.
The class attributes must include the person's first name, last name, gender, date of birth (consisting of separate attributes for birth month, day,
and year), height (in meters), and weight (in kilograms). Your class must have a constructor that accepts this data.
Provide set and get methods for each attribute. The class must also include methods that calculate and return the user's age in years,
maximum heart rate range and target heart rate (see Exercise 3.16), as well as body mass index (BMI; see
Exercise 2.33). Write a Java application that prompts for the person's information, instantiates a HealthProfile object for
them, and prints the information from that object—including the person's first name, last name, gender, date of birth, height, and weight—and
then calculates and prints the age in years, BMI, maximum heart rate range, and target heart rate. It must also display
the BMI values ​​chart from Exercise 2.33.
*/

import java.util.Scanner;

public class HealthProfileTest {
    public static void main(String[] args) {
        HealthProfile user1HealthProfile = null;

        System.out.println(BMI.getBMI(1.7, 51.2));

        user1HealthProfile = setupUserHealthProfile(user1HealthProfile);

        System.out.println("--- USER PROFILE ---");
        System.out.printf("Name: %s %nGender: %s %nBirth date: %s %nHeight: %.1fm %nWeight: %.1fkg %n%n", 
            user1HealthProfile.getFullName(), user1HealthProfile.getGender(), user1HealthProfile.getBirthDate(), 
            user1HealthProfile.getHeight(), user1HealthProfile.getWeight());
        System.out.printf("Age: %d years old %nMax heart rate: %d %nTarget heart rate: %s %n%n", 
            user1HealthProfile.getAge(), user1HealthProfile.getMaxHeartRate(), user1HealthProfile.getTargetHeartRate());
        System.out.printf("Your BMI: %.1f %n%n %s", user1HealthProfile.getBMI(), BMI.displayBMITable());
    }

    public static HealthProfile setupUserHealthProfile(HealthProfile user) {
       String userFirstName, userLastName, userGender;
        double userWeight, userHeight;
        int userBirthDay, userBirthMonth, userBirthYear;

        Scanner input = new Scanner(System.in);

        System.out.print("Insert your first name: ");
        userFirstName = input.next();

        System.out.print("Insert your last name: ");
        userLastName = input.next();

        System.out.print("Insert your gender: ");
        userGender = input.next();

        System.out.print("Insert your weight (in kilograms): ");
        userWeight = input.nextDouble();

        System.out.print("Insert your height (in meters): ");
        userHeight = input.nextDouble();

        System.out.print("Your day of birth: ");
        userBirthDay = input.nextInt();

        System.out.printf("Your month of birth: %d/", userBirthDay);
        userBirthMonth = input.nextInt();

        System.out.printf("Your year of birth: %d/%d/", userBirthDay, userBirthMonth);
        userBirthYear = input.nextInt();
        System.out.println();

        input.close();

        user = new HealthProfile(userFirstName, userLastName, userGender, userHeight, userWeight, 
                                userBirthDay, userBirthMonth, userBirthYear);

        return user;
    }
}
