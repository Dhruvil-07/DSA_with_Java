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
    public static void main(String[] args) 
    {
        //unsorted array
        int a[] = {3,5,2,6,8,1};

        //show unsorted array
        System.out.println("Unsorted array : ");
        for(int i = 0 ; i<a.length ; i++)
        {
            System.out.print(a[i] +" ");
        }
        
        System.out.println();

        //logic for insertion sort
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


        //show sorted array
        System.out.println("Sorted array : ");
        for(int i = 0 ; i<a.length ; i++)
        {
            System.out.print(a[i] + " ");
        }

    }
 }