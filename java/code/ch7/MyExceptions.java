public class MyExceptions {
    //(自製 error 方法)
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 yaars old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
    public static void main(String[] args) {
        int[] myNumbers = {1, 2, 3};
        // System.out.println(myNumbers[10]); // error! 雖然編譯會過 , 
        // 但是執行到這裡會噴錯(注意 範例中錯誤程式會中斷), 關於錯誤定義好幾種 , 前面章節有提過 , 這裡就不細探
        // 加入錯誤處理
        System.out.println("----- 練習 try cache -----");
        try {
            int[] myNums2 = {1,3,5,7};
            System.out.println(myNums2[10]);
        } catch (Exception e) {
            System.out.println("Somethings wrong." + e);
        }
        // finally 可以在最後無論結果怎樣 , 都執行該程式碼段落
        System.out.println("----- 嘗試加入 finally -----");
        try {
            int[] myNums3 = {2,4,6,8};
            System.out.println(myNums3[5]);
        } catch (Exception e) {
            System.out.println("Somethings went wrong.");
        } finally {
            System.out.println("Alway run it when try-cache finished.");
        }
        // 呼叫自製的 error 方法
        System.out.println("----- 呼叫自製的 error 方法 -----");
        checkAge(15); // 如果改成 checkAge(20); 就會過~
    }
}