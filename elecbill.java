import java.util.*;

public class elecbill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of units");
        int units = sc.nextInt();
        double bill_amount = 0;
        if (units <= 199) {
            bill_amount = units * (1.20);
        } else if (units < 400 && units >= 200) {
            bill_amount = units * (1.50);
        } else if (units <= 600 && units >= 400) {
            bill_amount = units * (1.80);
        } else if (units > 600) {
            bill_amount = units * (2.00);
        }
        if (bill_amount > 400) {
            bill_amount += (bill_amount * 15) / 100;
        }

        System.out.println("Bill amount: " + bill_amount);
    }
}
