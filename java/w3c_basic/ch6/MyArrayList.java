// 練習操作 ArrayList
import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.Collections;

public class MyArrayList {
    public static void main(String[] args) {
        // ArrayList 有很多好用的 method , 例如 add()
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        ArrayList<String> games = new ArrayList<String>();
        games.add("Ragnarok");
        games.add("League of Legends");
        games.add("Princess connect redive");
        // output [Volvo, BMW, Ford, Mazda]
        // 取得 item , get()
        String getCarItem = cars.get(0);
        System.out.println(getCarItem);
        // output Volvo
        // 修改 item , set()
        String changeCarItem = cars.set(0,"Opel"); // 發現它會返回被替換掉的 item 回來
        System.out.println(changeCarItem); // 返回 Volvo
        System.out.println(cars);
        // output [Opel, BMW, Ford, Mazda]
        // 清空 ArrayList , clear()
        cars.clear();
        System.out.println(cars);
        // output []
        // 查看 ArrayList 有多少 elements , size()
        int gamesSize = games.size();
        System.out.println(gamesSize);
        // 迴圈範例
        System.out.println("----- 迴圈範例 -----");
        for (int i = 0 ; i < games.size() ; i++ ) {
            System.out.println(games.get(i));
        }
        System.out.println("----- For-each 範例 -----");
        // for-each 迴圈範例
        for (String i : games) {
            System.out.println(i);
        }
        // elements 在 ArrayList 裡面都是 objects , 上面的範例 , String 的 ArrayList 每一個 String 都是物件 (注意, 在JAVA , String 並不是原始資料型態[primitive type])
        // 以下練習其他 type , 例如 integer
        System.out.println("----- 練習其他型態 -----");
        ArrayList<Integer> myNums = new ArrayList<Integer>();
        myNums.add(10);
        myNums.add(30);
        myNums.add(20);
        myNums.add(40);
        for (int i : myNums) {
            System.out.println(i);
        }
        // 另一個在 java.util 包裡面的好用的 class "Collections" , 它有一個 sort() 方法可以拿來排序 "字母" 和 "數字"
        System.out.println("----- 練習 Collections 的 sort() 方法");
        System.out.println(myNums); // 排序前
        Collections.sort(myNums);
        System.out.println(myNums); // 排序後
        // 按序輸出
        for (int i : myNums) {
            System.out.println(i);
        }
    }
    // 這邊有提到一點 Wrapper classes 了 , 可以看到語法是 "ClassName<type>"
}