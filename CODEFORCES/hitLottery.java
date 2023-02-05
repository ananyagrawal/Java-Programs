package CODEFORCES;
import java.util.*;
public class hitLottery {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n>0){
            if(n>=100){
                count=count+n/100;
                n=n%100;
            }
            else if(n>=20){
                count=count+n/20;
                n=n%20;
            }
            else if(n>=10){
                count=count+n/10;
                n=n%10;
            }
            else if(n>=5){
                count=count+n/5;
                n=n%5;
            }
            else{
                count=count+n;
                n=0;
            }
        }
        System.out.println(count);
    }
}
