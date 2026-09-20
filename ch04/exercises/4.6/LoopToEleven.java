// Combine the statements writeen in Exercise 4.5 into a Java application that calculates and prints the sum of the integers from 1 to 10.
// Use the ´while´ statement to loop through the calculation and increment statements. The loop should terminate when the value of ´x´ becomes 11.

public class LoopToEleven {

    public static void main(String[] args) {
        int x = 0, sum = 0;
        
        while (x != 11) {
            sum += x;
            x++;
        }

        System.out.printf("The sum of the integers from 1 to 10: %d. %n", sum);
    }
}