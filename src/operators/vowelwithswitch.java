package operators;

import java.util.Scanner;

public class vowelwithswitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a single character:");
        char ch = scanner.next().toLowerCase().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");
        }
    }
}
