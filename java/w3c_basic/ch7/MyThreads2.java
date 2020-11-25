public class MyThreads2 implements Runnable {
    public static void main(String[] args) {
        MyThreads2 obj = new MyThreads2();
        Thread t1 = new Thread(obj);
        t1.start();
        System.out.println("This code is outside of the thread");
    }
    public void run () {
        System.out.println("This code is running in a thread");
    }
}