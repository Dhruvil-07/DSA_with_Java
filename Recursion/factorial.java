//count factorial using reecursion

import java.util.Scanner;

class factorial 
{

    static int fact(int n)
    {
        if(n == 1 )
        {
            return 1;
        }
        else
        {
             return n * fact(n-1);
        }
    }



    public static void main(String[] args) 
    {
        //scanner class obj 
        Scanner sc = new Scanner(System.in);

        //var for user input and result
        int num , result;

        System.out.println("Enter number : ");
        num = sc.nextInt();
        
        result = fact(num);

        //bioth are returnn same value
        System.out.println(result);
        System.out.println(fact(num));
    }
    
}
