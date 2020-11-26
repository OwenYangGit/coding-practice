public class MethodMember {
    public static void main(String[] args) {
        MethodDemo methodDemo = new MethodDemo();
        
        methodDemo.scopeDemo();
        System.out.println(methodDemo.getData());
        
        methodDemo.setData(100);
        System.out.println(methodDemo.getData());
    }
}

class MethodDemo {
    private int data = 10;
    
    public void scopeDemo() {
        int data = 100;
    }

    public int getData() {
        return data;
    }
    
    public void setData(int data) {
        // data = data; // 無效
        this.data = data; // 有效
    }
}