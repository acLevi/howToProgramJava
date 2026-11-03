/* Exercise 5.18:
Modify thea application in Figure 5.6 tu use only integers to calculate compound interest. [Hint] Treat all monetary amounts as integers representing cents. Then, split the result into its dollar and cent components using the division and remainder operations, respectively. Insert a comma between the dollar and cent parts.]

*/
public class Interest {
    public static void main(String[] args) {
        long amount;
        long principal = 100000;
        int rate = 5;

        System.out.printf("%s%20s %n", "Year", "Amount on deposit");

        amount = principal;

        for (int year = 1; year <= 10; ++year) {

            amount = amount * (100 + rate) / 100;

            long dollars = amount / 100;
            long cents = amount % 100;

            System.out.printf("%4d%,17d,%02d%n", year, dollars, cents);
        }
    }
}
