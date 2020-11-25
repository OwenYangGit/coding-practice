// 抽象類別及方法
abstract class MyAbsClass {
    public abstract void absTest();
    public void absDemo(){
        System.out.println("Regular method in abstract class");
    }
}
class MySubClass extends MyAbsClass {
    public void absTest() {
        System.out.println("Test method in abstract method");
        // 調用來自抽象類別的一般方法 , 記住抽象類別無法 new 成物件
        // regular method from abstract class
        absDemo();
    }
}
public class Abs {
    public static void main(String[] args){
        // when new abstract class to be object will error
        // MyAbsClass myAbsMethod = new MyAbsClass(); // will error
        MySubClass mySubMethod = new MySubClass(); //
        mySubMethod.absTest();
    }
}