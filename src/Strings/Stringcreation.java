package Strings;

public class Stringcreation {
    public static void main(String[] args) {
        //2 ways to create strings
        String s1= "hello";
        s1.concat("world"); // only hello will be displayed, so reassign the value
        s1=s1.concat("world");
        System.out.println(s1);
    }
}
