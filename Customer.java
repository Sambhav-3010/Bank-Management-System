import java.util.Scanner;
public class Customer {
    public String name;
    public String customerId;
    public String password;
    public double balance;
    public String acc_no;
    Scanner sc = new Scanner(System.in);
    public void openAccount()
    {
        System.out.println("Enter the customer name");
        name = sc.next();
        System.out.println("Enter the account number"); 
        acc_no = sc.next();  
        System.out.println("Enter the customer ID");
        customerId = sc.next();
        System.out.println("Enter the customer password");
        password = sc.next();
        System.out.println("Enter the balance");
        balance = sc.nextDouble();
    }
    public void deposit()
    {
        double amount;
        System.out.println("Enter the amount you want to deposit");
        amount = sc.nextDouble();
        balance = balance + amount;
    }
    public void withdrawl()
    {
        long amount;  
        System.out.println("Enter the amount you want to withdraw: ");  
        amount = sc.nextLong();  
        if (amount > 5000) {
            System.out.println("Amount exceeds the limit");
        }
        else{
            if (balance >= amount) {  
                balance = balance - amount;  
                System.out.println("Balance after withdrawal: " + balance);  
            } 
            else {  
                System.out.println("Your balance is less than " + amount + "\tTransaction failed...!!" );  
            }  
        }
    }
    public void showAccount() {  
        System.out.println("Name of the Account Holder: " + name);  
        System.out.println("Customer ID: "+customerId);
        System.out.println("Account no.: " + acc_no);   
        System.out.println("Balance: " + balance);  
    }
    public void addInterest(double interest,int time_years)
    {
        double Interest = (balance*interest*time_years)/100;
        balance += Interest;
    }
}
