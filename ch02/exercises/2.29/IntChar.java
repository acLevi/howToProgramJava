// Exercise 2.29: IntChar.java
// Program that displays the integer equivalents of the characters
// A, B, C, a, b, c, 0, 1, 2, $, *, +, /, and the blank space.

public class IntChar {
    // main method begins the Java application execution
    public static void main(String[] args) {
        // in Java, characters are stored as integer codes (Unicode);
        // the (int) cast converts a char to its numeric code
        // %d prints each code, separated by a comma and a space
        System.out.printf("Int: %d, %d, %d, %d, %d, %d, %d, %d, %d, %d, %d, %d, %d, %d.",
                  (int) 'A', (int) 'B', (int) 'C', (int) 'a', (int) 'b', (int) 'c',
                  (int) '0', (int) '1', (int) '2', (int) '$', (int) '*', (int) '+',
                  (int) '/', (int) ' ');
    } // end method main
} // end class IntChar
