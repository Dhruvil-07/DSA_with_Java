class String_array_selection_sort 
{
    static void selection(String a[])
    {
        for(int i = 0 ;i<a.length ; i++)
        {
            int current = i;

            for(int j = i+1 ; j<a.length ; j++)
            {
                if(a[current].compareTo(a[j]) > 0 )
                {
                    current = j;   
                }
            }

            String temp = a[i];
            a[i] = a[current];
            a[current] = temp;

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
       selection(a);
       for(int i =0 ;i<a.length ; i++)
       {
            System.out.print(a[i] + " ");
       }
    }    
}
