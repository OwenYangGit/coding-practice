class OuterClass {
    private class MyInnerClass {
        public void innerPrint() {
            System.out.println("This is a inner class");
        }
    }
    void getInner() {
        MyInnerClass demoInner = new MyInnerClass();
        // Access inner class
        demoInner.innerPrint();
    }
}
public class MyInnerClassDemo {
    public static void main(String[] args) {
        // Call getInner to access 'private' class MyInnerClass
        // 實例化(Instantiating) the outer class 
        OuterClass myDemoInner = new OuterClass();
        myDemoInner.getInner();
    }
}