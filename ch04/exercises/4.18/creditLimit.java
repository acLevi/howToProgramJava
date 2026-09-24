/* Exercise 4.18: creditLimit.java
Develop a Java application that determines whether a departament store customer has exceeded their credit limit on a charge account.
For each customer, the following data is available:

a) Account number.
b) Beginning-of-month balance.
c) Total of all items charged to the customer during the month.
d) Total of credits applied to the customer during the month.
e) Authorized credit limit.

The program should input all these data as integers, calculate the new balance (=beginning balance + charges - credits),
display the new balance, and determine whether the new balance, and determine whether the new balance exceeds the customer's credit limit.
For customers whose credit limit has been exceededm the program should display the message "Credit limit exceeded".

# pseudocode

initialize account ID
initialize beginning balance
initialize credit limit
initialize total charges
initialize total credits
initialize new balance
initialize customer counter to 1
initialize exit to 1

WHILE exit is not equal to -1 DO

    display customer counter

    prompt for account ID
    read account ID

    prompt for beginning balance
    read beginning balance

    prompt for credit limit
    read credit limit

    prompt for total charges
    read total charges

    prompt for total credits
    read total credits

    new balance = beginning balance + total charges - total credits

    increase customer counter by 1

    display new balance

    IF new balance is greater than credit limit THEN
        display "Credit limit exceeded"
    END IF

    prompt the user to enter -1 to exit or another integer to continue
    read exit

END WHILE
*/

import java.util.Scanner;

public class creditLimit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int accountId, initialMonthBalance, totalCust1omerItems, totalCustomerCredit, creditLimit, newMonthBalance, counter = 1, exit = 1;

        while (exit != -1) {

            System.out.printf("--- Customer %d --- %n", counter);
            
            System.out.print("Enter the Account ID: ");
            accountId = input.nextInt();

            System.out.print("Enter the beginning month balance: ");
            initialMonthBalance = input.nextInt();

            System.out.print("Enter the customer credit limit: ");
            creditLimit = input.nextInt();

            System.out.print("Enter the total of all items charged to the customer during the month: ");
            totalCustomerItems = input.nextInt();

            System.out.print("Enter the of credits applied to the customer during the month: ");
            totalCustomerCredit = input.nextInt();

            newMonthBalance = initialMonthBalance + totalCustomerItems - totalCustomerCredit;

            counter++;

            System.out.printf("New balance: %d%n", newMonthBalance);

            if (newMonthBalance > creditLimit) {
                System.out.println("Credit limit exceeded");
            }

            System.out.println();

            System.out.print("Want to continue? [type -1 to exit or any integer to continue]: ");
            exit = input.nextInt();
        }

        input.close();
    }
}
