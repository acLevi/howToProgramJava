// Exercise 3.1: Modify the addition program in Figure 2.7 to use dialog-based input and output with methods from the JOptionsPane class:
// Figure 2.7: Addition.java
// Addition program that inputs two numbers, then displays their sum

import javax.swing.JOptionPane;

public class AdditionGUI {
    public static void main(String[] args) {

        String n1 = JOptionPane.showInputDialog("Insert the first number: ");
        String n2 = JOptionPane.showInputDialog("Insert the second number: ");

        int x = Integer.parseInt(n1);
        int y = Integer.parseInt(n2);

        String message =
            String.format("%d + %d = %d", x, y, x + y);

        JOptionPane.showMessageDialog(null, message);
    }
}
