// 數字型別陣列
public class SafeArray {
    private int[] arr;

    // 在 new 物件沒代入 parameter 時 , 自動生成 10 個 index 的 array
    public SafeArray() {
        this(10);
    }
    // 在 new 物件時若代入 parameter , 則生成對應該 parameter 值的 array
    public SafeArray(int length) {
        arr = new int[length];
    }
    // 顯示 elements
    public void showElement() {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    // 取得 element
    public int getElement(int i) {
        if ( i >= arr.length || i < 0 ) {
            System.out.println("index error");
            return 0;
        }
        return arr[i];
    }
    // 取得 array 長度
    public int getArrayLength() {
        return arr.length;
    }
    // 設定 array elements
    public void setElement(int i , int value) {
        if ( i >= arr.length || i < 0 ) {
            System.out.println("index error");
            return;
        }
        arr[i] = value;
    }
    
}