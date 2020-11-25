import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyDateLab {
    public static void main(String[] args) {
        // display Date
        LocalDate myObj = LocalDate.now();
        System.out.println(myObj);
        // display Time
        LocalTime myObj2 = LocalTime.now();
        System.out.println(myObj2);
        // display Date and Time
        LocalDateTime myObj3 = LocalDateTime.now();
        // 格式化輸出時間 , 拿掉秒的小數點 , 我們使用 DateTimeFormatter 的 ofPattern() 方法
        LocalDateTime myObj4 = LocalDateTime.now();
        System.out.println(myObj4); // format 前
        DateTimeFormatter myObj4Format = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH:mm:ss");

        String myResult = myObj4.format(myObj4Format);
        System.out.println(myResult); // format 後
        
    }
    // 這邊有我去看一下為啥像這種 package 的 class 要調用時 , 不用先 new 一個物件 , 但不太理解 
    // 好像是因為底層已經有 new 過了 , 基於不重複程式碼的緣由
    // (應該是調用時每次都一定會先需要 new , 如果每一個引用的套件都 new 一次就會很可怕 , 所以套件的開發人員的寫法改變 ) 
    // stackoverflow 有人說這好像更偏向於 design pattern 的問題 
    // 參考資料: https://stackoverflow.com/questions/12254553/why-some-classes-dont-need-the-word-new-when-creating-its-instance
    // 有句話我比較在意 , 他這邊提問是以 Logger 的 package 為例
    // Also note that your example may not involve a new object at all. 你的範例可能不會調用到新的物件
    // That Logger function might be returning an old object, not a new one. Logger 的 package 可能只返回舊的物件而不是新的
}