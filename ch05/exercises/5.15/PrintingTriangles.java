/* Exercise 5.15: 
Write an application that displays the following patterns separately, one below the other.
Use loops to generate the patterns. all asterisks (*) must be printed using a single ´System.out.print('*');´ statement,
which ensures the asterisks are printed side by side. A ´System.out.println('');´ statement can be used to display a space for the last two patterns.
No other output statements should be used in the program.
*/

public class PrintingTriangles {
    public static void main(String[] args) {
        // a)
        for (int i=0; i<10; i++){
            for (int j=0; j<i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println();

        // b)
        for (int i=10; i>=0; i--){
            for (int j=0; j<i; j++){
                System.out.print('*');
            }
            System.out.println();
        }

        // c)
        for (int i=10; i>=0; i--){
            for (int j=0; j<10 - i; j++){
                System.out.print(' ');
            }
            for (int k=0; k<i; k++){
                System.out.print('*');
            }
            System.out.println();
        }

        // d)
        for (int i=1; i<=10; i++){
            for (int j=10 - i; j>0; j--) {
                System.out.print(' ');
            }
            for (int k=0; k<i; k++) {
                System.out.print('*');
            }

            System.out.println();
        }
    }
}
