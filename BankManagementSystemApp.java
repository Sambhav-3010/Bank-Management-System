import java.util.*;

public class BankManagementSystemApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankManagementSystemApp bankSystem = new BankManagementSystemApp();
        
        // Inputing the maximum number of employes
        System.out.println("Enter the maximum number of customers");
        int number_customers = sc.nextInt();
        System.out.println("Enter the maximun number of employees");
        int number_employees = sc.nextInt();
        System.out.println("Enter the maximum number of admins");
        int number_admin = sc.nextInt();
        Customer C[] = new Customer[number_customers];
        int c = 0;  
        Employee E[] = new Employee[number_employees];  
        int e = 0;
        Admin A[] = new Admin[number_admin];
        int a = 0;  
        while (true) {
            int time_years = 1;
            final double interest = 8.00;
            System.out.println("********BANK MANAGEMENT SYSTEM********");
            System.out.println("Enter 1 for Admin login");
            System.out.println("Enter 2 for Customer login");
            System.out.println("Enter 3 for Employee login");
            System.out.println("Enter 4 to add a new Admin");
            System.out.println("Enter 5 to add a new Customer");
            System.out.println("Enter 6 to add a new Employee");
            System.out.println("Enter 7 to stimulate an year to add on interest amount");
            System.out.println("Enter 8 to exit");
            int login_choice = sc.nextInt();
            if (login_choice == 1) { // Admin login
                if (a==0) {
                    System.out.println("No admin present");
                    continue;
                }
                System.out.println("Enter the username");
                String user_name = sc.next();
                System.out.println("Enter the password");
                String pass_word = sc.next();
                int i;
                boolean flag = false;
                for (i = 0; i < a; i++) {
                    if (A[i].username.compareTo(user_name) == 0 && A[i].password.compareTo(pass_word)==0) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    System.out.println("Invalid Credentials");
                }
                else{
                    System.out.println("\n****************************\nWELCOME\n"+A[i].name);
                    boolean f = false,loop = true;
                    while (loop != false) {
                        System.out.println("Enter 1 to see details of Customer");
                        System.out.println("Enter 2 to see details of Employee");
                        System.out.println("Enter 3 to exit");
                        int choice = sc.nextInt();
                        switch (choice) {
                            case 1:
                            System.out.println("Enter the Customer ID");
                            String customerID = sc.next();
                            for (int j = 0; j < c; j++) {
                                if(C[i].customerId.compareToIgnoreCase(customerID) == 0){
                                    C[i].showAccount();
                                    f = true;
                                    break;
                                }
                            }
                            if (!f) {
                                System.out.println("No Customer Present with this ID");
                            }
                            break;
                            case 2:
                            System.out.println("Enter the Employee ID");
                            String EmployeeID = sc.next();
                            for (int j = 0; j < e; j++) {
                                if(E[i].employeeId.compareToIgnoreCase(EmployeeID) == 0){
                                    E[i].showEmployee();
                                    f = true;
                                    break;
                                }
                            }
                            if (!f) {
                                System.out.println("No Employee Present with this ID");
                            }
                            break;
                            case 3:
                            System.out.println("Thank you: "+A[i].name);
                            loop = false;
                            break;
                            default:
                            System.out.println("Wrong Choice");
                            break;
                        }
                    }
                }
            }
            else if(login_choice == 2){ // Customer login
                if (c==0) {
                    System.out.println("No customer present");
                    continue;
                }
                System.out.println("Enter the CustomerID");
                String customer_ID = sc.next();
                System.out.println("Enter the password");
                String pass_word = sc.next();
                int i;
                boolean flag = false;
                for (i = 0; i < c; i++) {
                    if (C[i].customerId.compareTo(customer_ID) == 0 && C[i].password.compareTo(pass_word)==0) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    System.out.println("Invalid Credentials");
                }
                else{
                    System.out.println("\n****************************\nWELCOME\n"+C[i].name);
                    boolean f = false,loop = true;
                    while (loop != false) {
                        System.out.println("Enter 1 to see details of Bank Account");
                        System.out.println("Enter 2 to deposite amount in accound");
                        System.out.println("Enter 3 to withdraw amount in account");
                        System.out.println("Enter 4 to exit");
                        int choice = sc.nextInt();
                        switch (choice) {
                            case 1:
                                C[i].showAccount();
                            break;
                            case 2:
                                C[i].deposit();
                            break;
                            case 3:
                                System.out.println("Maximum amount of 5000 can be withdrawn");
                                C[i].withdrawl();;
                            break;
                            case 4:
                                System.out.println("Thank You: "+C[i].name);
                                loop = false;
                            break;
                            default:
                                System.out.println("Invalid Choice");
                            break;
                        }
                    }
                }
            }
            else if(login_choice == 3){ // Employee login
                if (e==0) {
                    System.out.println("No employee present");
                    continue;
                }
                System.out.println("Enter the EmployeeID");
                String employee_ID = sc.next();
                System.out.println("Enter the password");
                String pass_word = sc.next();
                int i;
                boolean flag = false;
                for (i = 0; i < e; i++) {
                    if (E[i].employeeId.compareTo(employee_ID) == 0 && E[i].password.compareTo(pass_word)==0) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    System.out.println("Invalid Credentials");
                }
                else{
                    System.out.println("\n****************************\nWELCOME\n"+E[i].name);
                    boolean f = false,loop = true;
                    while (loop != false) {
                        System.out.println("Enter 1 to see details of customer");
                        System.out.println("Enter 2 to exit");
                        int choice = sc.nextInt();
                        switch (choice) {
                            case 1:
                            System.out.println("Enter the Customer ID");
                            String customerID = sc.next();
                            for (int j = 0; j < c; j++) {
                                if(C[i].customerId.compareToIgnoreCase(customerID) == 0){
                                    C[i].showAccount();
                                    f = true;
                                    break;
                                }
                            }
                            if (!f) {
                                System.out.println("No Customer Present with this ID");
                            }
                            break;
                            case 2:
                                System.out.println("Thank you: "+A[i].name);
                                loop = false;
                            break;
                            default:
                                System.out.println("Wrong Choice");
                            break;
                        }
                    }
                }
            }
            else if(login_choice == 4){ // Add a new Admin
                if(!(a==number_admin)){
                    A[a] = new Admin();  
                    A[a].newAdmin();
                    a++;
                }  
                else{
                    System.out.println("New admin can't be added exceeds maximum limit");
                }
            }
            else if(login_choice == 5){ // Add a new Customer
                if(!(c==number_customers)){
                    C[c] = new Customer();  
                    C[c].openAccount();
                    c++;
                }
                else{
                    System.out.println("New customer can't be added exceeds maximum limit");
                }
            }
            else if(login_choice == 6){ // Add a new Employee
                if(!(e==number_employees)){
                    E[e] = new Employee();  
                    E[e].newEmployee();
                    e++;
                }
                else{
                    System.out.println("New customer can't be added exceeds maximum limit");
                } 
            }
            else if(login_choice == 7){
                time_years++;
                for (int j = 0; j < c; j++) {
                    C[j].addInterest(interest,time_years);
                }
            }
            else if(login_choice == 8){
                System.out.println("System Closing");
                System.exit(0);
            }
            else{
                System.out.println("Please enter correct option");
                main(args);
            }
        }
    }
}