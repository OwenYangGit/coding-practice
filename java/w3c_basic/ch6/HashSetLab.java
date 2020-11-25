import java.util.HashMap;
import java.util.HashSet;

public class HashSetLab {
    public static void main(String[] argds ) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("BMW"); // 重複項 , 即使我們添加了兩次 , 它還是僅有一個 , 因為 HashSet 每個 item 都必須是獨一無二的
        System.out.println(cars); //output [Volvo, Mazda, Ford, BMW]
        // 檢查 item 是否有在裡面 contains()
        System.out.println("----- 檢查 item 是否存在 , contains() -----");
        boolean result = cars.contains("Mazda");
        System.out.println(result);
        // 清除 item 
        System.out.println("----- 刪除 item , remove() -----");
        cars.remove("Volvo");
        System.out.println(cars);
        //查看 Size
        System.out.println("----- 檢查 size , size() -----");
        int carsNum = cars.size();
        System.out.println(carsNum);
        // 迴圈範例
        System.out.println("----- 迴圈範例 -----");
        for (String i : cars) {
            System.out.println(i);
        }
        // 清除所有 item
        System.out.println("----- 清除所有 item , clear() -----");
        cars.clear();
        System.out.println(cars);
        // 其他型別案例
        HashSet<Integer> num = new HashSet<Integer>();
        num.add(1);
        num.add(3);
        num.add(5);
        num.add(7);
        for (int i = 1 ; i <= 10 ; i++ ){
            if (num.contains(i)) {
                System.out.println(i + " was found in the set");
            } else {
                System.out.println(i + " was not found in the set");
            }
        }
    }
}