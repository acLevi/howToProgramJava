/* Exercise 4.32:
Write an application that uses only output statements to display the following checkerboard pattern.

    System.out.print("* ");
    System.out.print(" ");
    System.out.println();
*/

public class Checkerboard {
    public static void main(String[] args) {
        
        int row = 0;
        while (row < 8) {
            int column = 0;
            while (column < 16) {
                if ((row + column) % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                column++;
            }
            row++;
            System.out.println();
        }
    }
}

