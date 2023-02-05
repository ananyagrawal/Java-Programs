import java.util.*;

public class prime2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int flag = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0)
                    flag++;
            }
            if (flag == 0)
                System.out.print(i + " ");
        }
        sc.close();
    }
}
