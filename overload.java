class overload {
    public int add(int a, int b){
        return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String args[]){
        System.out.println("Anany Agrawal 1000014386");
        overload o1=new overload();
        System.out.println(o1.add(7,8));
        System.out.println(o1.add(7.0,5.0));
        System.out.println(o1.add(1,2,3));
    }
}
