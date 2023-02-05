import java.util.*;
public class calculator {
    public static void main(String args[])
    {
        System.out.println("Name: Anany Agrawal SAP ID: 1000014386");
        Double a,b,s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers");
        a=sc.nextDouble();
        b=sc.nextDouble();
        System.out.println("Enter the operation to be performed: +,-,*,/ or %");
        char ch=sc.next().charAt(0);
        switch(ch)
        {
            case '+':
            s=a+b;
            System.out.println(s);
            break;
            case '-':
            s=a-b;
            System.out.println(s);
            break;
            case '*':
            s=a*b;
            System.out.println(s);
            break;
            case '/':
            s=a/b;
            System.out.println(s);
            break;
            case '%':
            s=a%b;
            System.out.println(s);
            break;
            default:
            System.out.println("Invalid choice");
        }
        sc.close();
    }
}
