package operators;
import java.sql.SQLOutput;
import java.util.Scanner;

public class vowelcheck {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the single character");
        char ch= scanner.next().toLowerCase().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println(ch+"is a vowel");
        }
        else if (ch>='a'&& ch<='z')
        {
            System.out.println(ch+ "is a consonant");
        }
        else
        {
            System.out.println("invalid");
        }
    }
}
