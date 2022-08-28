package CODEFORCES;
import java.util.*;
public class beautiful_matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=0, j=0;
        outerloop:
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                int a=sc.nextInt();
                if(a==1)
                break outerloop;
            }
        }
        System.out.println(Math.abs(i-2)+Math.abs(j-2));
    }
}
