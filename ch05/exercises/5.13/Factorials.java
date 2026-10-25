/* Exercise 5.13:
Factorials are often used in probality problems. The factorial of a positive integer n
(written as n! and pronunced "n factorial") is equal to the product of the positive integers from 1 to n.
Write an application that calculates the factorials from 1 to 20.
Use ´long´ type. Display the result in a tabular format.
What difficulty might prevent you from calculating the factorial of 100?
- The factorial of 100 (and even of 21) exceeds the maximum value a `long` can hold (about 9.22e18), causing integer overflow.
*/

public class Factorials {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 20; i++) {
            long factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            System.out.printf("%2d! = %d%n", i, factorial);
        }
    }
}
