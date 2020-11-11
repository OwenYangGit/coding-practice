## ArrayList 陣列清單
- ArrayList 是一個類別 , 可以 "重新定義陣列的大小" (resizable array) , 在 java.util package 可以被找到
- 內建的 array 和 ArrayList 兩者的差異就是 , 內建 array 的大小不能被修改 , 你如果想要 增加/移除 陣列的元素, 你必須重創建一個 array , 但是 ArrayList 可以隨意的 增加/移除 陣列的元素

## LinkedList
- 跟 ArrayList 差不多
- 跟 ArrayList 的差異
    - LinkedList 跟 ArrayList 一樣 , 可以作為一個 "存放相同 type 元素的集合"
    - LinkedList 可以調用跟 ArrayList 的所有方法 , 因為它們都 implements `List` 這個 interface
    - 雖然可以用相同的方式操作 ArrayList 跟 LinkedList , 但是它們的寫法非常不同
- ArrayList 如何工作?
    - 一開始它創建在 java 中原始的 array 來存放 elements , 但當 size 不夠時 , 它將重新構建一個符合 size 的全新 array , 然後將新的 array 取代掉舊的 array
- LinkedList 如何工作?
    - LinkedList 存儲 item 到 "container" 裡面 , 這個 list 被創建出來時 "它擁有一個連結指向 first container" , 之後的 container 都會存放 "指向 next container 的連結" (所以每個 container 都知道接下來的資料存放在哪一個 container)
- 甚麼時候用 ?
    - 適合用 ArrayList 的時機
        - 你想要頻繁的 "隨機訪問 items"
        - 你僅想要 "增加/移除在 list 的最後一個 elements"
    - 是合用 LinkedList 的時機
        - 你只是想要透過 loop 的方法訪問 list 的 items 而不是隨機訪問 list 裡的 items
        - 你需要頻繁的操作在 list 中 "第一個或中間的 elements"

## Data Types 資料型別 (這邊是之前沒有特別細看的章節 , 回來重看)
- Java 的原始資料型別只有
    - byte , short , int , long , float , double , boolean , char
- 不屬於 Java 原始的資料型態
    - string , array , class
- String 型別在 java 中已經被廣泛使用和整合 , 有人稱其為 "特殊的第九種型別" (在 java , String 是由 primitive type 的 `char` 寫出來的物件)
- 談談 non-primitive 資料型別吧
    - non-primitive data types 又被稱為 reference types , 因為它們對應到物件(refer objects)
- primitive data types 與 non-primitive data types 的差別
    - primitive 是預先定義在 Java 內的 , non-primitive 是被 programmer 創造出來的 , 沒有被定義在 Java (:star:除了 String)
    - non-primitive data types 可以被用來呼叫 method 去執行特定的動作 , primitive data types 不行
    - 一個 primitive type 會一直存在一個 value , 但是 non-primitive type 可以是 `null`
    - primitive type 是用小寫開頭 , non-primitive type 則是大寫開頭
    - primitive type 的大小取決於 "資料型別(data type) , 但 non-primitive 的大小都是同樣的

## HashMap 不知道怎麼翻 XD
- 在 HashMap 存儲 data 的方式是以 "key/value" 的形式 , 可以利用不同 type 的 index 去訪問資料
- object(key 又稱為 index) to object(value) , 這句很難翻 , 總體來說兩邊都是物件 , 但在 HashMap 的結構下 , 前後有不同的名詞定義
- 舉例來說
    - 可以用 `String` 為 key 和 `Integer` 當 value (不同型別的 key/value pairs), 也可以 `String` 的 key 和 `String` 的 value (相同型別的 key/value pairs)

## HashSet 這也不知道怎麼翻
- 