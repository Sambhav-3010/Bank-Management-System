import java.util.Scanner;
public class Employee {
    public String employeeId;
    public String name;
    public String position;
    public String password;
    public void newEmployee()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee ID");
        employeeId = sc.next();
        System.out.println("Enter the employee name");
        name = sc.next();
        System.out.println("Enter the employee position");
        position = sc.next();
        System.out.println("Enter the employee password");
        password = sc.next();
    }
    public void showEmployee()
    {
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Position: "+position);
        System.out.println("Employee ID: "+employeeId);
    }
}
