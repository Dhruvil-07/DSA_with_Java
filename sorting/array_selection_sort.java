//selection sort algoritem
/*I
 two loop uses for  thos algorithem.
 outer loop pic new index for every time for put sorted elemet on that index
 inner loop check samllest or highest element and at the end , swap that element with outer loop picked index

 time complexity = O(n^2);
 */

 import java.util.Scanner;

 class selection_sort_on_array
  {
 
     //sort in asendin order
     static int[] insertion_acending(int a[])
     {       
         int smallest; //for store smallest values's index
         int temp;     // for store temp values for swaping
         for(int i = 0 ; i<a.length ; i++)
         {
             smallest = i;
 
             for(int j = i+1 ; j<a.length ; j++ )
             {
                 if(a[j] < a[smallest])
                 {
                     smallest = j;
                 }
             }
 
             //swap values
             temp = a[i];
             a[i] = a[smallest];
             a[smallest] = temp;
         }
         return a;
     }
 
 
 
     //sort indecending order
      static int[] insertion_desending(int a[])
     {       
         int gretest; //for store gretest values's index
         int temp;     // for store temp values for swaping
         for(int i = 0 ; i<a.length ; i++)
         {
             gretest = i;
 
             for(int j = i+1 ; j<a.length ; j++ )
             {
                 if(a[j] > a[gretest])
                 {
                    gretest= j;
                 }
             }
 
             //swap values
             temp = a[i];
             a[i] = a[gretest];
             a[gretest] = temp;
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
 
         //show sorted array (asecnding order)
         asc = insertion_acending(a);
         System.out.println("ascending order sorted  array : ");
         for(int i = 0 ; i<asc.length ; i++)
         {
             System.out.print(asc[i] + " ");
         }
 
         System.out.println();
 
         //show sorted array (asecnding order)
         desc = insertion_desending(a);
         System.out.println("Decending order Sorted array : ");
         for(int i = 0 ; i<desc.length ; i++)
         {
             System.out.print(desc[i] + " ");
         }
 
     }
  }