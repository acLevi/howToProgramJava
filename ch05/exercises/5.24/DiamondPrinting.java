/* Exercise 5.24
Write an application that prints the following diamond shape. You may use output statements that print a single asterisk (*), a single space, or a single newline character. Maxime your use of repetition (with nested ´for´ loops) and minimize the number of output statements.
*/


public class DiamondPrinting {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print('*');
            }

            System.out.println();
        }

        for (int i = 4; i >= 1; i--) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print('*');
            }

            System.out.println();
        }
    }
}