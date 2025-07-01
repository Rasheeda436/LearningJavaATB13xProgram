package Functionstest;

import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=0;
        if(scanner.hasNextInt()) {
            a = scanner.nextInt();
        } else
        {
            System.out.println("Enter the integer only");
            //return;
            System.exit(0);

        }

        System.out.println("Enter the second number");
        int b=0;
        if(scanner.hasNextInt()){
            b=scanner.nextInt();
        } else
        {
            System.out.println("Enter the integer onlyyyy");
            return;
        }



        int result_sum= sum(a,b);
        System.out.println("The sum is\t"+ result_sum);

        int result_sub= sub(a,b);
        System.out.println("The difference is \t" + result_sub);


        int result_div= div(a,b);
                System.out.println("The quotient is \t" + result_div);


        int result_mul= mul(a,b);
        System.out.println("The product is \t" + result_mul);



        int result_mod= mod(a,b);
        System.out.println("The modulus is \t" + result_mod);
    }


    static int sum(int a, int b){
        return a+b;
    }

    static int sub(int a, int b)
    {
        return a-b;
    }

    static int div(int a, int b){
        if(b==0)
        /*{
            throw new ArithmeticException("B cant be 0");
        }*/
        {
            System.out.println("B cannot be 0");
        }
        return a/b;
    }

    static int mul(int a, int b)
    {
        return a*b;
    }

    static int mod(int a, int b)
    {
        return a%b;
    }
}
