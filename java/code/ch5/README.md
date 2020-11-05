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