//// abstract block
abstract class Person {
    public String fname = "Teemo";
    public int age = 24;
    // abstract method in abstract class , 可以看到沒有定義任何東西
    public abstract void study();
}
// Student class 為 Person class 的 subclass
class Student extends Person {
    public int graduationYear = 2018;
    public void study() {
        // 可以看到 abstract study method 被定義在 subclass 裡面
        System.out.println("Studying all day long");
    }
}
public class Modifiers {
    // 練習比較難理解的 static 和 abstract
    //// static block
    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating objects");
    }
    public void myPublicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }
    // main()
    public static void main(String[] args) {
        // can be called without new object
        Modifiers.myStaticMethod();
        // Modifiers.myPublicMethod(); // this line will error

        // only can be called from new object
        Modifiers myobj = new Modifiers();
        myobj.myPublicMethod();
        
        // 練習 abstract
        Student ming = new Student();
        System.out.println("Name: " + ming.fname);
        System.out.println("Age: " + ming.age);
        System.out.println("Graduation Year: " + ming.graduationYear);
        ming.study();
    }
}