package Functionstest;

public class Allmethods {
    public static void main(String[] args) {

        wp_wr_greet();
        //without parameters and return type
        String msg=greet_with_hello_wp_with_Returntype();
        System.out.println(msg);
        //without parameter but with return type

        greet_with_details("Rasheeda", 33,  6000);
        greet_with_details( "Ankitha", 33,  7500);

      int sum= sum_of_two_numbers(3,4);
      int sum1= sum_of_two_numbers(3,5);
    int sum2= sum_of_three_numbers(70, 80, 90);
        System.out.println(sum);
        System.out.println(sum1);
      System.out.println(sum2);

       //with parameters and without return type
    }
        static void wp_wr_greet()
        {
            System.out.println("Type 1 without parameter and without return type");
            System.out.println("Hi, How are you?");
        }

    //without parameter but with return type
static String greet_with_hello_wp_with_Returntype()
{
    System.out.println("Type 2 Without parameters but with return type");
    System.out.println("wp_with_RT");
    return "Hi,,,,,,";
}
//with parameters and without return type
    static void greet_with_details(String name, int age, double salary)
    {
        System.out.println("Your name is"+ name+ "\nYour age "+ age+"\nYour salary"+salary);
    }

    //with parameters and with return type
    static int sum_of_two_numbers(int a, int b)
    {
        return a+b;
       // System.out.println("The value is a+b");
    }
    static  int sum_of_three_numbers(int a, int b, int c)
    {
        return a+b+c;
    }

}

