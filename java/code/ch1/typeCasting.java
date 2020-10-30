public class typeCasting {
    public static void main (String[] arg){
        // widening casting
        int first = 20;
        double second = first;
        second = first+0.7;   
        System.out.println(second);
        // java 的 double 和 float 是不建議拿來在商業上做貨幣運算的
        // narrowing casting
        double myDouble = 9.78;
        int myInt = (int) myDouble; // Manual casting: double to int
        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9        
    }
}