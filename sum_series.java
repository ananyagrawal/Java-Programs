import java.util.*;

public class sum_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        double sum = 1;
        for (double i = 2; i <= n; i++) {
            sum = sum + (1 / i);
        }
        System.out.println("Sum of the series: " + sum);
        sc.close();
    }
}