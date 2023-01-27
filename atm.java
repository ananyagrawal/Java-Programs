import java.util.*;

public class atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000, withdraw, deposit, choice;
        while (true) {
            System.out.println("Welcome to our ATM Menu");
            System.out.println("1. Check balance.");
            System.out.println("2. Cash Withdrawal");
            System.out.println("3. Cash Deposit");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("The account balance is Rs." + balance);
                    break;
                case 2:
                    System.out.println("Enter the amount to withdraw:");
                    withdraw = sc.nextInt();
                    if (withdraw > balance)
                        System.out.println("You are having insufficient balance");
                    else {
                        balance -= withdraw;
                        System.out.println("Withdrawal done!");
                    }
                    break;
                case 3:
                    System.out.println("Enter the amount to deposit:");
                    deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println("Deposit done!");
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM service");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
