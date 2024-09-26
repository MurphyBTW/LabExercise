import java.util.Scanner;

class SavingsAccount {
    public static double interestRate = 0;
    private double balance;
    
    public SavingsAccount() {
        balance = 0;
    }
    
    public static void setInterestRate(double newRate) {
        interestRate = newRate;
    }
    
    public static double getInterestRate() {
        return interestRate;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }
    
    public double withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            amount = 0;
        }
        return balance;
    }
    
    public void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
    }
    
    public static void showBalance(SavingsAccount account) {
        System.out.println("Your new balance is : " + account.getBalance());
    }
}

//This is actually LabExer3 project.
public class RunSavingsAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount savings = new SavingsAccount();
        
        System.out.print("Enter interest rate: ");
        double interestRate = sc.nextDouble();
        SavingsAccount.setInterestRate(interestRate);
        
        
        System.out.print("Enter deposit amount: ");
        double depositAmount = sc.nextDouble();
        savings.deposit(depositAmount);
        System.out.println("Your balance is: " + savings.getBalance());
        
        while (true) {
            System.out.print("Press D for another deposit or W for another withdraw: ");
            char choice = sc.next().charAt(0);
            
            if (choice == 'D' || choice == 'd') {
                System.out.print("Enter deposit amount: ");
                depositAmount = sc.nextDouble();
                savings.deposit(depositAmount);
            } else if (choice == 'W' || choice == 'w') {
                System.out.print("Enter withdrawal amount: ");
                double withdrawAmount = sc.nextDouble();
                savings.withdraw(withdrawAmount);
            }
            
            if (savings.getBalance() > 1000) {
                savings.addInterest();
                savings.showBalance(savings);
            }
        }
    }
}
