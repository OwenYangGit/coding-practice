class OuterClass {
  int x = 10;

  class InnerClass {
    int y = 5;
  }
  // Unlike a "regular" class, an inner class can be private or protected. 
  // If you don't want outside objects to access the inner class, declare the class as private
  private class PrivateInner {
      int z = 10;
  }
  // An inner class can also be static, which means that you can access it without creating an object of the outer class
  static class StaticInner {
      int p = 20;
  }
  // 關於從 inner class 訪問 outer class 的作法 
  // 在 inner class 創建 method , 該 method 返回的結果跟 outer class 有關聯
  class ReOuterInner {
      public int myReOuterInnerMethod() {
          return x;
      }
    }
  }

public class InnerDemo {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();    
    System.out.println(myInner.y + myOuter.x);

    // 如果是 private 的 inner class , 不能被外部訪問
    // OuterClass.PrivateInner myPriInner = myOuter.new PrivateInner(); // compile error
    // System.out.println(myPriInner.z + myOuter.x); // private inner

    // 如果是 static 的 inner class , 不需要創建 OuterClass 物件
    OuterClass.StaticInner myStaticInner = new OuterClass.StaticInner();
    System.out.println(myStaticInner.p);
    // just like static attributes and methods, a static inner class does not have access to members of the outer class
    // System.out.println(myStaticInner.x); // compile error

    // 從 inner class 訪問 outer class
    OuterClass.ReOuterInner myReOut = myOuter.new ReOuterInner();
    System.out.println(myReOut.myReOuterInnerMethod());
  }
}