package operators;

import java.util.Scanner;

public class switchexercise {
    public static void main(String[] args) {
      //  int day= Integer.parseInt(args[0]);
//take a user input tell them which day they have told
        //1 to 7 -->1-->monday 5-->friday,8 is not allowed n throws error
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the day 1 to 7");
        int day= scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;

            default:
                System.out.println("Not allowed");
                break;
        }
        }
        }

