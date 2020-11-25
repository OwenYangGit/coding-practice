public class methodParam {
  static void myMethod(String fname) {
    System.out.println(fname + " Refsnes");
  }
  static void otherMethod(String fname , int num){
    System.out.println(fname + " awesome!");
    System.out.println("Add 1 to num = " + (num+1));
  }
  static String returnMethod(String result){ // 注意要回傳不能有 void , 而且要定義回傳的型別
    System.out.println("This method will return your parameter for you");
    return result;
  }

  public static void main(String[] args) {
    myMethod("Liam");
    myMethod("Jenny");
    myMethod("Anja");
    otherMethod("demo",3);
    returnMethod("I don't know what I do!");
    String storeReturn = returnMethod("Store return values"); // 保存 method 的 value
    System.out.println(storeReturn);
  }
}