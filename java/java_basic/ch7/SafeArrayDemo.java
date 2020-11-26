public class SafeArrayDemo {
    // 如何使用自定義的 SafeArray
    public static void main(String[] args) {
        // 生成陣列物件
        SafeArray arr1 = new SafeArray(); // 沒有指定 所以這邊會吃到初始值
        SafeArray arr2 = new SafeArray(5); // 指定了 5 , 會把 5 代入生成可以放 5 個 elements 的陣列
        
        for (int i = 0 ; i < arr1.getArrayLength() ; i++) {
            arr1.setElement(i, (i+1)*10);
        }
        for (int i = 0 ; i < arr2.getArrayLength() ; i++) {
            arr2.setElement(i, (i+1)*10);
        }

        System.out.println("arr1: ");
        arr1.showElement();
        System.out.println("");
        System.out.println("arr2: ");
        arr2.showElement();
        System.out.println("");
    }
}