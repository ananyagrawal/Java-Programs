import java.util.*;

public class reverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int res = 0;
        while (n > 0) {
            res = res + n % 10;
            n = n / 10;
            res = res * 10;
        }
        System.out.println(res / 10);
        sc.close();
    }
}
