public class mathMethod {
    public static void main(String[] args){
        // 區間取最大值
        System.out.println(Math.max(3,10)); //output = 10
        // 區間取最小值
        System.out.println(Math.min(5,7)); //output = 5
        // 開根號
        System.out.println(Math.sqrt(64)); // output = 8.0
        // 絕對值
        System.out.println(Math.abs(-10.5)); //  output = 10.5
        // 取隨機數
        int test = (int)(Math.random() * 101); // random 出來的值試 double 型別 , 而 double 不能直接轉 int , 必須要手動 (前面 + (int))
        System.out.println(test);
        int test2 = (int)Math.random() * 101; // 永遠為 0 , 因為會先計算 Math.random() 然後取 int 就會發現是 0 , 然後 0 * 101 還是 0
        System.out.println(test2);
    }
}