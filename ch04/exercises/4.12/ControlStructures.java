// Exercise 4.12: Describe the two ways in which control instructions can be combined.

// Program that iterates through integers from 1 to 10 and shows whether the number is even or odd.
public class ControlStructures {
    public static void main(String[] args) {
        int counter = 1;

        while (counter != 11) {
            if (counter % 2 == 0) {
                System.out.printf("%d is even %n", counter);
            } else {
                System.out.printf("%d is odd %n", counter);
            }
            counter++;
        }
    }
}
