public class HeartRates {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private int currentYear = 2026;

    public HeartRates(String firstName, String lastName, int birthDay, int birthMonth, int birthYear) {
        this.firstName = firstName;

        this.lastName = lastName;

        this.birthDate = new Date(birthDay, birthMonth, birthYear);
    }

    public int getAge() {
        return currentYear - this.getBirthYear();
    }

    public int getMaxHeartRate() {
        return 220 - this.getAge();
    }

    public String displayTargetHeartRate() {
        double min = this.getMaxHeartRate() * 0.5;
        double max = this.getMaxHeartRate() * 0.85;

        return String.format("%.2f - %.2f bpm", min, max);
    }

    // setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(int day, int month, int year) {
        this.birthDate.setDay(day);

        this.birthDate.setMonth(month);

        this.birthDate.setYear(year);
    }

    // getters
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getBirthDate() {
        return this.birthDate.displayDate();
    }

    public int getBirthDay() {
        return this.birthDate.getDay();
    }

    public int getBirthMonth() {
        return this.birthDate.getMonth();
    }

    public int getBirthYear() {
        return this.birthDate.getYear();
    }
}
