public class rec {
    static int n=5;
    static void P(){
        if(n>0){
            System.out.println("Hello");
            n--;
            P();
        }
    }
    public static void main(String args[])
    {
        P();
    }
}
