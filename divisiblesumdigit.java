import java.util.*;

public class divisiblesumdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int o = n;
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d;
            n = n / 10;
        }
        if (o % sum == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();
    }
}
