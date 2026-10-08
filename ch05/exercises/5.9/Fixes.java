// Exercise 5.9: Locate and correct the error(s) in each of the following code segments:

public class Fixes {
    public static void main(String[] args) {
        // a)
        for (int i = 100; i >= 1; i--) {
            System.out.println(i);
        }
    
        System.out.println();

        // b)
        int value = 4;
        switch (value % 2) {
            case 0:
                System.out.println("Even integer");
                break;
            case 1:
                System.out.println("Odd integer");
        }

        System.out.println();

        // c)
        for (int i = 19; i >= 1; i -= 2) {
            System.out.println(i);
        }

        System.out.println();

        // d)
        int counter = 2;

        do {
            System.out.println(counter);
            counter += 2;
        } while (counter < 100);
    }
}