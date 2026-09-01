// Figura 3.1: Account.java
// Classe Account que contém uma variável de instância name e métodos para configurar e obter seu valor.

public class Account {
    private String name; // variável de instância
    private double balance; // variável de insância

    // Construtor de Account que recebe dois parâmetros
    public Account(String name, double balance) {
        this.name = name; // atribui name à variável de instância name

        // valida que balance é maior que 0.0; se não for,
        // a variável de instância balance mantém seu valor inicial padrão de 0.0
        if (balance > 0.0) // se o saldo for válido
            this.balance = balance;
    }

    // método que depostita (adiciona) apenas uma quantia válida no saldo
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) // se depositAmount for válido
            balance = balance + depositAmount; // o adiciona ao saldo
    }

    // método retorna o saldo da conta
    public double getBalance() {
        return balance;
    }

    // método para definir o nome
    public void setName(String name) {
        this.name = name; // armazena o nome
    }

    // método para recuperar o nome do objeto
    public String getName() {
        return name; // retorna valor do nome para o chamador
    }
} // fim da clase Account