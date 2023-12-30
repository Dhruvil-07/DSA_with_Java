//merge sort algo
/*
first divide array until each part have only 1 element 
then
conqure all part one by one with sorting until your full array is sort


divide :- O(logn)
conqure :- O(n)
final time complexity :- O(nlogn)
 */

class array_merge_sort 
{

    //divide method
    static void divide(int a[] , int l , int u)
    {
        if(u<=l)
        {
            return;
        }

        //l+u/2 its also rihgt
        //but some time values are big , so result may be out of range
        ///so you should use this method for  mantain range
        int mid = l + (u-l) / 2;

        divide(a, l, mid);
        divide(a, mid+1, u);

        conqure(a, l, mid, u);
    }


    //conqure method
    static  void conqure(int a[] , int l , int mid , int u)
    {
        //declare array for copy our sorred elment
        //+1 for  length of array , bec arra strat from 0 not from 1
        int merged_array[] = new int[(u-l+1)];  

        int index1= l; //for fisrt part
        int index2= mid+1; //for second part
        int index3 = 0 ; //for copy array

        //for sorting 
        while(index1<=mid && index2<=u)
        {
            if(a[index1] <= a[index2])
            {
                merged_array[index3] = a[index1];
                index1++;
                index3++;
            }
            else
            {
                merged_array[index3] = a[index2];
                index2++;
                index3++;
            }
        }


        //ramining value copy to merged_array

        //if first part has elements , this loop will execute
        while(index1<=mid)
        {
            merged_array[index3] =  a[index1];
            index1++;
            index3++;
        }


        //if second part has element , this loop will execute
        while (index2<=u) 
        {
            merged_array[index3] = a[index2];
            index2++;
            index3++;
        }


        //finally copy merges_array to actual array
        //i for merged array index 
        // j uses for firsst index of each call
        //if you dont use j you will get dublicate value in array 
        for(int i = 0 , j=l ; i<merged_array.length ; i++ ,j++ )
        {
            a[j] = merged_array[i];
        }

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

        divide(a, 0, a.length-1);

        //print sorteed array
        System.out.println("Sorted array : ");
        for(int i = 0 ; i<a.length ; i++)
        {
            System.out.print(a[i] + " ");
        }
    }    
}
