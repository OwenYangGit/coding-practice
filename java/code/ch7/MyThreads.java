// 第一種 extends Thread 的方式
public class MyThreads extends Thread {
    public static void main(String[] args) {
        System.out.println("----- extend Thread 範例 -----");
        MyThreads t1 = new MyThreads();
        t1.start();
        t1.join();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }
}