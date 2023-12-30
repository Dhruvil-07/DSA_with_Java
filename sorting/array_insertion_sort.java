//insertion sort java

/*
sorted and unsorted parts
 outer loop pick 1  value  ferequently for sorting
 inner loop  check value one  by one and put it on its right place
 */


class array_insertion_sort
{

    static int[] insetion_ascending(int a[])
    {
        int current; //for store current unsorted element

        for(int i = 1 ; i<a.length ; i++)
        {
            current = a[i];
            
            int j = i-1; //for last element of  sorted array

            while(j>=0 && current<a[j])
            {
                a[j+1] = a[j];
                j--;
            }

            //placement
            a[j+1] = current;
        }
        return a;
    }



    static int[] insetion_decending(int a[])
    {
        int current; //for store current unsorted element

        for(int i = 1 ; i<a.length ; i++)
        {
            current = a[i];
            
            int j = i-1; //for last element of  sorted array

            while(j>=0 && current>a[j])
            {
                a[j+1] = a[j];
                j--;
            }

            //placement
            a[j+1] = current;
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
 
         //insertion sort ascending order
         System.out.println("Ascending Order : ");
         asc = insetion_ascending(a);
         for(int i = 0 ;i<asc.length ; i++)
         {
            System.out.print(a[i] + " ");
         }

         System.out.println();

         //insertion sort decending order
         System.out.println("Descending Ordder : ");
         desc = insetion_decending(a);
         for(int i = 0 ; i<a.length ; i++)
         {
            System.out.print(a[i] + " ");
         }


    }
}
