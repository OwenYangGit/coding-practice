# 進階 java 概念與操作

## OOP 前言
撰寫程式是關於'寫下操作資料的一系列流程或方法'，而物件導向程式是關於'將資料與方法定義為物件並進行操作'
### 參考資料
- [procedural programming vs object-oriented programming](https://www.geeksforgeeks.org/differences-between-procedural-and-object-oriented-programming/)

### 閱讀資料
- [w3c](https://www.w3schools.com/java/default.asp)
- [tutorialpoint](https://www.tutorialspoint.com/java/index.htm)

## OOP 之於 procedural programming 的優勢
- 某些情況下 OOP 更快速且更易於執行
- OOP 有在程式碼中有更明確的結構定義
- OOP 使得 JAVA 擁有 DRY "Don't repeat yourself" 更好維護，修改的特性
- OOP 使得開發人員能夠更易於創造可重用性的程式碼以及更少的程式碼實現功能和降低開發時間

## java practice document

### DemoClass
- 學習 class 的 method 調用
- 了解 static 和 non-static(public) method 的差異性

### Car , CarLab
- 學習在其他檔案的 main() 使用物件調用 class

### access modfiers
- 對 classes 來說
  - public 可以被任何其他的 class 訪問
  - default 只能夠被同一個 package 下的 class 訪問
- 對 attributes , methods 和 constructors 來說
  - public 可以被任何其他的 class 訪問
  - private 只能在有被 class 定義下的 class 訪問
  - default 只能被同一個 package 下的 class 訪問
  - protected 只能被同一個 package 和 subclass 訪問

### non-access modfiers
- 以 classes 來說
  - final 這種 class 不能被繼承
  - abstract 這種 class 不能被 new 成物件 (也就是說這種 class 一定是被某個 class 繼承拿來做使用的)
- 以 attributes , methods 來說
  - final 這種 arrtributes , methods 不能被修改
  - static 這種 attributes , methods 屬於 class 並不是物件
  - abstract 只能被用在 abstract class 內 , 且只有 methods 能使用 , 該 abstract method 不會有內容 (內容會在 subclass 定義)
  - transient 這種 attributes 或 methods 會忽略序列化 (serializing)
  - synchronized 這種 methods 只能一次被一個 thread 使用
  - volatile 這個 attributes 不會被 cached 在 thread-locally , 它總是從 main memory 被讀取

### Except
- 練習 java 例外狀況處理
- 存在 exceptions 的目的在於能夠防止程式在運行狀態中因為意外導致的運行中斷
- 例外常見的情況有幾種
  - 1. 使用者輸入了非常規的資料 ( invalid data )
  - 2. 檔案需要被打開 , 但找不到該檔案
  - 3. 網路連線有問題
  - 4. jvm 超用了記憶體
- 這種意外有時是 user , 有時是 programmer , 有時是物理問題 physical
- 異常種類說明
  - 被檢查出的異常 checked exceptions
    - 通常泛指編譯器在 compile 時就檢查出的異常 example 你要讀某個檔，該檔案卻不存在
  - 未被檢查出的異常 unchecked exceptions
    - 通常泛指編譯過 , 在執行時會出現的異常 example 你宣告了一個 5 index 的陣列 , 在程式碼中卻試圖操作第 6 個 index
  - 錯誤 error
    - 這些不屬於 exceptions , 它是 end users 或 programmer 無法控制的問題 example stackoverflow
- java 的異常結構
![exception hierarchy](../image/exceptions1.jpg)
  - 所有異常都屬於 java.lang.Exception 子類 , 該類是屬於一個 Throwable 類
  - errors 是一種嚴重的失敗 , 無法透過 java 程式去 handled , 這種錯誤往往都是出現在運行環境

#### Except.java
一些常見的 Exceptions methods