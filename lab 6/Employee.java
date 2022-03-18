import java.util.Scanner;

public class Employee {
    // Initializing variables
    private String first;
    private String last;
    private int age;
    private double salary;

    public Employee() {
        // Get user input
        Scanner scan = new Scanner(System.in);

       System.out.println("Please input the employee's first name: ");
        String first= scan.nextLine();
         System.out.println("Please input the employee's last name: ");
        String last= scan.nextLine();
         System.out.println("Please input the employee's age: ");
        int age= scan.nextInt();
         System.out.println("Please input the employee's salary: ");
        double salary= scan.nextDouble();
	 System.out.println("Employee Information: " + first + " " + last + ", " +age+", "+salary);

    }

    public String toString() {
         return "Employee Information: " + first+" "+last+", "+age+", "+salary;
    }
}