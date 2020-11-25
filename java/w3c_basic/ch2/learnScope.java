public class learnScope { // 練習 code scope 概念 , 主要是要知道程式碼執行的過程是有順序的 , 並非隨意執行 .
                          //且變數的宣告是會隨著程式碼區塊流動的 , 並非所有地方都可以被認得 
  public static void main(String[] args) {

    // Code here CANNOT use x

    { // This is a block

      // Code here CANNOT use x

      int x = 100;

      // Code here CAN use x
      System.out.println(x);

   } // The block ends here

  // Code here CANNOT use x

  }
}