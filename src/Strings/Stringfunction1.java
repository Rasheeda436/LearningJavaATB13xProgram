package Strings;

public class Stringfunction1 {
    public static void main(String[] args) {
        String name= "Rasheeda";
        System.out.println(name.length());
        System.out.println(name.charAt(0));//0 1 2 3 4 5 6 7 8
        System.out.println(name.charAt(5));
       // System.out.println(name.charAt(8));
        //concat
        System.out.println(name.concat("    Rahim"));

        //contains
        System.out.println(name.contains("Rash"));
        System.out.println(name.contains("rr"));

        //equals
        System.out.println(name.equals("Rasheeda"));


        //equalsignore
        System.out.println(name.equalsIgnoreCase("rasheeda"));


        //index of
        System.out.println(name.indexOf("s"));

        System.out.println(name.indexOf("a"));

        //last index of

        System.out.println(name.lastIndexOf("a"));
        System.out.println(name.lastIndexOf("e"));

        //replace
        System.out.println(name.replace('R', 'r'));

        //split
        String name1= "rasheeda@gmail.com@123";
        String[] split_name1=name1.split("@");
        System.out.println(split_name1[0]);
        System.out.println(split_name1[1]);
        System.out.println(split_name1[2]);

        //substring
        System.out.println(name.substring(1,3));

        //lowercase
        System.out.println("Rasheeda".toLowerCase());

        //uppercase
        System.out.println("rasheeda".toUpperCase());
        //starts with
        System.out.println(name.startsWith("R"));

        //ends with
        System.out.println(name.endsWith("a"));

        String anotherPalindrome = "Niagra. O roar again!";
        System.out.println(anotherPalindrome.length());
        String extract= anotherPalindrome.substring(10,15);
        System.out.println(extract);

        //concatenation
        String s11= "Hello";
        String s12="World";
        String s13="Ji";
        String result1= s11+s12+s13;
        System.out.println(result1);


        String n="Rrasheeeedaaaa";
        System.out.println(n.indexOf(1));
        System.out.println(n.lastIndexOf(2));
        System.out.println(n.lastIndexOf(8));




    }

}
