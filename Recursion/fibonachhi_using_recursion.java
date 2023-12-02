import java.util.Scanner;

public class fibonachhi_using_recursion {
    
    static void fibonachhi(int x , int y , int n)
    {
        if(n == 0)
        {
            return;
        }
        else
        {
           int result = x + y;
           System.out.print(result + " ");
           fibonachhi(y, result, n-1);
        }
    }


    public static void main(String[] args) {
        
        //scanner class boj
        Scanner  sc = new Scanner(System.in);

        //variable for fibonachhi
        int a , b , c;
        int n; //print series up to which number

        //get input 
        System.out.println("Enter  number : ");
        n =  sc.nextInt();

        a=0;
        b=1;;
        c = a+b;

        System.out.print(a + " " + b + " " + c + " ");
    
        fibonachhi(b, c, n-2);

    }

}
