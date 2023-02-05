import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int a = 0;
        int num = n;
        int orig = n;
        while (n > 0) {
            n = n / 10;
            a++;
        }
        int res = 0;
        while (num > 0) {
            int d = num % 10;
            res += Math.pow(d, a);
            num = num / 10;
        }
        if (res == orig)
            System.out.println("Yes");
        else
            System.out.println("No");
        sc.close();
    }
}
