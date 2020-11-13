public class MyThreadAlive extends Thread {
    public static int amount = 0;
    public static void main(String[] args) {
        MyThreadAlive t1 = new MyThreadAlive();
        t1.start();
        // 檢查 t1 物件是不是在 run job 中 XD 滿直觀的 method 命名
        while (t1.isAlive()) {
            System.out.println("Wait ...");
        }
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
    }
    public void run() {
        amount++;
    }
}