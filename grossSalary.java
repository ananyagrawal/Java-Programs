import java.util.*;

public class grossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the basic salary");
        int b_salary = sc.nextInt();
        int hra = b_salary / 2;
        int ta = 30 * b_salary / 100;
        int ma = b_salary / 4;
        int pf = b_salary / 10;
        int gs = b_salary + hra + ta + ma;
        int tax = gs / 10;
        int netSal = gs - tax - pf;
        System.out.println();
        System.out.println("Basic Salary" + "\t\t" + b_salary);
        System.out.println("House Rent Allowances" + "\t" + hra);
        System.out.println("Transport Allowances" + "\t" + ta);
        System.out.println("Medical Allowances" + "\t" + ma);
        System.out.println("PF" + "\t\t\t" + pf);
        System.out.println("Gross Salary" + "\t\t" + gs);
        System.out.println("Tax" + "\t\t\t" + tax);
        System.out.println();
        System.out.println("Net Salary" + "\t\t" + netSal);
    }
}
