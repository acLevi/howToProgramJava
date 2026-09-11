// Exercise 3.14: Create a class named Date that includes three instance variables: month, day, year.
// Provide a constructor that initializes the three instance variavles, assuming the provided values are correct.
// Provide a set method and a get method for each instance variable.
// Include a displayDate method that displays the month, day, and year separeted by forward slashes
// Write a test application named DateTest demonstrates the capabilities of the Date class.

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        setDay(day);

        setMonth(month);

        setYear(year);
    }

    public String displayDate() {
        return String.format("%d/%d/%d", this.getMonth(), this.getDay(), this.getYear());
    }

    // getters
    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    // setters
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
