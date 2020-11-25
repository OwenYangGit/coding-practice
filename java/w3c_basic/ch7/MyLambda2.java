import java.util.ArrayList;
import java.util.function.Consumer;

// 第二個 lab
interface StringFunc {
    String run(String str); // run 方法 , 返回一個 String 型別 // note: interface 的 method 不能定義 body
}

public class MyLambda2 {
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<Integer>();
        n.add(5);
        n.add(6);
        n.add(8);
        n.add(1);
        Consumer<Integer> m = (i) -> { System.out.println(i); };
        n.forEach(m);
        // 第二個 lab 說明
        // 在一個 method 使用 lambda expression , 該 method 應該有一個參數對應單一個方法的 interface 為該型別(type) ,
        // 呼叫該 interface method 就會跑這段 lambda expression
        System.out.println("----- 第二個 lab -----");
        StringFunc a = (s) -> s + "!"; // 把 lambda expression 存進 a 變數裡 , a 變數的型別是 StringFunc interface
        StringFunc b = (s) -> s + "?"; // 同上
        // 這邊上面的兩個宣告有點像是在定義 StringFunc 這個 interface 裡面 run() method 的 body
        printFormatted("Hello",a);
        printFormatted("Hello",b);
    }
    public static void printFormatted(String str ,StringFunc format) {
        String result = format.run(str); // 呼叫 format.run() 執行 lambda expression
        System.out.println(result);
    }
}