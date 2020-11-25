import java.util.ArrayList;
import java.util.Iterator;

public class IteratorLab {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        // 取得迭代器
        Iterator<String> it = cars.iterator();
        // 打印第一個 item
        System.out.println(it.next());
        // 迴圈操作 collections
        System.out.println("----- 迴圈操作 collections -----");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        // 從 collections 刪除 item
        System.out.println("----- 從 collections 刪除 item -----");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        Iterator<Integer> it2 = numbers.iterator();
        while (it2.hasNext()) {
            // 從 numbers 這個 collections 刪除小於 10 的 integer
            Integer i = it2.next();
            if (i < 10) {
                it2.remove();
            }
        }
        System.out.println(numbers);
    }
    // Trying to remove items using a for loop or a for-each loop would not work correctly 
    // because the collection is changing size at the same time that the code is trying to loop.
    // 嘗試用 for 或 for-each 去迴圈刪除 item 並不會成功 , 因為 collections 會隨著操作導致 size 跟著變化
}