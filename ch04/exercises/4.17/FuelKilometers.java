/* Exercise 4.17: FuelKilometers.java
Develop a Java application that accepts the kilometers driven and liters of gasoline consumed (both as integers) as input for each trip.
The program must calculate and display the fuel efficiency in kilometers per liter for each trip 
and print the total mileage and the total sum of fuel consumed across all trips up to that point.
All average calculations must yield floating-point results. 
Use the Scanner class and sentinel-controlled repetition to obtain data from user.

# pseudocode

initialize totalKilometers to 0
initialize totalLiters to 0
initialize exit to 0

WHILE option is not equal to -1 DO
    prompt for kilometers driven
    read kilometers driven

    prompt for liters of fuel consumed
    read liters consumed

    calculate fuel efficiency:
        fuel efficiency = kilometers driven converted to floating point
                          divided by liters consumed
        
        display fuel efficiency for the trip
    
    display fuel efficiency for the trip

    totalKilometers = totalKilometers + kilometers driven
    totalLiters = totalLiters + liters consumed

    promt the user to enter -1 to exit or another value to continue
    read option

END WHILE

display totalKilometers
display totalLiters
*/

import java.util.Scanner;

public class FuelKilometers {
    public static void main(String[] args) {
        int traveledKm, fuelLiters, totalKm = 0, totalLiters = 0, counter = 1, exit = 0;
        double averageKmLiter;

        Scanner input = new Scanner(System.in);

        while (exit != -1) {
            
            System.out.println();
            System.out.printf("----- Trip $d -----%n", counter);
            System.out.print("Enter the kilometers traveled: ");
            traveledKm = input.nextInt();

            System.out.print("Enter the fuel consumed (liters): ");
            fuelLiters = input.nextInt();
            System.out.println();

            averageKmLiter = (double) traveledKm / fuelLiters;
            System.out.printf("Fuel efficiency: %.1fkm/l %n", averageKmLiter);
            System.out.println();

            totalKm += traveledKm;
            totalLiters += fuelLiters;

            System.out.print("Want to continue? [type 1 to continue or -1 to exit] ");
            counter++;
            exit = input.nextInt();
        }

        System.out.printf("Total Mileage: %dkm %nTotal of fuel consumed: %dL %n", totalKm, totalLiters);

        input.close();
    }
}
