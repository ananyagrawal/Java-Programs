package CODEFORCES;
import java.util.Scanner;
public class beautiful_year {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s1,s2,s3,s4;
        for(int i=n+1;;i++){
            s1=i%10;
            s2=(i/10)%10;
            s3=(i/100)%10;
            s4=i/1000;
            if (s1!=s2&&s1!=s3&&s1!=s4&&s2!=s3&&s2!=s4&&s3!=s4){
                System.out.println(i);
                break;
            }
        }
    }
}
