// Exercise 2.34: PopulationGrowth.java
// Program that calculates the estimated world population for the next
// five years, based on the worldometers.info annual growth rate of 0.84%.

public class PopulationGrowth {
    // main method begins the Java application execution
    public static void main(String[] args) {
        // current world population (2026) in 2026;
        // long is used because the value exceeds the int limit (~2.1 billion)
        long population = 8300678395L;

        // annual growth rate in percentage (0.84% per year)
        double growthRate = 0.84;

        // compound growth: each year grows over the previous year's value.
        // growthRate / 100 converts the percentage into a decimal factor,
        // and (population * factor) is the increase for that year.
        double firstYear = population + population * (growthRate / 100);
        double secondYear = firstYear + firstYear * (growthRate / 100);
        double thirdYear = secondYear + secondYear * (growthRate / 100);
        double fourthYear = thirdYear + thirdYear * (growthRate / 100);
        double fifthYear = fourthYear + fourthYear * (growthRate / 100);

        // prints the initial data: current population and growth rate
        System.out.printf("Global Population (2026): %d%n", population);
        System.out.printf("Growth Rate: %.2f%n", growthRate);

        // prints the estimated population for each of the next five years
        // %.0f: formats each value with no decimal places (population is a whole number)
        System.out.println("Global population in years: ");
        System.out.printf("In one year: %.0f%n", firstYear);
        System.out.printf("In two years: %.0f%n", secondYear);
        System.out.printf("In three years: %.0f%n", thirdYear);
        System.out.printf("In four years: %.0f%n", fourthYear);
        System.out.printf("In five years: %.0f%n", fifthYear);
    } // end method main
} // end class PopulationGrowth
