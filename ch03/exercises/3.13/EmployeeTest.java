// Exercise 3.13: Create a class named Employee that includes three instance variables - a first name, a last name, and a monthly salary.
// Provide a constructor that initializes the three instance variables.
// Provide a set method and a get method for each instance variable.
// If the monthly salary is not positive. do not set its value.
// Write a test application named EmployeeTest that demonstrates the capabilities of the Employee class.
// Create two Employee objects and display the annual salary for each object.
// Then give eah Employee a 10% raise and display each Employee's annual salary again.

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Smith", -23.43);
        Employee employee2 = new Employee("Lewis", "Hamilton", 3403.21);

        System.out.printf("%s %s's annual salary: $%.2f %n", 
            employee1.getFirstName(), employee1.getLastName(), employee1.getAnnualSalary());
        System.out.printf("%s %s's annual salary: $%.2f %n%n", 
            employee2.getFirstName(), employee2.getLastName(), employee2.getAnnualSalary());

        employee1.salaryRaise(10.0);
        employee2.salaryRaise(10.0);

        System.out.printf("%s %s's annual salary after raise: $%.2f %n", 
            employee1.getFirstName(), employee1.getLastName(), employee1.getAnnualSalary());
        System.out.printf("%s %s's annual salary after raise: $%.2f %n%n", 
            employee2.getFirstName(), employee2.getLastName(), employee2.getAnnualSalary());
    }
}
