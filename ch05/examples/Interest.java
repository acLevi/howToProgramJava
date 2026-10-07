// Figura 5.6: Interest.java
// Cálculos de juros compostos com for.

package ch05.examples;

public class Interest {
    public static void main(String[] args) {
        double amount; // quantia em depósito ao fim de cada ano
        double principal = 1000.0; // quantia inicial antes dos juros
        double rate = 0.05; // taxa de juros

        // exibe cabeçalhos
        System.out.printf("%s%20s %n", "Year", "Amount on deposit");

        // calcula quantidade de depósito para cada um dos dez ano
        for (int year = 1; year <= 10; ++year) {
            // calcula quantidade de depósito para cada um dos dez anos
            amount = principal * Math.pow(1.0 + rate, year);

            // exibie o ano e a quantidade
            System.out.printf("%4d%,20.2f%n", year, amount);
        }
    }
} // fim da classe Interest
