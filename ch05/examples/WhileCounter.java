// Figura 5.1: WhileCounter.java
// Repetição controlada por contador com a instrução de repetição while.

package ch05.examples;

public class WhileCounter {
    public static void main(String[] args) {
        int counter = 1; // declara e inicializa a variável de controle

        while (counter <= 10) { // condição de continuação
            System.out.printf("%d ", counter);
            ++counter; // variável de controle de incremento
        }

        System.out.println();
    }
} // fim da classe WhileCounter
