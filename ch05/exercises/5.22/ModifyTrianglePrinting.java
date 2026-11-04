/* Exercise 5.22:
Question 5.15 by combining your code for the four separate asterisk triangles, so that all four patterns are printed side by side. [Hint: Make clever use of nested for loops.]

*/

public class ModifyTrianglePrinting {
    public static void main(String[] args) {
                for (int i = 1; i <= 10; i++) {

            // a)
            for (int j = 0; j < i; j++)
                System.out.print('*');
            for (int j = 0; j < 10 - i; j++)
                System.out.print(' ');

            System.out.print("  ");

            // b)
            for (int j = 0; j < 11 - i; j++)
                System.out.print('*');
            for (int j = 0; j < i - 1; j++)
                System.out.print(' ');

            System.out.print("  ");

            // c)
            for (int j = 0; j < i - 1; j++)
                System.out.print(' ');
            for (int j = 0; j < 11 - i; j++)
                System.out.print('*');

            System.out.print("  ");

            // d)
            for (int j = 0; j < 10 - i; j++)
                System.out.print(' ');
            for (int j = 0; j < i; j++)
                System.out.print('*');

            System.out.println();
        }
    }
}
