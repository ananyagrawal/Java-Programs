package CODEFORCES;
import java.util.Scanner;
public class stringTask {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        String s=sc.next();
        String w="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' && ch!='y' && ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U' && ch!='Y'){
                w+="."+ch;
            }
        }
        System.out.println(w.toLowerCase());
    }
}
