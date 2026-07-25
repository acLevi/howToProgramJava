// Exercício 2.6: Programa que soma 3 números inteiros
//  e exibe o resultado

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, y, z, result;

        System.out.print("Digite o primeiro número inteiro: ");
        x = input.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        y = input.nextInt();
        System.out.print("Digite o terceiro número inteiro: ");
        z = input.nextInt();

        result = x * y * z;

        System.out.printf("A produto entre %d, %d e %d é %d.", x, y, z, result);
    }
}
