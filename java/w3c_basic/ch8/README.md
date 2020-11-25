# 檔案處理 (W3S 最後一部分)

## Files
- 檔案處理在 application 是非常重要的一環
- Java 有一些 method 可以去 創建/讀取/更新/刪除 檔案

# 其他補充

## 在 java 中 , 所有的 class 其實都是繼承自 object 這個 class 的 
- `Object class 在 java.lang 包中，編譯時自動導入，我们創建一个 class 時，如果沒有明確繼承一个 super class，那麼它就會自動繼承 Object，成為 Object 的 subclass`
- [參考資料](https://www.runoob.com/java/java-object-class.html)
- 案例 - 顯式繼承
```
public class MyClass extends Object {

}
```
- 案例 - 隱式繼承
```
public class MyClass {

}
```

## Generic 泛型
- 參數化型態 , 極難理解
    - 簡單說就是我們在創建 "類別" 的裡面的 method 時 , 不需要明確定義 method 參數的資料型別 , 而是透過泛型的方式在 class 被創建出來時定義一個變數的參數 , 該變數參數可以去代入 class 內的 method
    ```
    # 例如 - 這代表創建 move 方法 , 該方法必須代入一個 String 型別的參數
    void move (String x){

    }
    ```
    ```
    # 例如 - 使用泛型創建一個有變數參數的 class
    public class MyClass<T> {
        void move(T x) { # 這邊的 T 就是由 class 的 <T> 去代入的資料型別

        }
    }
    ```
- 明確範例 -> `MyGen.java`