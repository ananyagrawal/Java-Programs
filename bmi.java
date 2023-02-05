public class bmi {
    public static void main(String a1[]){
        double w,h,bmi;
        w=Double.parseDouble(a1[0]);
        h=Double.parseDouble(a1[1]);
        h=h*0.0254;
        bmi=w/(h*h);
        System.out.println("BMI: "+bmi);
    }
}
