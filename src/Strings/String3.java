package Strings;

public class String3 {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("Rasheeda");
        sb.append("Rahim");
        System.out.println(sb);
        sb.delete(0,3);
        System.out.println(sb);
        sb.replace(0,4,"test");
        System.out.println(sb);


    }
}
