/* Exercise 4.19:
A large company pays it salespeople on a comission basis. Salespeople receive R$ 200 per week plus 9% of their gross sales for that period.
For example, a saleperson who sells R$ 5,000 worth of merchandise in a week receives R$ 200 plus 9% of R$ 5,000, for a total of R$ 650.
You have been provided with a list of the items sold by each salesperson. The values of these items are as follows:

  Item Value
  1    239.99
  2    129.75
  3    99.95
  4    350.89

Develop a Java application that accepts input regarding the items sold by a salesperson during the past week and calcualtes and displays the salesperson's earnings.
There is no limit to the number of items that can be sold.

# pseudocode

initialize accumulatedComission to 200.00
initialize accumulatedValue to 0
initialize totalItemsSold to 0
initialize exitValue to 0

WHILE exitValue is not equal to -1

    prompt for the item number sold by the salesperson
    read the item number sold by the salesperson
    prompt, amount of the item sold
    read amount of the item sold

    if item number sold is equal to 1
        accumulatedValue += 239.99 * amount
        accumulatedCommission += (239.99 * 0.09)  * amount
        increment totalItemsSold
        
    if item number sold is equal to 2
        accumulatedValue += 129.75 * amount
        accumulatedCommission += (129.75 * 0.09) * amount
        increment totalItemsSold

    if item number sold is equal to 3
        accumulatedValue += 99.95 * amount
        accumulatedCommission += (99.95 * 0.09) * amount
        increment totalItemsSold

    if item number sold is equal to 4
        accumulatedValue += 350.89 * amount
        accumulatedComission += (350.89 * 0.09) * amount
        increment totalItemsSold

    prompt if user wants to continue [-1 to exit]
    read if user wants to continue
end WHILE

display total itemSold, accumulatedValue, accumulatedComission;
*/

import java.util.Scanner;

public class ComissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double accumulatedValue = 0.0, accumulatedComission = 200.0;
        int totalItemsSold = 0, exit = 0;

        while (exit != -1) {
            int itemSold;
            int amount;

            System.out.print("Insert the item's ID [1-4]: ");
            itemSold = input.nextInt();
            System.out.print("Amount: ");
            amount = input.nextInt();

            if (itemSold < 1 || itemSold > 4) {
                System.out.println("Invalid item");
            }

            if (itemSold == 1) {
                accumulatedValue += 239.99 * amount;
                accumulatedComission += (239.99 * 0.09) * amount;
                totalItemsSold++;
            }

            if (itemSold == 2) {
                accumulatedValue += 129.75 * amount;
                accumulatedComission += (129.75 * 0.09) * amount;
                totalItemsSold++;
            }

            if (itemSold == 3) {
                accumulatedValue += 99.95 * amount;
                accumulatedComission += (99.95 * 0.09) * amount;
                totalItemsSold++;
            }

            if (itemSold == 4) {
                accumulatedValue += 350.89 * amount;
                accumulatedComission += (350.89 * 0.09) * amount;
                totalItemsSold++;
            }

            System.out.print("Want to continue [type -1 to exit]? ");
            exit = input.nextInt();
            System.out.println();
        }

        System.out.printf("Total items sold: %d %nTotal sales value: R$%.2f %nTotal commission: R$%.2f %n", totalItemsSold, accumulatedValue, accumulatedComission);
        input.close();
    }
}
