// 沒有泛型的寫法 , 設定兩種不同型態的 座標類別

// 設置 Integer 型態的點座標
class IntegerPoint{  
    private Integer x ;       // 表示 X 座標 
    private Integer y ;       // 表示 Y 座標  
    public void setX(Integer x){  
        this.x = x ;  
    }  
    public void setY(Integer y){  
        this.y = y ;  
    }  
    public Integer getX(){  
        return this.x ;  
    }  
    public Integer getY(){  
        return this.y ;  
    }  
}

// 設置 Float 型態的點座標
class FloatPoint{  
    private Float x ;       // 表示 X 座標 
    private Float y ;       // 表示 Y 座標  
    public void setX(Float x){  
        this.x = x ;  
    }  
    public void setY(Float y){  
        this.y = y ;  
    }  
    public Float getX(){  
        return this.x ;  
    }  
    public Float getY(){  
        return this.y ;  
    }  
}

// 僅因為不同型別就分兩個類別 , 這樣不是有重複性了? -> 因此下面展示寫成一個類別的寫法
// 把屬性都繼承自 Object 這個 Class 來宣告
class ObjectPoint {
    private Object x ;
    private Object y ;
    public void setX(Object x){
        this.x = x ; 
    }  
    public void setY(Object y){
        this.y = y ;
    }  
    public Object getX(){
        return this.x ;
    }  
    public Object getY(){
        return this.y ;
    }
}
// 而當全部使用 Object 類別來宣告時 , 使用方式是這樣的
public class MyGen {
    public static void main(String[] args) {
        ObjectPoint intObj = new ObjectPoint();
        intObj.setX(new Integer(400)); //在使用時"定義型別代入參數" , 如此一來就可以更有彈性的使用
        Integer myX = (Integer) intObj.getX(); // 這時候我們可以透過 (Integer) 來強硬的轉換 Integer 型別來確保我們的程式碼型別相互對應是正確
        System.out.println(myX);
        // 但當程式碼一龐大 , set 與 get 諸如此類的這些方法不斷地在程式中各個角落被調用 , 我們真的能夠很明確的知道我們此時調用的型別是正確的嗎?
        System.out.println("----- 下列使用泛型 -----");
        //我們在生成物件的時候把 "型別" 作為參數代入宣告 , 之後只要操作 myGenPoint 物件 , 都視為 Integer 型別
        GenPoint<Integer> myGenPoint = new GenPoint<Integer>();
        myGenPoint.set(10);
        System.out.println(myGenPoint.get());
    }
}
// 因此我們開始使用 "泛型"
// 在泛型中我們不能使用基本型態 , 如 int , double , float 等等
class GenPoint<T> {
    private T x;
    public void set(T x) {
        this.x = x;
    }
    public T get() {
        return this.x;
    }
}