public class methodOverloading{ // 在不同型別的狀況下 method 允許用相同名稱創建代入不同型別參數的 method
    static int plusMethodInt(int x, int y) {
        return x + y;
}

    static double plusMethodDouble(double x, double y) {
        return x + y;
}
    static int plusMethod(int x, int y) { // int 型別的 plusMethod
        return x + y;
    }

    static double plusMethod(double x, double y) { // double 型別的 plusMethod
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
        // 調用 plusMethod 方法
        int myNum3 = plusMethod(8, 5);
        double myNum4 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum3);
        System.out.println("double: " + myNum4);
    }
}