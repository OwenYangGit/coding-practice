public class MyWrapperClass {
    public static void main(String[] args) {
        // 創建 Wrapper 物件 , 使用 Wrapper classes 宣告來取代 primitive data types 宣告 
        Integer myInt = 5;
        Double myDouble = 4.99;
        Character myChar = 'A';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);
        // 當你開始使用 wrapper object 了 , 那麼你就可以用特定的方法操作這些物件
        System.out.println("----- 操作 wrapper 物件 -----");
        System.out.println("----- 使用 型別Value() 方法來取得這些物件被指派的 value -----");
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());
        // 另一個常見的用法 , 就是用 toString() 方法
        System.out.println("----- toString 方法範例 -----");
        Integer myInt2 = 100;
        String myString = myInt2.toString();
        // 然後我們計算下 myString 的 lenth , 使用 String 物件的方法 length()
        System.out.println(myString.length());
    }
}