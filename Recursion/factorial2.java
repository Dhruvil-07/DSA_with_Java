import java.util.Scanner;

public class factorial2 {
 

    static int factorial(int n)
    {
        if(n == 1)
        {
             return 1;
        }
        else
        {
         return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        
        //scanner class obj;
        Scanner sc  = new Scanner(System.in);

        //variable for input
        int num;
        num = sc.nextInt();

        System.out.println("Fctorial is  : " + factorial(num));

    }
}
