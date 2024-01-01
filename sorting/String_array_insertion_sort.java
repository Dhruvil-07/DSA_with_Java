class String_array_insertion_sort 
{
    static void insertion(String a[])
      {
        for(int i = 1; i<a.length ; i++)
        {
            String current = a[i];
            int j = i-1;

            while(j>=0 && a[j].compareToIgnoreCase(current) > 0 )
            {
                a[j+1] = a[j];
                j--;
            }

            a[j+1] = current;
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
       insertion(a);
       for(int i =0 ;i<a.length ; i++)
       {
            System.out.print(a[i] + " ");
       }
    } 
}
