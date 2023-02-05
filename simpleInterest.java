import java.util.*;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle, rate and time");
        int pri = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();
        int si = (pri * rate * time) / 100;
        System.out.println("Simple Interest: " + si);
        sc.close();
    }
}
