// Exercise 3.11: Modify class Account (Example 3.8) to add a withdraw method
// that withdraws money from an Account. If the withdrawal amount exceeds the balance,
// the balance remains unchanged and an error message is displayed.
// Modify the AccountTest class (Figure 3.9) to test the withdraw method.

// Account class that represents a simple bank account.
// Demonstrates encapsulation: the instance variables are private and
// accessed only through public methods (getters/setters).
public class Account {
  private String name;    // name of the account holder
  private double balance; // account balance (private instance variable)

  // Account constructor that receives the name and the initial balance.
  // If the provided balance is negative or zero, the balance variable
  // keeps its default value (0.0), ensuring the account never starts
  // with a negative balance — this protects data integrity.
  public Account(String name, double balance) {
    this.name = name; // assigns the name parameter to the instance variable

    // validates that the balance is greater than 0.0; otherwise
    // balance keeps its default value of 0.0
    if (balance > 0.0) {
      this.balance = balance;
    }
  }

  // Method that deposits (adds) an amount to the account balance.
  // The if (depositAmount > 0.0) validation ensures that only positive
  // values are accepted — it prevents invalid or negative deposits.
  public void deposit(double depositAmount) {
    if (depositAmount > 0.0) {
      balance = balance + depositAmount;
    }
  }

  // Method that withdraws an amount from the account.
  // Two validations are performed:
  //   1. withdrawAmount > balance — amount exceeds the available balance
  //   2. withdrawAmount < 0 — negative amount (attempted fraud/error)
  // In both cases the balance remains unchanged and an error message
  // is displayed showing the requested amount and the current balance.
  public void withdraw(double withdrawAmount) {
    if (withdrawAmount > balance || withdrawAmount < 0) {
      System.out.printf("Withdrawal ($%.2f) amount exceeded account balance ($%.2f) %n%n",
          withdrawAmount, balance);
    } else {
      balance = balance - withdrawAmount; // subtracts the amount from the balance
    }
  }

  // Method that returns the current account balance.
  // It is a getter — it allows external classes to read the balance
  // without being able to modify it directly (encapsulation).
  public double getBalance() {
    return balance;
  }

  // Method that sets (changes) the name of the account holder.
  // It is a setter — it controls write access to the name variable.
  public void setName(String name) {
    this.name = name;
  }

  // Method that returns the name of the account holder.
  // It is a getter — it allows reading the name without direct exposure
  // of the variable.
  public String getName() {
    return name;
  }
}
