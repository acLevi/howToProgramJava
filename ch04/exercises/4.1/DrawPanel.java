// a ) Crie o projeto na captura de tela esquerda da Figura 4.20. Esse projeto desenha linhas do canto superior esquerdo, estendendo-as até que cubram a metade superior esquerda do painel. 
// Uma abordagem é dividir a largura e altura em um número igual de passos (descobrimos que 15 passos funcionam bem). 
// A primeira extremidade de uma linha sempre estará no canto superior esquerdo (0, 0).
// A segunda extremidade pode ser encontrada iniciando no canto inferior esquerdo e movendo-se para cima em um passo vertical e para
// a direita em um passo horizontal. Desenhe uma linha entre as duas extremidades. Continue movendo-se para cima e para o passo à
// direita a fim de encontrar cada extremidade sucessiva. A figura deve ser dimensionada de maneira correspondente à medida que você redimensiona a janela.

// b) Modifique sua resposta da parte (a) para que as linhas se estendam dos quatro cantos, como mostrado na captura de tela da direita na Figura 4.20. 
// As linhas de cantos opostos devem se cruzar no meio.

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
