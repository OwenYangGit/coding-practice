## Iterator 迭代器
- 迭代器是一個被用來對 collections 進行迴圈動作的 object , 像是 ArrayList 和 HashSet
- 要使用 Iterator 要 import java.util 套件

## Wrapper classes 包裝類別
- wrapper classes 提供一種方法去使用 primitive data types 變成一個 objects
- 你有時候會遇到只能使用 object , 無法用 primitive 的情況 , 像是 ArrayList , 它的 list 裡面只能存放 object 的 item
### primitive data types 與 Wrapper Classes 對照表
|primitive data types | object |
|:-------------------:|:------:|
| byte                | Byte   
| short               | Short
| int                 | Integer
| long                | Long
| float               | Float
| double              | Double
| boolean             | Boolean
| char                | Character

## Exceptions try ... cache 例外處理
- 主要就是做錯誤處理 , 然後丟出 (throw exceptions/errors)
- 該章節還有兩個關鍵字的使用
  - finally : try ... cache 執行完後會執行的 statements
  - throw : 可以用來 custom error , java 有非常多 exceptions type , 像是 `ArithmeticException` , `FileNotFoundException` 等等等...

## Regular Expressions 正則表達式
- regular expressions 是一種對於 "字母排序的搜索格式(search pattern)" , 當需要對一筆資料做搜尋 , 可以利用這種 "搜索格式(search pattern)" 去描述出你想要查找的結果
- regualr expressions 可以只是一個字母 , 又或是複雜的 pattern
- regular expressions 可以被用來執行 "查找文字" 和 "取代文字"
- Java 沒有內建的 regular expressions 類別 , 但可以用 java.util.regex 套件去使用 regular expressions , 該套件有三個 class
  - Pattern : 定義 pattern 
  - Matcher : 針對 pattern 進行搜索
  - PatternSyntaxException : 代表 Pattern 語法錯誤

## Threads 線程
- Threads 可以更有效的在同一時間執行多項事務(doing multiple things)
- Threads 可以被用來執行複雜的任務 , 並放在背景執行不去中斷 main 程式 (main program)
- 有兩種方式可以創建 Thread
  - 一種是 extends `Thread` class 和 overriding `run()` 方法
  - 另一種是 implement `Runnable` 的 interface
- extending 和 implements 不同的地方在於 `當你的 class extends Thread 之後就無法再 extends 其他 class , 但是你 implements Runnable 還是可以 extends 其他 class` for example : `MyClass extends OtherClass implements Runnable`
- 併發問題 : 因為 thread 在同時間跑程式的時候 , 你實際並不知道那段程式碼在何時被運行 , 那麼當你在多個 thread 運行時去處理同一個變數 , 那個變數的值(value)將會變得不可預期 , 這類問題造成的結果被稱為 "併發問題"
  - 參考 `MyConcurrentProblem.java`
- 為了避免 Concurrent Problem , 最好的方式是分享一些 attributes 在每個 threads 之間 , 當 attributes 需要被分享 , 一個可能的解法在 thread 裡面使用 `isAlive()` 方法去檢查其他 thread 是否在你當前 thread 想要修改某些 attributes 已經完成它的 job
  - 參考 `MyThreadAlive.java`

## Lambda Expressions 不知道怎麼翻 ( w3c Java classes 最後一篇)
- lambda 在 java8 後被引入
- 一個 lambda expression 是一個代入參數後返回一個值得簡短程式區塊(short block of code)
- lambda 非常像 method , 但是不需要為 lambda expression 命名 ,  且 lambda expression 可以在 method 裡面被使用
- lambda 語法
  - 單一參數
    - parameter -> expression
  - 多參數
    - (parameter1 , parameter2) -> expression
  - 表達式的功能很有限 , 它必須及時的返回一個值 , 且不能包含變數(contain variables) , 不能包含一些複雜的操作 `if` `for` 等等 , 因此如果要使用更多複雜操作 , code block 的方式更適合 , 如果該 code block 的 labmda expression 需要返回值 , 它需要有一個 `return` 的語段
    - (parameter1 , parameter2) -> {code block}
- lambda expression 可以被存在一個變數裡面 , 該變數必須要是一個只有單一 method 的 interface , 在該方法內 , 這個 lambda expression 也應該有相同數量的 parameters 和一樣的 return 資料型別(data type)
  - Java built-in 有許多這種類型的 interface , 像是 `Comsumer` interface (在 java.util package)