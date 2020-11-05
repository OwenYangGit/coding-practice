// // Syntax
// import package.name.Class;   // Import a single class
// import package.name.*;   // Import the whole package

// java.util is a package, while Scanner is a class of the java.util package
import java.util.Scanner;

class Package {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter username");

    String userName = myObj.nextLine();
    System.out.println("Username is: " + userName);
  }
}