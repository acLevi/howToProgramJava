/* Exercise 4.4:
Write Java statments to perform each of the following tasks:
a) Use a statement to assign the sum of x and y to z, then increment x by 1;
b) Test whether the variable ´contador´ is greater than 10. If it is, print "The counter is greater than 10."
c) Use a statmente to decrement the variable x by 1, then subtract it from the
variable ´total´ and store the result in the variable ´total´.
*/

public class Tasks {
    public static void main(String[] args) {

        // a)
        int x = 2, y = 1, z = 3;
        z = x++ + y;
        System.out.printf("a) %d%n", z);

        // b)
        int counter = 11;
        if (counter > 10) {
            System.out.println("The counter is greater than 10.");
        }

        // c)
        int total = x + y + z;
        total -= --x;
        System.out.println(total);

        // d)
        int q = 10;
        int divider = 3;
        q %= divider;
        // q = q % divider

        System.out.println(q);
    }
}
