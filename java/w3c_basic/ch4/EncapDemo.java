// error demo code
// public class MyClass {
//   public static void main(String[] args) {
//     Person myObj = new Person();
//     myObj.name = "John";  // error
//     System.out.println(myObj.name); // error 
//   }
// }

// Working 
public class EncapDemo {
  public static void main(String[] args) {
    Encap myObj = new Encap();
    myObj.setName("John"); // Set the value of the name variable to "John"
    System.out.println(myObj.getName());
  }
}

// Outputs "John"