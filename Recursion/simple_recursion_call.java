class SimpleRecursionCall
{

     static void A(int n)
        {
             if(n > 0)
             {
                System.out.println(n);
                A(n-1);
                System.out.println(n);
             }
             else
             {
                System.out.println(n);
             }
        }


    public static void main(String[] args) {    
       A(3);
    }
}