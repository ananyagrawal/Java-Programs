import java.util.*;

public class seedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x and y");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int res = x;
        while (x > 0) {
            int d = x % 10;
            res = res * d;
            x = x / 10;
        }
        if (res == y)
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();
    }
}
