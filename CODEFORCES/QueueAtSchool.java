package CODEFORCES;
import java.util.Scanner;
public class QueueAtSchool{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        String s=sc.next();
        String gb="GB";
        while(t>0){
            for(int i=1;i<n;i++){
                if(s.charAt(i)=='G' && s.charAt(i-1)=='B'){
                    
                    s=s.substring(0, (i-1))+gb+s.substring(i+1, s.length());
                    i++;
                }
            }
            t--;
        }
        System.out.println(s);
    }
}