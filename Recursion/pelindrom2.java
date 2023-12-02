import java.util.Scanner;

public class pelindrom2 {
    

    static void pelindrom(int ren , int rem , int rev ,  int n)
    {
        if(ren > 0)
        {  
            rem = ren % 10;
            rev = (10 * rev) + rem;
            ren = ren / 10;

            pelindrom(ren, rem, rev, n);
        }
        else
        {
            if(rev == n)
            {
                System.out.println("your number " + n + " is pelindrom number");
            }
            else
            {
                 System.out.println("Your number " + n + " is not pelindrom number");
            } 
        }
       
    }


    public static void main(String[] args) {
        
        //scanner class obj
        Scanner sc = new Scanner(System.in);
        
        ///varibale forpelindrom check
        int rem , ren , rev;
        rev = rem = 0;

        int num; //its for  user entered number
        System.out.println("Enter number  : ");
         num = sc.nextInt();

        ren =  num; //create copy of user number

        pelindrom(ren, rem, rev, num);

    }
}
