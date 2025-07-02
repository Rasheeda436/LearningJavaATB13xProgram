package Strings;

public class Stringlocation {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="Hello";

        String s3= new String("Hello");
        String s4= new String("Hello");
        String s5= new String("hello");

        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s3==s4);

        //equals means comparing the content

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s1));
        System.out.println(s2.equals(s3));
        System.out.println(s5.equals (s4));// not equal because of case sensitivity
        System.out.println(s5.equalsIgnoreCase(s4));


    }
}
