import java.util.Scanner;

class SumOfNNumber 
{

    static int sum(int num)
    {
        if(num > 0)
        {
            return num + sum(num -1);
        }
        else
        {
            return 0;
        }
    }


    public static void main(String[] args) {
        
        ///scanner class  obj
        Scanner sc = new Scanner(System.in);

        //variable for uuser input
        int n;
        System.out.println("Enter number : ");
        n =sc.nextInt();

        //result variable
        int result;
        result = sum(n);
        System.out.println(result);

    }
}