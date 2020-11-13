public class MyConcurrentProblem extends Thread {
    public static int amount = 0;
    public static void main(String[] args) {
        MyConcurrentProblem t1 = new MyConcurrentProblem();
        t1.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);

    }
    public void run() {
        amount++;
    }
}