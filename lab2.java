import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class lab2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int m=sc.nextInt();
            int k=sc.nextInt();
            int w=sc.nextInt();
            int tcost=0;
            for(int j=0;j<=w;j++){
                tcost+=m*j;
            }
            if(tcost>k)
                System.out.println(tcost-k);
            else
                System.out.println("0");
        }
    }
}