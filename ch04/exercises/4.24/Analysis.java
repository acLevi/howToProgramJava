/* Exercise 4.24
Modify the program in Figure 4.12 to validate its inputs.
For any inputs, if the entered value is anything other than 1 or 2, continue
the loop until the user enters a valid value.
*/

import java.util.Scanner;

public class Analysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passes = 0, failures = 0, studentCounter = 1;

        while (studentCounter <= 10) {
            int result = 0;

            while (result != 1 && result != 2) {
                System.out.printf("(%d) Enter result (1 = pass, 2 = fail): ", studentCounter);
                result = input.nextInt();
            }

            if (result == 1) {
                passes += 1;
            } else {
                failures += 1;
            }

            studentCounter++;
        }

        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

        if (passes > 8) {
            System.out.println("Bonus to instructor!");
        }

        input.close();
    }
}
