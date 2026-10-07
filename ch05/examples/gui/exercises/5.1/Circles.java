/* Exercise 5.1:
Draw 12 concentric circles in the center of a JPanel (Figure 5.29). The innermost circle must have a radius of 10 pixels,
and each successive circle must have a radius 10 pixels larger than the previous one. Start by locating the center of the JPanel.
To find the top-left corner of a circle, move up by one radius and to the left by one radius from the center.
The width and height of the bounding rectangle are equal to the circle's diameter (i.e., twice the radius).*/

import java.awt.Graphics;
import javax.swing.JPanel;

public class Circles extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        for (int i = 1; i <= 12; i++) {
            int raio = i * 10;
            g.drawOval(centerX - raio, centerY - raio, raio * 2, raio * 2);
        }
    }
}
