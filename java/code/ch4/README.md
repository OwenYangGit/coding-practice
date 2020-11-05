## w3c 的 encapsulation , package / api , inheritance , polymorphism

### Encapsulation
- 目的在確保 "sensitive" 資料可以不被 user 知曉
- 作法
  - 用 "private" 定義 attributes 和 variables
  - 創建 "public" 方法(method) 來 access 或 update "private" 資料

### package / api
- package 在 java 是代表一個 "有關聯的 classes" 群組
- package 目的在於用來避免 name conflict 和 maintainable
- package 可以分為兩種
  - build-in Packages (package from java api 預設包?) // The Java API is a library of prewritten classes
  - user-defined packages (自己寫)

### Inheritance
- 在 java 可以從一個 class 繼承另一個 class 的 attributes 和 method , inheritance concept 有兩個種類
  - superClass
  - subClass
- 在 Inheritance 的關鍵字為 "extends"