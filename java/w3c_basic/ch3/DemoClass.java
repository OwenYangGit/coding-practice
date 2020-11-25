public class DemoClass{
    // create DemoClass method
    static void demoMethod(){
        System.out.println("Hello World!");
    }
    // static method 可以無需創建 object 就被訪問
    static void DemoStaticClass(){
        System.out.println("This is static method");
    }
    // public method 則必須要先創建 object 才能被訪問
    public void DemoNonStaticClass(){
        System.out.println("This is non-static method");
    }
    public static void main(String[] args){
        // inside main() called demoMethod
        DemoClass myDemo = new DemoClass();
        demoMethod();
        // static and non-static ( static or public ) , 看看差異性
        DemoStaticClass();
        DemoClass myNonStaticMethod = new DemoClass();
        myNonStaticMethod.DemoNonStaticClass();
        // DemoNonStaticClass(); // this line will compile error
        // 調用別的檔案的 method , 然後會發現執行 javac 時它會連另一檔案一起編譯出 bytecode(.class)
        ClassAndObj anotherObj = new ClassAndObj();
        System.out.println(anotherObj.x);
    }
}