// 練習 exceptions 情況
// 語法糖
// try {
    // protected code
//} catch (ExceptionName e1){
    // Catch block
//}
import java.io.*;

public class Except {

   public static void main(String args[]) {
      try {
         int a[] = new int[2];
         System.out.println("Access element three :" + a[3]);
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Exception thrown  :" + e);
      }
      System.out.println("Out of the block");
   }
}