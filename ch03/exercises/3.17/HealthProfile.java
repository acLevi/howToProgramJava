public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private Date birthDate;
    private double weight;
    private double height;
    private HeartRates userHeartRates;

    public HealthProfile(String firstName, String lastName, String gender, double height, double weight, int birthDay, int birthMonth, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        this.birthDate = new Date(birthDay, birthMonth, birthYear);
        this.userHeartRates = new HeartRates(firstName, lastName, birthDay, birthMonth, birthYear);
    }

    public int getMaxHeartRate() {
        return this.userHeartRates.getMaxHeartRate();
    }

    public String getTargetHeartRate() {
        return this.userHeartRates.displayTargetHeartRate();
    }

    public double getBMI() {
        return BMI.getBMI(this.height, this.weight);
    }

    // getters
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFullName() {
        return String.format("%s %s", this.firstName, this.lastName);
    }

    public String getGender() {
        return this.gender;
    }

    public double getWeight() {
        return this.weight;
    }

    public double getHeight() {
        return this.height;
    }

    public String getBirthDate() {
        return birthDate.displayDate();
    }

    public int getAge() {
        return userHeartRates.getAge();
    }

    // setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    } 

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBirthDate(int day, int month, int year) {
        this.birthDate = new Date(day, month, year);
    }
}
