// 練習 Constructors 方法 , 該方法是一種特殊方法 , 目的在於給予一個 class 在被 new 成一個物件的時候可以參考的初始值
public class Cons {
    // 先定義 Cons 類別的資料結構
    int x;
    String name;
    // 在定義當 Cons 類別被 new 成一個物件的時候 , 如果都沒做任何動作情況下 , 預設值 x = 5 ; name = "demo"
    public Cons(int num) {
        x = 5;
        name = "demo";
        y = num;
    }
    public static void main(String[] args) {
        // Constructors 也可以 pass parameters
        Cons myCons = new Cons(3);
        System.out.println(myCons.x);
        System.out.println(myCons.name);
    }
}