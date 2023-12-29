//binary serc alg with array

import java.math.*;

class array_binary_serch
{

    //recursive approch for binar serch
    static void search(int arr[] , int l , int u , int key)
    {
        if(l == u)
        {
            if(arr[l] == key)
            {
                System.out.println("Element found");
                return;
            }
            else
            {
                System.out.println("ELement not found...");
                return;
            }
        }
        else
        {
            int mid = Math.round((l+u)/2);

            if(arr[mid] == key)
            {
                System.out.println("value found");
                return;
            }
            else if(key > arr[mid])
            {
                search(arr, mid+1, u, key);
            }
            else
            {
                search(arr, l, mid-1, key);
            }
        }
        return;
    }


    public static void main(String[] args) 
    {
        //single  value  
        int a[] = {1};
        search(a, 0, a.length-1, 1);

        //multiople values
        int b[] = {1,2,3,4,5,6,7};
        search(b, 0, b.length-1, 90);
        
    }
}
