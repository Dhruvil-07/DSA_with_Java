class String_array_merge_sort 
{
    //divide method
    static void divide(String a[], int l , int u)
    {

       if(u<=l)
       {
           return;
       }

       int mid = l + (u-l) /2 ;

       divide(a, l, mid);
       divide(a, mid+1, u);

       conqure(a, l, mid, u);
    }


    //conqure method
    static void conqure(String a[] , int l , int mid , int u)
    {
       String merge[] = new String[u-l+1];

       int index1 = l;
       int index2 = mid+1;
       int x = 0;

       while(index1<=mid  && index2<=u)
       {
           if(a[index1].compareToIgnoreCase(a[index2]) < 0)   
           {
               merge[x] = a[index1];
               index1++;
               x++;
           }
           else
           {
               merge[x] = a[index2];
               index2++;
               x++;
           }
       }


       while(index1 <= mid)
       {
           merge[x] = a[index1];
           index1++;
           x++;
       }

       while(index2 <= u)
       {
           merge[x] = a[index2];
           index2++;
           x++;
       }


       for(int i = 0 , j=l ; i<merge.length ; i++,j++)
       {
           a[j] = merge[i];
       }
    }


    public static void main(String[] args) 
    {
       String a[] = {"Dhruvil" , "Charvin" ,"Khushi" , "Bhavya"};

       System.out.println("Unsorted array : ");
       for(int i = 0 ; i<a.length ; i++)
       {
            System.out.print(a[i] + " ");
       }

       System.out.println();
       System.out.println("Sorted Array : ");
       divide(a, 0, a.length-1);
       for(int i =0 ;i<a.length ; i++)
       {
            System.out.print(a[i] + " ");
       }
    }        
}
