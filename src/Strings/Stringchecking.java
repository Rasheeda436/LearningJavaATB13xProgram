package Strings;

public class Stringchecking {
    public static void main(String[] args) {
        String s1= "Hello";
        String s2="Hello";
        String s3= new String("Hello");
        System.out.println(s1==s2);//space check location
        System.out.println(s1==s3);//space check   not same location
        System.out.println(s1.equals(s3));   // content check
    }
}
