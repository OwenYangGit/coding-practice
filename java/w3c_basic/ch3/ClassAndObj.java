// class and object concept
// A Class is like an object constructor, or a "blueprint" for creating objects.

// create class
public class ClassAndObj {
    int x = 10;
    public static void main(String[] args){
        // create object
        ClassAndObj myObject = new ClassAndObj();
        System.out.println(myObject.x);
        // actually the 'x' is the object a 'attribute' , see example
        ClassAndObj myObject2 = new ClassAndObj();
        // change object2 attribute the 'x'
        myObject2.x = 30;
        System.out.println(myObject2.x);
    }   
}

// Remember from the Java Syntax chapter that a class should always start with an uppercase first letter ,
// and that the name of the java file should match the class name.