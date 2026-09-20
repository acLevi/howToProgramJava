// a) Create the project shown in the left screenshot of Figure 4.20. This project draws lines starting from the top-left corner, extending them until they cover the top-left half of the panel.
// One approach is to divide the width and height into an equal number of steps (we found that 15 steps work well).
// One end of a line will always be at the top-left corner (0, 0).
// The other end can be found by starting at the bottom-left corner and moving up by one vertical step and to
// the right by one horizontal step. Draw a line between the two endpoints. Continue moving up and taking a step to the
// right to find each successive endpoint. The figure should scale accordingly as you resize the window.

// b) Modify your answer from part (a) so that the lines extend from all four corners, as shown in the right screenshot of Figure 4.20.
// The lines from opposite corners should intersect in the middle.

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {

    public void paintComponent(Graphics g) {

        // chama paintComponent para assegurar quer o painel é exibido corretamente
        super.paintComponent(g);

        int width = getWidth(); // largura total
        int height = getHeight(); // altura total

        int steps = 15;
        int stepWidth = width / steps;
        int stepHeight = height / steps;

        int i = 0;
        while (i < steps) {
            g.drawLine(0, 0, i * stepWidth, height - i * stepHeight);
            g.drawLine(width, height, i * stepWidth, height - i * stepHeight);
            g.drawLine(0, height, width - i * stepWidth, height - i * stepHeight);
            g.drawLine(width, 0, width - i * stepWidth, height - i * stepHeight);

            i++;
        }
    }
} // fim da classe DrawPanel
