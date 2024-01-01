class String_array_quick_sort 
{
    static void quick(String a[] , int l , int u)
      {
            if(u<=l)
            {
                return;
            }

            int pivot_index = partition(a, l, u);

            quick(a, l, pivot_index-1);
            quick(a, pivot_index+1, u);
      }


     
      static int partition(String a[], int l , int u)
      {
         String pivot = a[u];
         int i = l;
         int p = l;

         for(int j = l ; j<u ; j++)
         {
             if(a[i].compareToIgnoreCase(pivot) < 0)
             {
                String temp = a[p];
                a[p] = a[i];
                a[i] = temp;

                i++;
                p++;
             }
             else
             {
                i++;
             }
         }

         a[u] = a[p];
         a[p] = pivot;

        return p;
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
       quick(a, 0, a.length-1);
       for(int i =0 ;i<a.length ; i++)
       {
            System.out.print(a[i] + " ");
       }
    }        
}
