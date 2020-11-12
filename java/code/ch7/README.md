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