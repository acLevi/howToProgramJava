/* Exercise 5.19:
Suppose i = 1, j = 2, k = 3, and m = 2. What does each of the following statements prints?

a) System.out.println(i == 1);
b) System.out.println(j == 1);
c) System.out.println((i >= 1) && (j < 4));
d) System.out.println((m <= 99) & (k < m));
e) System.out.println((j >= i) || (k == m));
f) System.out.println((k + m < j) | (3 - j >= k));
g) System.out.println(!(k > m));
*/

public class Testing {
    public static void main(String[] args) {
        int i = 1, j = 2, k = 3, m = 2;

        System.out.print("a) System.out.println(i == 1): ");
        System.out.println(i == 1);

        System.out.print("System.out.println(j == 1): ");
        System.out.println(j == 2);

        System.out.print("c) System.out.println((i >= 1) && (j < 4)): ");
        System.out.println((i >= 1) && (j < 4));

        System.out.print("d) System.out.println((m <= 99) && (k < m)): ");
        System.out.println((m <= 99) & (k < m));

        System.out.print("e) System.out.println((j >= i) || (k == m)): ");
        System.out.println((j >= i) || (k == m));

        System.out.print("f) System.out.println((k + m < j) | (3 - j >= k)): ");
        System.out.println((k + m < j) | (3 - j >= k));

        System.out.print("g) System.out.println(!(k > m)): ");
        System.out.println(!(k > m));
    }
}
