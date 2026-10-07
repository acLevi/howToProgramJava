/* Exercise 5.2:
Write a Java statement or set of Java statements to perform each of the following tasks:
a) Sum the odd integers between 1 and 99 using a for statement. Assume that the integer variables sum and count have been declared.
b) Calcute the value of 2.5 raised to the power of 3, using the pow method.
*/

public class Tasks {
    public static void main(String[] args) {
        // a)
        int sum = 0;

        for (int count = 1; count <= 100; count++) {
            if (count % 2 != 0) {
                sum += count;
            }
        }
        System.out.printf("Sum of the odd integers between 1 and 99: %d%n%n", sum);

        // b)
        double cube = Math.pow(2.5, 3);
        System.out.printf("2.5 raised to the power of 3: %.2f%n%n", cube);

        // c)
        int i = 1;
        while (i <= 20) {
            System.out.print(i);

            if (i % 5 == 0) {
                System.out.println();
            } else {
                System.out.print('\t');
            }

            i++;
        }

        System.out.println();

        // d)
        for (i = 1; i <= 20; i++){
            System.out.print(i);

            if (i % 5 == 0) {
                System.out.println();
            } else {
                System.out.print('\t');
            }          
        }
    }
}
