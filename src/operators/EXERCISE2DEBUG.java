package operators;

import java.util.Scanner;

public class EXERCISE2DEBUG {
    public static void main(String[] args) {
        System.out.println("enter the age");
        Scanner scanner= new Scanner(System.in);
        int age = scanner.nextInt();
        if(age<=18){
            System.out.println("cannot vote");
        }
        else
        {
            System.out.println("can vote");
        }
    }
}
