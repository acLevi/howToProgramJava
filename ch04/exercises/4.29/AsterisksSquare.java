/* Exercise 4.29:
Write an application that prompts the user to enter the side lenght of a square
and then displays a hollow square of that size using asterisks.
Your program must work with squares of all possible side lenghts between 1 and 20.
*/

import java.util.Scanner;

public class AsterisksSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int squareSize = 0, row = 0;

        while (squareSize > 20 || squareSize < 1) {
            System.out.print("Enter the size square [1-20]: ");
            squareSize = input.nextInt();
        }

        while (row < squareSize) {
            int column = 0;
            while (column < squareSize) {
                
                if (row == 0 || column == 0 || row == (squareSize - 1) || column == (squareSize - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                column++;
            }
            row++;
            System.out.println();
        }

        input.close();
    }
}
