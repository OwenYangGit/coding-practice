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