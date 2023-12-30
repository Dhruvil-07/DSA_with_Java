//selection sort algoritem
/*I
 two loop uses for  thos algorithem.
 outer loop pic new index for every time for put sorted elemet on that index
 innner loop check 2 next nigbour one by one.

 time complexity = O(n^2);
 */

class array_bubble_sort
{

    static int[] bubble_ascending(int a[])
    {
        int temp; //for store value temporary during swaping

        for(int i = 0 ; i<a.length ; i++)
        {
            for(int j = 0 ; j<a.length-1-i ;j++)
            {
                //check and swap 
                if(a[j] > a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }
 

    static int[] bubble_decending(int a[])
    {
        int temp; //for store value temporary during swaping

        for(int i = 0 ; i<a.length ; i++)
        {
            for(int j = 0 ; j<a.length-1-i ;j++)
            {
                //check and swap 
                if(a[j] < a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }



    public static void main(String[] args) 
    {
         //unsorted array
         int a[] = {3,5,2,6,8,1};
 
         //sorted array variable 
         int asc[];
         int desc[];
 
         //show unsorted array
         System.out.println("Unsorted array : ");
         for(int i = 0 ; i<a.length ; i++)
         {
             System.out.print(a[i] +" ");
         }
         
         System.out.println();

         //array sortedin ascending order
         System.out.println("acesndig sorting : ");
         asc = bubble_ascending(a);
        for(int i = 0 ; i<asc.length ;i++)
        {
            System.out.print(asc[i] + " ");
        }

        System.out.println();

        //array sorted in desceding order
        System.out.println("Decending sorting : ");
        desc = bubble_decending(a);
        for(int i = 0 ; i<desc.length ;i++)
        {
            System.out.print(desc[i] + " ");
        }


    }
}
