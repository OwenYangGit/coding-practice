import java.util.Date;
import java.util.Scanner;

public class ch4 {
    public static void main(String[] args) {
        // 取得系統時間
        Date date = new Date();
        System.out.println(date.toString());
        // 簡易的 user login 功能
        String uname = "diviner";
        String pass = "mypass";
        Scanner scanner = new Scanner(System.in);
        System.out.print("username: ");
        String username = scanner.next();
        System.out.print("password: ");
        String passwd = scanner.next();
        if (uname.equals(username) && pass.equals(passwd)) {
            System.out.println("秘密資訊在此！");
        }
        else {
            System.out.println(username + "您好 , 您輸入的資料有誤 , 請嘗試重新輸入");
        }
        scanner.close();
        // Wrap primitive type -> 包裝基本資料型態
        int num1 = 10;
        int num2 = 20;
        // 包裝型態 , 在 J2SE 5.0 之前需要先這樣才可以將 num1 和 num2 做成物件
        Integer x = new Integer(num1);
        Integer y = new Integer(num2);
        
        // 操作物件
        System.out.println(x / 3);
        System.out.println(x.doubleValue());
        System.out.println(x.compareTo(y));

        /* 在 J2SE 5.0 之後可以直接 autoboxing (自動包裝)
           可以看到不用 new Integer 了 */
        Integer z = 10;
        Integer m = 30;
        System.out.println(z.compareTo(m));
        // 概念補充 -> Integer z = 10 ; 相當於編譯器幫你執行 Integer z = new Integer(10) 的意思
        // 像是這種物件在處理的時候 , 並不能當作基本資料型態來處理 , 如果沒有這種概念就容易犯錯 , 以下舉例
        Integer i1 = 100;
        Integer i2 = 100;
        if (i1 == i2) {
            System.out.println("一樣");
        } 
        else {
            System.out.println("不一樣");
        }
        // 上面會輸出一樣 
        Integer i3 = 200;
        Integer i4 = 200;
        if (i3 == i4) { // 這邊是判斷 i3 物件是否相等 i4 的物件 -> (物件牽涉到記憶體位址概念)
            System.out.println("一樣");
        }
        else {
            System.out.println("不一樣");
        }
        // 上面則會輸出不一樣 , 這是因為物件的運算操作並不像基本資料型態一樣
        /* 
        在自動裝箱時對於值從 -128 到 127 之間的值
        它們被裝箱為 Integer 物件後會存在記憶體之中被重用
        所以範例 4.6 中使用 '==' 進行比較時，i1 與 i2 實際上參考至同一個物件
        如果超過了從 -128 到 127 之間的值，被裝箱後的 Integer 物件並不會被重用
        即相當於每次裝箱時都新建一個 Integer 物件，所以範例 4.7 使用 '==' 進行比較時，i1 與 i2 參考的是不同的物件
        */
        // 正確的操作方式
        Integer i5 = 200;
        Integer i6 = 200;
        if (i5.equals(i6)) {
            System.out.println("一樣");
        }
        else {
            System.out.println("不一樣");
        }
    }
}