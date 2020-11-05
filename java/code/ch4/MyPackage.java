// The package name should be written in lower case to avoid conflict with class names. packege 名稱採用小寫
package mypack;
class MyPackage {
  public static void main(String[] args) {
    System.out.println("This is my package!");
  }
}
// javac -d . MyPackage.java
// The -d keyword specifies the destination for where to save the class file.
// !!! execute !!!
// java mypack.MyPackage