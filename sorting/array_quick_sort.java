//quick sort algorithem
/*
worst case :- O(n^2)
avarage case :- O(nlogn)
 */

class array_quick_sort
{

    static void qucik_sort(int arr[] , int l , int u)
    {
        if(u<=l)
        {
            return;
        }

        int pivot_index = partion(arr, l, u);

        qucik_sort(arr, l, pivot_index-1);
        qucik_sort(arr, pivot_index+1, u);
    }


    static int partion(int arr[] , int l , int u)
    {
        int pivot = arr[u];
        int i = l;
        int p = l;
        
        for(int j = l ; j<u ; j++)
        {
            if(arr[j] < pivot)
            {
                //swaping
                int temp = arr[p];
                arr[p] = arr[i];
                arr[i] = temp;

                i++;
                p++;
            }
            else
            {
                i++;
            }
        }

        arr[u] = arr[p];
        arr[p] = pivot;

        return p;
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

        //print sorted array
        qucik_sort(a, 0, a.length-1);
        System.out.println("Sorted Array : ");
        for(int i = 0 ; i<a.length ; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
