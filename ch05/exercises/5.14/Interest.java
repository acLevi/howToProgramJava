/* Exercise 5.14:
Modify the compound interest application from Figure 5.6 to repeat the steps for interest rates of
5%, 7%, 8%, 9%, and 10%. Use a for loop to bary the interest rate.
*/

public class Interest {
    public static void main(String[] args) {
        double amount;
        double quantity = 1000.0;
        
        
        for (int i = 1; i <= 5; i++){
            double rate = 0.05;
            
            switch (i) {
                case 2:
                    rate = 0.07;
                    break;
                case 3:
                    rate = 0.08;
                    break;
                case 4:
                    rate = 0.09;
                    break;
                case 5:
                    rate = 0.1;
            }

            System.out.printf("%s %20s %s %.2f%%%n", "Year", "Amount on deposit", "Interest:", rate * 100);
            for (int year = 1; year <= 10; ++year) {
                amount = quantity * Math.pow(1.0 + rate, year);
    
                System.out.printf("%4d%,20.2f%n", year, amount);
            }

            System.out.println();
        }

    }
}
