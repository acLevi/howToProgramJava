/* Exercise 4.33:
Write an application that keeps displaying multiples of the integer 2 in the command window
namely, 2, 4, 8, 16, 32, 64, and so on. Your loop should not terminate (that is, it must create an infinite loop).
What happens when you run this program.

ANSWER:
The loop never ends, and int eventually overflows. The values double up to 1073741824 (2^30),
which is the last one that fits in a 32-bit int (Integer.MAX_VALUE = 2147483647). The next
value, 2147483648 (2^31), exceeds that limit, wraps around to -2147483648, and every value
after that doubles from 0, so the command window fills with zeros forever until you stop the
program with Ctrl+C.
*/

public class InfiniteLoop {
    public static void main(String[] args) {
        int number = 1;

        while (true) {
            number *= 2;
            System.out.println(number);
        }
    }
}
