import java.util.*;

public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double a, b, s;
        System.out.println("Calculator");
        System.out.println("1. Math operations");
        System.out.println("2. Power, Cube or Absolute Value");
        System.out.println("3. Number Conversion");
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the two numbers");
                a = sc.nextDouble();
                b = sc.nextDouble();
                System.out.println("Enter the operation to be performed: +,-,*,/ or %");
                char ch = sc.next().charAt(0);
                switch (ch) {
                    case '+':
                        s = a + b;
                        System.out.println(s);
                        break;
                    case '-':
                        s = a - b;
                        System.out.println(s);
                        break;
                    case '*':
                        s = a * b;
                        System.out.println(s);
                        break;
                    case '/':
                        s = a / b;
                        System.out.println(s);
                        break;
                    case '%':
                        s = a % b;
                        System.out.println(s);
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
                break;
            case 2:
                System.out.println("Enter the number");
                a = sc.nextDouble();
                System.out.println("Menu");
                System.out.println("1. Cube\n2. Power\n3. Absolute");
                System.out.println("Enter your choice:");
                int chi = sc.nextInt();
                if (chi == 1) {
                    System.out.println("Cube of " + a + " is " + a * a * a);
                } else if (chi == 2) {
                    System.out.println("Enter the power");
                    int p = sc.nextInt();
                    System.out.println("Result: " + Math.pow(a, p));
                } else if (chi == 3) {
                    System.out.println("Result: " + Math.abs(a));
                } else
                    System.out.println("Wrong Choice!");
                break;
            case 3:
                System.out.println("Conversion Menu:");
                System.out.println(
                        "1. Decimal to Binary\n2. Binary to Decimal\n3. Decimal to Octal\n4. Decimal to Hexadecimal");
                System.out.println("Enter your choice: ");
                int cho = sc.nextInt();
                if (cho == 1) {
                    System.out.println("Enter the decimal number");
                    int d = sc.nextInt();
                    System.out.println("Binary: " + Integer.toBinaryString(d));
                } else if (cho == 2) {
                    System.out.println("Enter the binary number");
                    String n = sc.next();
                    System.out.println("Decimal: " + Integer.parseInt(n, 2));
                } else if (cho == 3) {
                    System.out.println("Enter the number");
                    int x = sc.nextInt();
                    System.out.println("Octal: " + Integer.toOctalString(x));
                } else if (cho == 4) {
                    System.out.println("Enter the number");
                    int y = sc.nextInt();
                    System.out.println("Hexadecimal: " + Integer.toHexString(y));
                } else {
                    System.out.println("Wrong Choice!");
                }
                break;
            default:
                System.out.println("Wrong Choice!");
        }
        sc.close();
    }
}
