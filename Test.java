public class Test implements Runnable{
    public static void main(String[] args) {
        new Test();
    }
    public Test(){
        Thread t=new Thread(this);
        t.start();
        t.start();
    }
    
    public void run() {
        System.out.println("test");
    }

}