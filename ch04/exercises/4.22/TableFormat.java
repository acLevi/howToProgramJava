/* Exercise 4.22
Write a Java application that uses a loop to print the following table of values:

N   10*N   100*N  1000*N
1   10     100    1000
2   20     200    2000
3   30     300    3000
4   40     400    4000
5   50     500    5000
*/

public class TableFormat {
    public static void main(String[] args) {
        int counter = 1;
        
        System.out.printf("%-4sN*%-4dN*%-5dN*%-6d %n", "N",10, 100, 1000);
        while (counter <= 5) {
            System.out.printf("%-4d%-6d%-7d%-8d %n", counter, counter * 10, counter * 100, counter * 1000);

            counter++;
        }
    }
}
