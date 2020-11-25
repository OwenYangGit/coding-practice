import java.util.HashMap;

public class HashMapLab {
    public static void main (String[] args) {
        // String key 與 String value 範例
        HashMap<String, String> citys = new HashMap<String , String>();
        // 新增 key/value 資料組
        citys.put("England", "London");
        citys.put("Germany", "Berlin");
        citys.put("Norway", "Oslo");
        citys.put("USA", "Washinton DC");
        System.out.println(citys);
        // 訪問 item 
        String favCity = citys.get("USA");
        System.out.println(favCity);
        // 移除 item
        citys.remove("England");
        System.out.println(citys);
        // 清除所有 item
        citys.clear();
        System.out.println(citys);
        // 查看有多少 item , 重新建立一個新的 HashMap
        HashMap<String , String> games = new HashMap<String , String>();
        games.put("Top","Ragnarok");
        games.put("Second", "Princess connect redive");
        games.put("Third","League of legends");
        int gameSize = games.size();
        System.out.println(gameSize); // output 3
        // 迴圈練習 , keySet() 方法可以取得 key , values() 方法可以取得 value
        System.out.println("----- 迴圈練習取 key -----");
        for (String i : games.keySet()) {
            System.out.println(i);
        }
        System.out.println("----- 迴圈練習取 value -----");
        for (String i : games.values()){
            System.out.println(i);
        }
        System.out.println("----- 迴圈練習取 key value 打印出來 -----");
        for (String i : games.keySet()) {
            System.out.println("key: " + i + " value: " + games.get(i));
        }
        // 不同型別的練習
        System.out.println("----- Other Types -----");
        HashMap<String , Integer> people = new HashMap<String , Integer>();
        people.put("Emiya",22);
        people.put("Saber", 25);
        people.put("Tosaka", 22);
        
        for (String i : people.keySet()) {
            System.out.println("Name: " + i + " Age: " + people.get(i));
        }
    }
}