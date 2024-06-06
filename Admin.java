import java.util.Scanner;
public class Admin{
    public String name;
    public String username;
    public String password;
    public void newAdmin()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the admin name");
        name = sc.next();
        System.out.println("Enter the admin username");
        username = sc.next();
        System.out.println("Enter the admin password");
        password = sc.next();
    }
}
