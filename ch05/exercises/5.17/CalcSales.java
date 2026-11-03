/* Exercises 5.17: An online retailer sells five products with the following retail prices:

- product1, $2.98;
- product2, $4.50;
- product3, $9.98;
- product4, $4.49;
- product5, $6.87;

Write an application that reads a series of pairs of numbers as follows:
a) product number
b) quantity sold

Your program should use a ´switch´ statment to determine the retail price of each product. You must calculate and display the total retail value of all products sold. Use a sentinel-controlled loop to determine when the program should stop the loop and display the final results.
*/

import java.util.Scanner;

public class CalcSales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int product, quantity;
        double total = 0;

        System.out.print("Insert the product's number (-1 to exit): ");
        product = input.nextInt();

        while (product != -1) {
            System.out.print("Enter the quantity sold: ");
            quantity = input.nextInt();

            switch (product) {
                case 1:
                    total += quantity * 2.98;
                    break;
                case 2:
                    total += quantity * 4.50;
                    break;
                case 3:
                    total += quantity * 9.98;
                    break;
                case 4:
                    total += quantity * 4.49;
                    break;
                case 5:
                    total += quantity * 6.87;
                    break;
            
                default:
                    System.out.println("Invalid Product");
            }
            System.out.print("Insert the product's number (-1 to exit): ");
            product = input.nextInt();
        }
        System.out.printf("Total de vendas: $%.2f%n", total);

        input.close();
    }
}
