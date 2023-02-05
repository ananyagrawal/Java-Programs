import java.util.*;
public class check {
    public static void main(String args[])
    {
        System.out.println("Name: Anany Agrawal SAP ID: 1000014386");
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        String s;
        s=(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')?"Vowel":"Consonant";
        System.out.println(s);
        sc.close();
    }
}
