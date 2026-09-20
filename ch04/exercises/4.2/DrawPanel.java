// a) Create the design shown in the left screenshot of Figure 4.21. Start by dividing each edge into an equal number of increments (we chose 15 again).
// The first line starts at the top-left corner and ends one increment to the right along the bottom edge.
// For each successive line, move down one increment along the left edge and one increment to the right along the bottom edge.
// Continue drawing lines until you reach the bottom-right corner.
// The figure should scale as you resize the window, so that the endpoints always touch the edges.

// b) Modify your answer from part (a) to mirror the design in all four corners, as shown in the right screenshot of Figure 4.21.

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
            g.drawLine(0, i * stepHeight, (i + 1) * stepWidth, height);
            g.drawLine(width, height - i * stepHeight, width - (i + 1) * stepWidth, 0);
            g.drawLine(0, height - i * stepHeight, (i + 1) * stepWidth, 0);
            g.drawLine(width, i * stepHeight, width - (i + 1) * stepWidth, height);

            i++;
        }
    }
} // fim da classe DrawPanel
