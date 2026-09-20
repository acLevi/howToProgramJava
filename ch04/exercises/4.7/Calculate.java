// Exercise 4.7: Determine the value of the variables in the statement ´product *= x++´
// after the calculation is performed. Assume that all variables are of type ´int´ and initially have the value 5.

public class Calculate {
    public static void main(String[] args) {
        int product = 5, x = 5;

        product *= x++; // product = product * (x + 1);

        System.out.printf("Product: %d %nX: %d %n", product, x);
    }
}
