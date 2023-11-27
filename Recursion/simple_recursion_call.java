class SimpleRecursionCall
{

     static void A(int n)
        {
             if(n > 0)
             {
                System.out.println(n); //satck activation recored
                A(n-1);
                System.out.println(n); ///its satck intention pointer
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