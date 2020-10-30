
public class theMethod { // public 公開給其他 class 存取
  static void myMethod() { // static 在這裡代表宣告這是一個屬於 theMethod class 的 class 不是 object (物件) ; // void 代表沒有 return 值
    System.out.println("Practice what is method!!");
  }
  public static void main(String[] args){ // String[] args 代表傳入一個字串陣列的參數 , 該參數的命名為 args ; main 函數必須定義!!
    // Methods are used to perform certain actions, and they are also known as functions.
    // Why use methods? To reuse code: define the code once, and use it many times.
    myMethod();
    }
}