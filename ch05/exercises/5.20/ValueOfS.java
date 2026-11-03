/* Exercise 5.20:
Calculate the value of S from an infinite series

    S = 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + ...

Print a table showing the approximate value of S, calculated using the first 200,000 terms of this series. How many terms must you use before your first obtain a value that begins with 3.14159?
*/

public class ValueOfS {
    public static void main(String[] args) {
        double pi = 0.0;
        double firstValue = 0.0;
        int firstTerm = 0;

        System.out.printf("%-15s %s%n", "Terms", "Approximation of PI");

        for (int term = 1; term <= 200000; term++) {
            int denominator = 2 * term - 1;

            if (term % 2 == 1) {
                pi += 4.0 / denominator;
            } else {
                pi -= 4.0 / denominator;
            }

            if (firstTerm == 0 && pi >= 3.14159 && pi < 3.14160) {
                firstTerm = term;
                firstValue = pi;
            }

            if (term % 20000 == 0) {
                System.out.printf("%-15d %.12f%n", term, pi);
            }
        }

        System.out.println();
    
        System.out.printf("First term: %d%n", firstTerm);
        System.out.printf("Approximation: %.12f%n", firstValue);
    }
}
