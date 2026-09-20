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
