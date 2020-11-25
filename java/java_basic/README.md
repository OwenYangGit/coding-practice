## 目的
#### 為了補全之前練習忽略的一些 java 其他基礎部分

## 參考資料
- [閱讀 JAVA SE 6 的 github markdown 筆記書 - 筆者為 openhome 的部落格創始人](https://github.com/JustinSDK/JavaSE6Tutorial)

## Chapter 4
### 從 autoboxing , unboxing 認識物件
- 學會了 java 的基本型態 , 這些在 J2SE 5.0 前預設並不是以物件的形式存在 , 您必須親自將之包裹為物件 , 然後才能像物件一樣的操作它
- 在 J2SE 5.0 開始為基本型態提供了自動裝箱(autoboxing)/拆箱(unboxing)的功能 , 讓您在將基本型態轉換為物件時更為方便 , 而從中您也可以體會到基本型態與物件的差別
- 有必要瞭解如何親自包裹基本型態 , 這有助於您瞭解物件與基本型態的差別
### ch4 練習
- 取得系統時間
- 簡易的 user login 功能
- 包裝基本資料型態

## Chapter 5
### 陣列
- 在 Java 中 , 陣列不僅僅是一組資料群組 , 當您宣告一個陣列時 , 也就是在生成一個陣列物件 , 將陣列當作物件來操作 , 比傳統上的一些程式語言只將陣列當作資料群組多了不少好處

## Chapter 6
### 字串
- 字串的本質是字元（char）型態的陣列
- 關於 String 的一些重要觀念
```
一個 String 物件的長度是固定的，您不能改變它的內容，或者是附加新的字元至 String 物件中，
您也許會使用 '+' 來串接字串以達到附加新字元或字串的目的，但 '+' 會產生一個新的 String 實例，
如果您的程式對這種附加字串的需求很頻繁，並不建議使用 '+' 來進行字串的串接，在物件導向程式設計中，
最好是能重複運用已生成的物件，物件的生成需要記憶體空間與時間，不斷的產生 String 實例是一件沒有效率的行為。

在 J2SE 5.0 開始提供 java.lang.StringBuilder 類別，使用這個類別所產生的物件預設會有 16 個字元的長度，
您也可以自行指定初始長度，如果附加的字元超出可容納的長度，則 StringBuilder 物件會自動增加長度以容納被附加的字元，
如果您有頻繁作字串附加的需求，使用 StringBuilder 會讓程式的效率大大提昇，來寫個簡單的測試程式就可以知道效能差距有多大。

public class AppendStringTest {
    public static void main(String[] args) {
        String text = "";

        long beginTime = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++)
            text = text + i;
        long endTime = System.currentTimeMillis();
        System.out.println("執行時間：" + (endTime - beginTime));

        StringBuilder builder = new StringBuilder("");
        beginTime = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++)
            builder.append(String.valueOf(i));
        endTime = System.currentTimeMillis();
        System.out.println("執行時間：" + (endTime - beginTime));
    }
}
# output
執行時間：4641
執行時間：16
```
- 關於 StringBuilder 與 StringBuffer
```
StringBuilder 被設計為與 StringBuffer 具有相同的操作介面，在單機非「多執行緒」（Multithread）的情況下使用 StringBuilder 會有較好的效率，
因為 StringBuilder 沒有處理「同步」（Synchronized）問題；
StringBuffer 則會處理同步問題，如果您的 StringBuilder 會在多執行緒下被操作，則要改用 StringBuffer，讓物件自行管理同步問題
```