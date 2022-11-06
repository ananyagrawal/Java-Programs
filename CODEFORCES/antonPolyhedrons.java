package CODEFORCES;
import java.util.*;
public class antonPolyhedrons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a="Tetrahedron";
        String b="Cube";
        String c="Octahedron";
        String d="Dodecahedron";
        String e="Icosahedron";
        int total=0;
        while(n>0){
            String s=sc.next();
            if(s.equals(a)){
                total+=4;
            }
            else if(s.equals(b)){
                total+=6;
            }
            else if(s.equals(c)){
                total+=8;
            }
            else if(s.equals(d)){
                total+=12;
            }
            else if(s.equals(e)){
                total+=20;
            }
            n--;
        }
        System.out.println(total);
        sc.close();
    }
}
