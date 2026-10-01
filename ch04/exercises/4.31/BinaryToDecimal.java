/* Exercise 4.31
Write an application that inputs an integer containing only 0s and 1s (i.e, a binary integer) and prints its decimal equivalent.
*/

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int binary, decimal = 0, positionalValue = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Insert a binary number: ");
        binary = input.nextInt();
    
        int remainingDigits = binary;
        while (remainingDigits != 0) {
            int digit = remainingDigits % 10;

            decimal += digit * positionalValue;

            positionalValue = positionalValue * 2;
            remainingDigits /= 10;
        }

        System.out.printf("%d in binary is %d in decimal.%n", binary, decimal);
        input.close();
    }
}
