/*  
solve this question using mege sort algo
Question :-  (from greeks of greeks)

Input:
N = 10
arr[] = {10 9 8 7 6 5 4 3 2 1}

Output:
1 2 3 4 5 6 7 8 9 10

 */


class q1
{
    //division method
    static void divide(int arr[] , int l , int u)
    {
        if(u<=l)
        {
            return;
        }

        int mid = l+(u-l)/2;

        divide(arr, l, mid);
        divide(arr, mid+1, u);

        conqure(arr, l, mid, u);
    }


    //conqure method
    static void conqure(int arr[] , int l , int mid , int u)
    {
        int merge[] = new int[(u-l)+1];

        int index1 = l;
        int index2 = mid+1;
        int x = 0;

        while(index1<=mid && index2<=u)
        {
            if(arr[index1] < arr[index2])
            {
                merge[x] = arr[index1];
                x++; 
                index1++;
            }
            else
            {
                merge[x] = arr[index2];
                x++;
                index2++;
            }
        }


        while(index1 <= mid)
        {
            merge[x] = arr[index1];
            x++;
            index1++;
        }

        while(index2 <= u)
        {
            merge[x] = arr[index2];
            x++;
            index2++;
        }


        for(int i =0 , j=l ; i<merge.length ; i++ , j++)
        {
            arr[j] = merge[i];
        }
    }

    public static void main(String[] args)
    {
        //unsorted array 
        int arr[] = {10 , 9, 8, 7, 6, 5, 4, 3, 2, 1};

        //print unsorted array
        System.out.println("Unsorted array : ");
        for(int i = 0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    
        System.out.println();

        //sorted array
        divide(arr, 0, arr.length-1);
        System.out.println("Sorted array : ");
        for(int i = 0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}