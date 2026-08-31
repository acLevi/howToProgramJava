// Exercise 2.31: TableSquaresCubes.java
// Program that calculates the squares and cubes of the numbers
// from 0 to 10 and prints the resulting values in a formatted table.

public class TableSquaresCubes {
    // main method begins the Java application execution
    public static void main(String[] args) {
        // prints the table header
        System.out.println("number  square  cube");

        // prints each row with the number, its square, and its cube
        // %-6d: left-aligns the number in a 6-character-wide column
        // %-8d: left-aligns the square in an 8-character-wide column
        // %d%n: prints the cube and moves to the next line
        System.out.printf("%-6d %-8d %d%n", 0, 0 * 0, 0 * 0 * 0);
        System.out.printf("%-6d %-8d %d%n", 1, 1 * 1, 1 * 1 * 1);
        System.out.printf("%-6d %-8d %d%n", 2, 2 * 2, 2 * 2 * 2);
        System.out.printf("%-6d %-8d %d%n", 3, 3 * 3, 3 * 3 * 3);
        System.out.printf("%-6d %-8d %d%n", 4, 4 * 4, 4 * 4 * 4);
        System.out.printf("%-6d %-8d %d%n", 5, 5 * 5, 5 * 5 * 5);
        System.out.printf("%-6d %-8d %d%n", 6, 6 * 6, 6 * 6 * 6);
        System.out.printf("%-6d %-8d %d%n", 7, 7 * 7, 7 * 7 * 7);
        System.out.printf("%-6d %-8d %d%n", 8, 8 * 8, 8 * 8 * 8);
        System.out.printf("%-6d %-8d %d%n", 9, 9 * 9, 9 * 9 * 9);
        System.out.printf("%-6d %-8d %d%n", 10, 10 * 10, 10 * 10 * 10);
    } // end method main
} // end class TableSquaresCubes
