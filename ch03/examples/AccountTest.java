// Figura 3.2: AccountTest.java
// Cria e manipula um objeto Account.

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.54);

        // exibie o saldo inicial de cada objeto
        System.out.printf("%s balance: $%.2f %n", 
            account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n%n",
            account2.getName(), account2.getBalance());

        // cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1 "); // prompt
        double depositAmount = input.nextDouble(); // obtém a entrada do usuário
        System.out.printf("%n adding %.2f to account1 balance%n%n: ", depositAmount);
        account1.deposit(depositAmount);

        // exibie os saldos
        System.out.printf("%s balance: $%.2f %n", 
            account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n%n", 
            account2.getName(), account2.getBalance());
    } // fim da classe main
} // fim da classe AccountTest