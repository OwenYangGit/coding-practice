// 練習 interface 使用操作及了解特性
// 創造一個老師介面 , 定義老師的資訊
interface teacher {
    public String response(String result); // 會回答問題
    public void anger(); // 會生氣
    int age = 25; // 年輕老師
    String name = "Emiya"; // 老師名
}
// 學校裡面有老師
class School implements teacher {
    // 定義老師生氣都會講啥
    public void anger(){
        System.out.println("You will the end in my hand !");
    }
    // 定義老師回答會因應學生提問而回傳 (這邊可以寫邏輯)
    public String response(String questions){
        return questions;
    }
}

public class MyInterface {
    public static void main(String[] args){
        School mySchool = new School();
        System.out.println("學校老師年紀: " + mySchool.age);
        mySchool.anger();
        System.out.println(mySchool.name + "老師我想提問!");
        System.out.println(mySchool.response("想問甚麼呢!?"));
    }
}