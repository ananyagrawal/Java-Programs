import java.util.*;

public class grading {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of English, Science & Maths:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double total = a + b + c;
        double percentage = total / 3;
        Math.round(percentage);
        char grade;
        if (percentage >= 90)
            grade = 'A';
        else if (percentage < 90 && percentage >= 70)
            grade = 'B';
        else if (percentage < 70 && percentage >= 60)
            grade = 'C';
        else if (percentage < 60 && percentage >= 50)
            grade = 'D';
        else
            grade = 'F';
        System.out.println("Total Marks: " + total + "\nPercentage: " + percentage + "%\nGrade: " + grade);
        sc.close();
    }
}
