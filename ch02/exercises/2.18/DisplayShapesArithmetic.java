//  Alternative algorithm for the program that
// display geometric shapes using arithmetic.

public class DisplayShapesArithmetic {

    public static void main(String[] args) {
        
        int h = 9;
        int w = 10;
        drawRectangle(9, 10);
        drawEllipse(5, 5);
    }

    public static void drawRectangle(int height, int width) {
        for (int i = 0; i < height; i++) { // Loops on the vertical axis
            for (int j = 0; j < width; j++) { // Loops on the horizontal axis

                // If the pointer is on the rectangle border, display an *; 
                // otherwise, the pointer is insider the rectangle (empty space)
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Next line
        }
    }

    public static void drawEllipse(int rx, int ry) {
        for (int y = -ry; y <= ry; y++) {
            for (int x = -rx; x <= rx; x++) {
                double eq = (Math.pow(x, 2) / Math.pow(rx, 2)) + (Math.pow(y, 2) / Math.pow(ry, 2));

                if (eq <= 1.05) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
