// method 呼叫自己
public class recursion { 
    public static int sum(int k) {
        if (k > 0) {
        return k + sum(k - 1); // call itself
        } else {
        return 0;
        }
    }
    public static int sum2(int start , int end){
        if (end > start){
            return end + sum2(start , (end - 1));
        } else {
            return end;
        }
    }
    public static void main(String[] args) {
        // 這邊會發現 sum 在條件滿足的情況下會一直呼叫自己 , 所以造成 sum 函數會被執行 10 次 , 但是因為被自己呼叫的時候執行的變數 k 值會 -1 所以最後加總起來數字為 55
        int result = sum(10); // call itself from sum method
        System.out.println(result);
        int result2 = sum2(5,10); // call itself from sum2 method
        System.out.println(result2);
        }
}