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
## Chapter 7
### 封裝 (Encapsulation)
- 前言 -> 學會一個支援物件導向的程式語言(如 Java)與學會物件導向(程式設計)觀念完全是兩碼子事 , 物件導向是一種對問題的思考方式 , 與任何的程式語言沒有任何直接的關係 , 物件導向也絕不僅用於程式設計領域
- 在定義類別時 , 有一個基本原則是 : 資訊的最小化公開 , 也就是說儘量透過方法來操作物件 , 而不直接存取物件內部的資料成員(也就是 Field 成員)資訊的最小化公開原則是基於安全性的考量 , 避免程式設計人員隨意操作內部資料成員而造成程式的錯誤
- 定義建構方法(建構子 , Constructor) -> 它沒有傳回值，Constructor 的作用是讓您建構物件的同時，可以同時初始一些必要的資訊，建構方法可以被 "重載"（Overload），以滿足物件生成時各種不同的初始需求
- 另一個建構方法則可以指定引數 , this() 方法用於物件內部 , 表示呼叫物件的建構方法 , 另一個關鍵字就是 "this" , 它參考至物件本身 , 7.1.5 會再詳細介紹 "this" 以進一步瞭解其作用
- 方法中宣告的 "變數名稱" 與 "類別資料成員" 的名稱同名 , 則方法中的 "變數名稱" 會暫時覆蓋 "資料成員" 的作用範圍 ; 參數列上的參數名稱也會覆蓋資料成員的作用範圍 , 如果此時要在方法區塊中使用資料成員 , 需要加上 "this"
    - "變數名稱" -> 代表 method 裡面宣告變數時賦予的 name , 以 `MethodMember.java` 來說就是 `scopeDemo()` 方法的 `int data = 100` 的 data
    - "類別資料成員" -> 代表 class 在宣告一些 attribute 的 name , 以 `MethodMember.java` 來說就是 `MethodDemo` class 下面第一行的 `private int data = 100` 的 data
    - 參考 `ch7/MethodMember.java`
- 在物件導向程式設計的過程中 , 有一個基本的原則 , 如果資料成員能不公開就不公開 , 在 Java 中若不想公開成員的資訊 , 方式就是宣告成員為 "private" , 這是 "資訊的最小化" , 此時在程式中要存取 "private" 成員 , 就要經由 setXXX() 與 getXXX() 等公開方法來進行設定或存取 , 而不是直接存取資料成員。
- Java 在使用到類別時才會載入類別至程式中 , 如果在載入類別時 , 您希望先進行一些類別的初始化動作 , 您可以使用 "static" 定義一個靜態區塊 , 並在當中撰寫類別載入時的初始化動作 , static 方法裡面要直接呼叫方法只能呼叫一樣是 static 方法 , 否則編譯會出錯
- Overload(方法重載) -> 可根據 "參數列" 的不同而自動呼叫對應的方法 , 返回值型態不可用作為方法重載的區別依據
    - 使用方法重載時 , 要注意到 autoboxing , unboxing 的問題
- 編譯器在處理重載方法 / 裝箱問題及 "不定長度引數"時 , 會依下面的順序來尋找符合的方法
    - 1. 找尋在還沒有裝箱動作前可以符合引數個數與型態的方法
    - 2. 嘗試裝箱動作後可以符合引數個數與型態的方法
    - 3. 嘗試設有「不定長度引數」並可以符合的方法
    - 4. 編譯器找不到合適的方法，回報編譯錯誤
- 遞迴方法(recursion method) -> 在方法中呼叫自己這個方法 , 遞迴的實際案例練習 "求最大公因數"
    - `UserRecursion.java`
- GC(Garbage Collection) -> 在 Java 中有 finalize() 這個方法 , 它被宣告為 "protected" , finalize() 會在物件被回收時執行 , 但您不可以將它當作解構方法來使用 , 因為不知道物件資源何時被回收 , 所以也就不知道 finalize() 真正被執行的時間
    - 確定不再使用某個物件 , 您可以在參考至該物件的名稱上指定 "null" , 表示這個名稱不再參考至任何物件 , 不被任何名稱參考的物件將會被回收資源 , 您可以使用 System.gc() 建議程式進行垃圾收集 , 如果建議被採納 , 則物件資源會被回收 , 回收前會執行 finalize() 方法

### 練習
- 有一個帳戶 , 帳戶中有存款餘額 , 您可以對帳戶進行存款與提款的動作 , 並可以查詢以取得存款餘額
    - `Account.java`
    - `AccountDemo.java`
- 實作一個數字型別陣列 `SafeArray` , 動態配置 "陣列長度" , 事先檢查存取的 Array index 是否超出長度 , 可傳回陣列長度 , 設定陣列 elements , 取得 elements
    - `SafeArray.java`
    - `SafeArrayDemo.java`
- 利用 static 區塊對於 class 在被載入的時候進行一些初始化動作
    - `SomeClass.java`
    - `StaticBlockDemo.java`
- 利用遞迴方法求最大公因數