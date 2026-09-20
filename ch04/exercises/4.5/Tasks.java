/* Exercise 4.5
Write a Java statement to perform each of the following tasks:
a) Declare an int variable named sum and initialize it to 0;
b) Declare an int variable named x and initialize it to 0;
c) Add variable x to variable sum and assign the result to variable sum.
d) Print "The sum is:" followed by the value of variable sum;
*/

public class Tasks {
    public static void main(String[] args) {
        int sum = 0, x = 1;
        sum += x;
        System.out.printf("The sum is: %d%n", sum);
    }
}
