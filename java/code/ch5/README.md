## Inner Classes 內嵌類別
- 在 java 是可以寫巢狀類別的 (類別裡面還有類別)
- 目的是在於讓這些類別可以做一個 group 讓程式碼好讀和好維護

### 小結論
modifiers 概念很重要 , 在這麼多類別中使用不同概念操作程式碼的時候 , 必須要很清楚自己在操作甚麼邏輯 , 否則很容易有問題 = ="

## abstraction 抽象
- 抽象的目的在於 "隱藏特定的細節並顯示必要的資訊給 user 即可"
- 抽象可以分為
  - 抽象類別 abstract class
  - 抽象介面 abstract interface
- abstract 是 non-access modifier -> 可用於 class 和 method
  - abstract class 抽象類別用於限制 class 不能被 new 成 object
- 用在 class 和 method 說明
  - 抽象 class : 限制 class 不能被用來創建 object (如果要拿來使用 , 必須要被繼承 inherit 在其他 class 裡面)
  - 抽象 method : 只能 "被用在抽象 class 裡" , 且創建不會有 body , body 會放在 subclass 裡宣告 
- 甚麼時候用抽象
  - 為了安全性 , 如同第一項說明的 , 隱藏特定的資料 , 並顯示必須要顯示的資料給 user 即可
  - 抽象的功能也可以用 interface 來達到

## interface 介面
- 另一種達到抽象功能的方式
- interface 是一個完整的 abstract class (抽象類別) , 是一個 "相關聯 method 的群組"  , 且 method 的 body 皆為空
- 想要操作(使用) interface 的 method 需要透過其他 class "inplements" interface 來使用(像是繼承的 inherit)
- interface 定義的空 body 方法將在 "inplement class" 中定義
- interface 核心重點
  - interface 跟抽象類別一樣 , 不能被 new 成物件
  - interface 的方法是不能有 body 的 , body 會被定義在 implement class 裡面 (介接類別)
  - 關於一個實作介接完成的 interface , 你必須定義清楚 interface 裡每一個 method 的 body
  - interface 的 method 預設為 abstract 且為 public
  - interface 的 attribute 預設為 public static 且為 final
    - 其實不難理解介面預設的 modifiers 為上述這些 , 因為 interface 像在定義最終的資料格式 , 他不應該輕易的被更改 , 但是可以被輕易的呼叫出來去使用 
- 甚麼時候用 interface (介面)
  - 為了安全 (跟抽象類別一樣)
  - :star: Java 不允許多重繼承 (就是一個類別只能繼承一個父類 , 不能有多個父類 = 只能有一個 super class) , 但是介面(interface)可以多個 class 介接(implements)
    - 這就像一個人只能有一個爸爸 , 但是可以有很多個老師 (SuperClass 就像爸爸 , interface 就像老師)