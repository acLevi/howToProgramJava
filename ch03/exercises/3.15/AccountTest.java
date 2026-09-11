/* Exercise 3.15:
In the AccountTest class show in Figure 3.9 (/ch03/examples/), he main method contains six statements, each displaying the name and balance of an Account object.
Study these statements, and you will notice that they differ only in the Account object being manipulated - account1 or account2.
In this exercise, you will define a new method, displayAccount, containing a copy of that output statement.
The method's parameter will be an Account object, and the method will output its name and balance.
Then, you will replace the six duplicate statements in main with calls to displayAccount, passing the specific Account object to be displayerd as an argurment.
Modify the AccountTest class from Figure 3.9 to declare the following displayAccount method after the closing brace of main and before the closing brace of the AccountTest class.
Remember that main is a static method, so it can be called without first creating an object of the class in which it is declared.
When main needs to call another method in the same class without first creating an object of that class, the other method must also be declared static.
After completing the declatration of displayAccount, modify main to replace the statements that display the name and balance of each Account
with calls to displayAccount - each receiving either the account1 or account2 object as its argument, as appropriate.
Then, test the updated AccountTest class to ensure it produces the same output show in Figure 3.9.
*/

import java.util.Scanner;

public class AccountTest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Account account1 = new Account("Jane Green", 50.00);
    Account account2 = new Account("John Blue", -7.54);

    displayAccount(account1);
    displayAccount(account2);

    System.out.printf("Enter the deposit amount for %s's account ($): ", account1.getName());
    double depositAmount = input.nextDouble();
    System.out.printf("Adding $%.2f to %s's account. %n%n", depositAmount, account1.getName());
    account1.deposit(depositAmount);

    System.out.printf("Enter the deposit amount for %s's account ($): ", account2.getName());
    depositAmount = input.nextDouble();
    System.out.printf("Adding $%.2f to %s's account. %n%n", depositAmount, account2.getName());
    account2.deposit(depositAmount);

    displayAccount(account1);
    displayAccount(account2);

    System.out.printf("Enter the withdraw amount for %s's account ($): ", account1.getName());
    double withdrawAmount = input.nextDouble();
    account1.withdraw(withdrawAmount);

    System.out.printf("Enter the withdraw amount for %s's account ($): ", account2.getName());
    withdrawAmount = input.nextDouble();
    account2.withdraw(withdrawAmount);

    displayAccount(account1);
    displayAccount(account2);

    input.close();
  }

  public static void displayAccount(Account accountToDisplay) {
    System.out.printf("%s balance: $%.2f %n", accountToDisplay.getName(), accountToDisplay.getBalance());
  }
}
