package CODEFORCES;
import java.util.*;
public class boy_or_girl {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String word = sc.next();
        int count = 1;
        String res="";
        char[] ch = word.toCharArray();
        Arrays.sort(ch);
        for(int i=1; i<ch.length; i++)
            if(ch[i-1]!=ch[i])
                ++count;
        if(count%2==0)
            res = "CHAT WITH HER!";
        else
            res = "IGNORE HIM!";
        System.out.println(res);
    }
}