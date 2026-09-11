// Exercuse 3.13: Create a class named Employee that includes three instance variables - a first name, a last name, and a monthly salary.
// Provide a constructor that initializes the three instance variabels.
// Provide a set method and a get method for eac instance variable.
// If the monthly salary is not positive. do not set its value.
// Write a test application named EmployeeTest that demonstrates the capabilities of the Employee class.
// Create two Employee objects and display the annual salary for each object.
// Then give eah Employee a 10% raise and display each Employee's annual salary again.

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.setName(firstName);

        this.setSurname(lastName);

        this.setSalary(salary);
    }

    public void salaryRaise(double percentage) {
        this.setSalary(this.salary + salary * (percentage / 100));
    }

    public double getAnnualSalary() {
        return salary * 12;
    }

    // getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    // setters
    public void setName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        if (salary > 0) this.salary = salary;
    }
}
