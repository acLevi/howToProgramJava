/* Exercise 4.34: 
What is wrong with the following statement? Provide the correct statement to add 1 to the sum X and Y.

System.out.println(++(x + y));

*/

public class CorrectStatement {
    public static void main(String[] args) {
        int x = 6, y = 7;

        System.out.println(++x + y);
    }
}
