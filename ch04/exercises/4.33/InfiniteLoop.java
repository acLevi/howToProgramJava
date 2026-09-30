/* Exercise 4.33:
Write an application that keeps displaying multiples of the integer 2 in the command window
namely, 2, 4, 8, 16, 32, 64, and so on. Your loop should not terminate (that is, it must create an infinite loop).
What happens when you run this program.

*/

public class InfiniteLoop {
    public static void main(String[] args) {
        int number = 1, counter = 0;

        while (counter < 32) {
            System.out.println(number = number * 2);  
            
            counter++;
        }

        System.out.printf("From the thirtieth loop the number exceeds the java int type limit. (%d) %n", Integer.MAX_VALUE);
    }
}
