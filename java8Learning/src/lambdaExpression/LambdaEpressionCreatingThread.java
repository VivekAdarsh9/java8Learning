package lambdaExpression;

public class LambdaEpressionCreatingThread {
    public static void main(String[] args) {

        Runnable r1=new Runnable() {
            public void run() {
                System.out.println("Thread is running");
            }
        };

        Runnable r2=()->System.out.println("Thread2 is running");

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
