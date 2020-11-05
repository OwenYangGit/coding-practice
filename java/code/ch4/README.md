## w3c 的 encapsulation , package / api , inheritance , polymorphism

### Encapsulation 封裝
- 目的在確保 "sensitive" 資料可以不被 user 知曉
- 作法
  - 用 "private" 定義 attributes 和 variables
  - 創建 "public" 方法(method) 來 access 或 update "private" 資料

### package / api 套件
- package 在 java 是代表一個 "有關聯的 classes" 群組
- package 目的在於用來避免 name conflict 和 maintainable
- package 可以分為兩種
  - build-in Packages (package from java api 預設包?) // The Java API is a library of prewritten classes
  - user-defined packages (自己寫)

### Inheritance (Car.java) 繼承
- 在 java 可以從一個 class 繼承另一個 class 的 attributes 和 method , inheritance concept 有兩個種類
  - superClass
  - subClass
- 在 Inheritance 的關鍵字為 "extends"
- 甚麼時候用 Inhritance
  - 當新的 class 需要重用舊的 class 的 attributes 和 methods 時 (增加程式碼的可重用性)
- 如果不想讓其他 class 繼承呢?
  - 使用 final 定義 class : `final class <classname>`

### Polymorphism 多型 (MyAnimal.java)
- 多型發生在當我們擁有很多 class 透過繼承其他 class 關聯在一起的時候
- 僅僅是一種概念的寫法 (並不是強迫性一定要這樣寫 , 但是這樣寫會好閱讀很多)