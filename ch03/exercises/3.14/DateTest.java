// Exercise 3.14: Create a class named Date that includes three instance variables: month, day, year.
// Provide a constructor that initializes the three instance variavles, assuming the provided values are correct.
// Provide a set method and a get method for each instance variable.
// Include a displayDate method that displays the month, day, and year separeted by forward slashes
// Write a test application named DateTest demonstrates the capabilities of the Date class.

public class DateTest {
    public static void main(String[] args) {
        
        Date date1 = new Date(9, 9, 2026);
        Date date2 = new Date(18, 11, 2003);
        Date date3 = new Date(28, 9, 1974);
        Date date4 = new Date(7, 1, 1977);
        Date date5 = new Date(-23, 0, 23);


        System.out.printf("1: %s %n2: %s %n3: %s %n4: %s %n5: %s %n%n", 
        date1.displayDate(), 
        date2.displayDate(),
        date3.displayDate(),
        date4.displayDate(),
        date5.displayDate()
        );

        date5.setDay(23);
        date5.setMonth(-154);
        date5.setYear(2026);

        System.out.printf("new 5: %s %n%n", date5.displayDate());
    }
}
