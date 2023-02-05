import java.util.*;

public class sum_evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int a = 0;
        int sumeven = 0, sumodd = 0;
        while (n > 0) {
            a++;
            int d = n % 10;
            if (a % 2 == 0) {
                sumeven += d;
            } else
                sumodd += d;
            n = n / 10;
        }
        if (a % 2 == 0) {
            System.out.println("Even place sum: " + sumodd);
            System.out.println("Odd place sum: " + sumeven);
        } else {
            System.out.println("Even place sum: " + sumeven);
            System.out.println("Odd place sum: " + sumodd);
        }
        sc.close();
    }
}
