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