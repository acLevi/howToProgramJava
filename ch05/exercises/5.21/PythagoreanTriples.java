/* Exercise 5.21
A right-angled triangle can have sides with integer lengths. A set of three integer values representing the side lenghts of a right-angled triangle is called a Pythagorean triple. The lenghts of the three sides must satisfy the relationships where the sum of the squares of two of the sides equals the square of the hypotenuse. Write an application to display a table of Pythagorean triples for ´side1´, ´side2´, and ´hypotenuse´, where none of these values exceed 500. Use a triple-nested ´for´ loop to test all possibilities. This is a "brute-force" computational method. In more advanced computer science courses, you will learn that for many interesting problems, there is no know algorithmic approach other than using pure brute force.
*/


public class PythagoreanTriples {
    public static void main(String[] args) {
        for (int side1 = 1; side1 <= 500; side1++) {
            for (int side2 = side1; side2 <= 500; side2++) {
                for (int hypotenuse = 1; hypotenuse <= 500; hypotenuse++) {
                    if (side1 * side1 + side2 * side2 == hypotenuse * hypotenuse) {
                        System.out.printf("%d\t%d\t%d%n", side1, side2, hypotenuse);
                    }
                }
            }
        }
    }
}
