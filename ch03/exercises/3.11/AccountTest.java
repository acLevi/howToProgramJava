// Exercise 3.11: AccountTest class modified to test the withdraw method.
// Demonstrates the manipulation of Account objects with deposits and withdrawals,
// including insufficient balance validation.

import java.util.Scanner; // imports the Scanner class for user input

// Test class that creates Account objects and interacts with them through
// user input (Scanner), demonstrating the use of Account class methods.
public class AccountTest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // creates the Scanner to read keyboard input

    // Creates two Account objects:
    //   - account1: holder "Jane Green" with an initial balance of $50.00 (valid)
    //   - account2: holder "John Blue" with an initial balance of -$7.54 (invalid → balance will be 0.00)
    // This demonstrates how the constructor validates the balance: negative values
    // are rejected and the balance variable keeps the default value (0.0).
    Account account1 = new Account("Jane Green", 50.00);
    Account account2 = new Account("John Blue", -7.54);

    // Displays the initial balance of each account.
    // account1 will show $50.00; account2 will show $0.00 (since the negative balance was rejected).
    System.out.printf("%s balance: $%.2f %n",
        account1.getName(), account1.getBalance());

    System.out.printf("%s balance: $%.2f %n%n",
        account2.getName(), account2.getBalance());

    // --- PART 1: Deposits ---
    // Asks the user for the deposit amount for Jane Green's account
    // and adds it using the deposit() method.
    System.out.printf("Enter the deposit amount for %s's account ($): ", account1.getName());
    double depositAmount = input.nextDouble(); // reads the value typed by the user
    System.out.printf("Adding $%.2f to %s's account. %n%n", depositAmount, account1.getName());
    account1.deposit(depositAmount); // calls the deposit method to add the amount

    // Asks for the deposit for John Blue's account.
    // Note that the depositAmount variable is reused — there is no need
    // to create a new variable, since the previous value was already processed.
    System.out.printf("Enter the deposit amount for %s's account ($): ", account2.getName());
    depositAmount = input.nextDouble();
    System.out.printf("Adding $%.2f to %s's account. %n%n", depositAmount, account2.getName());
    account2.deposit(depositAmount);

    // Displays the balances after the deposits to confirm they were added correctly.
    System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
    System.out.printf("%s balance: $%.2f %n%n", account2.getName(), account2.getBalance());

    // --- PART 2: Withdrawals ---
    // Asks the user for the withdrawal amount for Jane Green's account.
    // The withdraw() method validates whether the amount exceeds the balance or is negative.
    System.out.printf("Enter the withdraw amount for %s's account ($): ", account1.getName());
    double withdrawAmount = input.nextDouble(); // reads the withdrawal amount
    account1.withdraw(withdrawAmount); // calls withdraw — validates and subtracts or shows an error

    // Asks for the withdrawal for John Blue's account.
    // If the requested amount is greater than the balance, an error message
    // will be displayed and the balance will remain unchanged.
    System.out.printf("Enter the withdraw amount for %s's account ($): ", account2.getName());
    withdrawAmount = input.nextDouble();
    account2.withdraw(withdrawAmount);

    // Displays the final balances after the withdrawals.
    // This is the final state of the accounts after all operations.
    System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
    System.out.printf("%s balance: $%.2f %n%n", account2.getName(), account2.getBalance());
  } // end of main method
} // end of AccountTest class
