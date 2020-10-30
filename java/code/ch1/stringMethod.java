public class stringMethod{
    public static void main (String[] args){
        String myString = "Hi this is my first sentence";
        System.out.println(myString);
        // caculate string lenth
        int myStringLength = myString.length();
        System.out.println(myStringLength);
        // to uppercase or lowercase
        System.out.println(myString.toUpperCase());
        System.out.println(myString.toLowerCase());
        // find index postion , returns the index (the position) of the !first occurrence! of a specified text in a string (including whitespace)
        System.out.println(myString.indexOf("my")); //output is 11
        System.out.println(myString.indexOf("s")); //output 6
    }
}