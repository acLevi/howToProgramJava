// Exercise 2.35: CarpoolingLane.java
// Program that calculates the daily cost of driving to work, to estimate
// how much money can be saved by using the carpooling lane.

import java.util.Scanner; // program uses class Scanner

public class CarpoolingLane {
    // main method begins the Java application execution
    public static void main(String[] args) {
        // creates a Scanner to obtain input from the command line
        Scanner input = new Scanner(System.in);

        // totalKm: distance driven per day (item a)
        // fuelPrice: price per liter of gasoline (item b)
        // carKmByLiter: average kilometers per liter (item c)
        // parkingFees: parking fees per day (item d)
        // toll: toll per day (item e)
        // dailyCost: final result — total daily cost of driving
        double totalKm, fuelPrice, carKmByLiter, fuelConsumption, parkingFees, toll, dailyCost;

        System.out.print("Travel's total kilometers: ");
        totalKm = input.nextDouble();

        System.out.print("Gasoline price ($ per liter): ");
        fuelPrice = input.nextDouble();

        System.out.print("Car's fuel efficiency (km/l): ");
        carKmByLiter = input.nextDouble();

        System.out.print("Parking fees per day ($): ");
        parkingFees = input.nextDouble();

        System.out.print("Tolls per day ($): ");
        toll = input.nextDouble();

        // daily cost = fuel cost + parking + tolls
        // fuel cost is calculated by: distance / fuel efficiency * price per liter
        // e.g., 40 km / 12 km/l * $5.50 = $18.33
        dailyCost = (totalKm / carKmByLiter) * fuelPrice + parkingFees + toll;

        // prints the result formatted with 2 decimal places
        System.out.printf("Daily driving cost: $%.2f%n", dailyCost);

        input.close(); // releases the resources used by the Scanner
    } // end method main
} // end class CarpoolingLane
