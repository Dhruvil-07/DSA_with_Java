//find number is pelindrom or not using recursion 

import java.util.Scanner;

public class pelindrom_using_recursion {
    
    public static void main(String[] args) {
        
        //scnner class obj
        Scanner sc = new Scanner(System.in);

        //variable for user input
        int num;
        System.out.println("Enter number : ");
        num = sc.nextInt();

        //onjeect of rec class
        rec r = new rec(num);

        //call function , it has pelindrom check mechinesum
        r.pelindrom(num);

        //after recursion call complated
        //check entred number is pelindrom or not
        if(num == r.rev)
        {
            System.out.println("your nnumber is  pelindrom");
        }
        else
        {
            System.out.println("your number is not peleindrom");
        }


    }
}


class rec
{
    int  rem , rev , ren;

    rec(int num)
    {
        ren = num;
        rev = 0;
    }


    void pelindrom(int n)
    {
        if(n>0)
        {
            rem = n % 10;
            rev = (10 * rev) + rem;
            ren = n / 10;

            pelindrom(ren);
        }
        else
        {
            return;
        }
    }


}
