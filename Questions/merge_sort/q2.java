/*
solve this question using mege sort algo
Question :-  (from greeks of greeks)

Input:
N = 5
arr[] = {4 1 3 9 7}

Output:
1 3 4 7 9
 */

class q2
{
    static void divide(int arr[] , int l , int u)
    {
        if(u<=l)
        {
            return;
        }

        int mid = l + (u-l) / 2;

        divide(arr, l, mid);
        divide(arr, mid+1, u);
        
        conqure(arr, l, mid, u);
    }


    static void conqure(int arr[] , int l , int mid , int u)
    {
        int merge[] = new int[u-l+1];

        int index1 = l;
        int index2 = mid+1;
        int x= 0;

        while(index1<=mid && index2<=u)
        {
            if(arr[index1] < arr[index2])
            {
                merge[x] = arr[index1];
                index1++;
                x++;
            }
            else
            {
                merge[x] = arr[index2];
                index2++;
                x++;
            }
        }


        while(index1<=mid)
        {
            merge[x] = arr[index1];
            index1++;
            x++;
        }


        while(index2<=u)
        {
            merge[x] = arr[index2];
            index2++;
            x++;
        }

        for(int i = 0 , j=l ; i<merge.length ; i++,j++)
        {
            arr[j] = merge[i];
        }
    }

    public static void main(String[] args) 
    {
         //unsorted array 
         int arr[] = {4 ,1 ,3 ,9 ,7};

         //print unsorted array
         System.out.println("Unsorted array : ");
         for(int i = 0 ; i<arr.length ; i++)
         {
             System.out.print(arr[i] + " ");
         }
     
         System.out.println();

         //print sorted array 
         divide(arr, 0, arr.length-1);
         System.out.println("Sorted array : ");
         for(int i =0 ; i<arr.length ; i++)
         {
            System.out.print(arr[i] + " ");
         }
    }
    
}
