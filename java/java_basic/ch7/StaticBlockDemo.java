public class StaticBlockDemo {
    public static void main(String[] args) {
        SomeClass test = new SomeClass();
        SomeClass test2 = new SomeClass(); // 就算 new 兩個物件 , SomeClass 的 static 區塊還是只會執行一次
    }
}