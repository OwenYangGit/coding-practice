import java.util.Scanner;

// 範例 : 調用 Scanner 的 nextLine() 方法
class MyInput {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("輸入使用者名稱");

        String username = myObj.nextLine();
        System.out.println("你的名稱是: " + username);
        // 上述的 nextLine() 方法是用來讀取 string 型別的 input , 當然也有其他的 , 像是 nextBoolean() / nextByte() / nextDouble() / nextFloat() / nextInt() ....
        // 下面練習用其他 method (方法) 來讀取不同型別的 input
        System.out.println("請輸入年紀");
        int age = myObj.nextInt();

        System.out.println("請輸入薪資");
        Double salary = myObj.nextDouble();

        System.out.println("你的年紀是: " + age);
        System.out.println("你的薪資是: " +  salary);
    }
    // 記住 java 型別是很重要的 , 當輸入的型別不對 , 那該方法是會報 exception 錯誤的
}