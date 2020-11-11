// 練習操作 ArrayList
import java.net.InterfaceAddress;
import java.util.ArrayList;

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
        // 
    }
}