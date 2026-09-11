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

public class Account {
  private String name;
  private double balance;

  public Account(String name, double balance) {
    this.name = name;

    if (balance > 0.0) {
      this.balance = balance;
    }
  }

  public void deposit(double depositAmount) {
    if (depositAmount > 0.0) {
      balance = balance + depositAmount;
    }
  }


  public void withdraw(double withdrawAmount) {
    if (withdrawAmount > balance || withdrawAmount < 0) {
      System.out.printf("Withdrawal ($%.2f) amount exceeded account balance ($%.2f) %n%n",
          withdrawAmount, balance);
    } else {
      balance = balance - withdrawAmount;
    }
  }

  public double getBalance() {
    return balance;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}