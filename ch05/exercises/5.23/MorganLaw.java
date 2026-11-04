/* Exercise 5.23:
In this chapter, we discussed the logical operators &&, &, ||, |, ^, and !. De Morgan's laws can sometimes make it more convenient to express a logical condition. These laws state that the expression !(condition1 && condition2) is logically equivalent to the expression (!condition1 || condition2). Furthermore, the expression !(condition1 || condition2) is logically equivalent to the expression (!condition1 && !condition2). Use De Morgan's laws to write equivalent expressions for each of the following, the write an application to demonstrate that both the original expression for each of the following, then write an application to demonstrate that both the original expression and the new expression produce the same value in each case:

    a) !(x < 5) && !(y >=)
    b) !(a == b) || !(g != 5)
    c) !((x <= 8) && (y > 4))
    d) !((i > 4) || (j <= 6))
*/


public class MorganLaw {
    public static void main(String[] args) {
        int x = 10, y = 5, a = 3, b = 4, g = 5, i = 2, j = 8;

        // a)
        System.out.println("a)");
        System.out.println(!(x < 5) && !(y >= 7));
        System.out.println((x >= 5) && (y < 7));
        System.out.println();

        // b)
        System.out.println("b)");
        System.out.println(!(a == b) || !(g != 5));
        System.out.println((a != b) || (g == 5));
        System.out.println();

        // c)
        System.out.println("c)");
        System.out.println(!((x <= 8) && (y > 4)));
        System.out.println(x > 8 || (y <= 5));
        System.out.println();

        // d)
        System.out.println("d)");
        System.out.println(!((i > 4) || (j <= 6)));
        System.out.println((i <= 4) && (j > 6));
        System.out.println();
    }
}
