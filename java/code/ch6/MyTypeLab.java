public class MyTypeLab {
    public static void main(String[] args) {

    // double 可以存放從 1.7e-308 到 1.7e+308 , 必須在 value 的最後用 "d" 結尾
    double myNum = 19.99d;
    System.out.println(myNum);

    // 使用 double 比 float 更精密 , float 大約小數點後 6~7 位 , double 可以到 15 位
    float f1 = 35e3f;
    double d1 = 12E4d;
    System.out.println(f1);
    System.out.println(d1);
    }
}