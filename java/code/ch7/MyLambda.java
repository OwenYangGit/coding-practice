import java.util.ArrayList;

public class MyLambda {
    // 使用 lambda 搭配 ArrayList 的 forEach() 方法
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<Integer>();
        n.add(5);
        n.add(6);
        n.add(13);
        n.add(8);
        n.forEach( (i) -> { System.out.println(i); } );
    }
}