import java.io.*;

public class timeconversion {
    public static String timeConversion(String s) {
        // Write your code here
        boolean pm=false;
        if((s.substring(8,10).compareTo("PM"))==0){
            pm=true;
        }
        int t=Integer.parseInt(s.substring(0,2));
        if(pm && t<12){
            t=t+12;
        }
        if(!pm && t>=12){
            t=t-12;
        }
        s=s.substring(2,s.length()-2);
        s=(Integer.toString(t)).concat(s);
        if(t<10){
            s="0".concat(s);
        }
        return s;
        }
    public static void main(String[] args) throws IOException {
        String s = "07:05:45PM";
        String result = timeConversion(s);
        System.out.println(result);
    }
}
