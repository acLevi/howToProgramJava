/* Exercise 4.20:
Develop a Java application that determines the gross pay for each of three employees.
The company pays the stardard rate for the first 40 hours worked by each employee and 50% more for any hours worked beyond 40.
You are provided with a list of employees, the number of hours they worked last week, and each employee's hourly wage.
Your program must accept this information as input for each employee and then determine and display their gross pay.
Use the Scanner class for data input.

#pseudocode

initialize hoursWorked
initialize hourlyWage
initialize grossSalary
initialize baseHours to 40
initialize counter to 1

WHILE counter is equal or less than 3
    prompt hours worked by employee
    read hours worked by employee

    promt employee's hourly wage
    read employee's hourly wage

    grossSalary = hoursWorked * hourlyWage

    if hoursWorked is greater than baseHours
        grossSalary += (hoursWorked - 40) * (hourlyWage * 0.5)

    display employee's weekly gross salary

    increment counter
end WHILE
*/

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hoursWorked;
        double hourlyWage;
        double grossSalary;
        int counter = 1;

        while (counter <= 3) {
            System.out.printf("Insert hours worked in the week by the %dst employee: ", counter);
            hoursWorked = input.nextInt();

            System.out.printf("Insert %dnd employee's hourly wage: $", counter);
            hourlyWage = input.nextDouble();

            grossSalary = hourlyWage * hoursWorked;

            if (hoursWorked > 40) {
                grossSalary += (hoursWorked - 40) * (hourlyWage * 0.5);
            }

            System.out.printf("%dst employee's weekly gross salary: %.2f %n%n", counter, grossSalary);

            counter++;
        }

        input.close();
    }
}
