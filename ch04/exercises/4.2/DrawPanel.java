// a) Crie o projeto na captura de tela da esquerda na Figura 4.21. Comece dividindo cada borda em um número igual de incrementos (escolhemos 15 novamente). 
// A primeira linha inicia no canto superior esquerdo e termina um passo à direita na extremidade inferior. 
// Para cada linha sucessiva, move-se para baixo um incremento na borda esquerda e um incremento para a direita na borda inferior. 
// Continue desenhando linhas até alcançar o canto inferior direito. 
// A figura deve ser dimensionada à medida que você redimensiona a janela, de modo que as extremidades sempre toquem as bordas.

// b) Modifique sua resposta da parte (a) para espelhar o projeto em todos os quatro cantos, como mostrado na captura de tela da direita na Figura 4.21

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
