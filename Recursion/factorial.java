//count factorial using reecursion

import java.util.Scanner;

class factorial 
{

    static void fectorial(int n , int result)
    {
        if(n == 0)
        {
            System.out.println("Factorial is : " + result);
            return;
        }
        else
        {
             result = result * n;
             fectorial(n-1, result);
        }
    }
    



    public static void main(String[] args) 
    {
    
        //Scanner class obj
        Scanner sc = new Scanner(System.in);

        //variable for user input
        int num; //we will find fectorial of thos number
        int result = 1; //it store factorial result
        
        num = sc.nextInt();

        fectorial(num , result);
    }
    
}
 