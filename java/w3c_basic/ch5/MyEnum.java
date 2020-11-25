// 枚舉在 w3c 的解釋說明 : 枚舉代表一組特定的順序清單 , 是 enumerations 的縮寫
public class MyEnum {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
        }
    public static void main(String[] args){
        Level myVar = Level.MEDIUM;
        System.out.println(myVar); // output: MEDIUM

        // enum 搭配 switch 的應用
        switch(myVar) { // output: MEDIUM level
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("MEDIUM level");
                break;
            case HIGH:
                System.out.println("HIGH level");
                break;
        }
        // enum 類別有一個特別的方法 values() , 可以用來 return 所有 enum 中定義的常數(constants)
        // loop 範例
        System.out.println("----- loop example -----");

        for (Level myVar2 : Level.values()) {
            System.out.println(myVar2);
        }
        // output:
        // LOW
        // MEDIUM
        // HIGH
    }
}