class String_array_bublle_sort
{
    static void bubble(String a[])
     {
        for(int i = 0 ; i<a.length ; i++)
        {
            for(int j = 0 ; j<a.length-1-i ; j++)
            {
                if(a[j].compareToIgnoreCase(a[j+1]) > 0)
                {
                    String temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
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
       bubble(a);
       for(int i =0 ;i<a.length ; i++)
       {
            System.out.print(a[i] + " ");
       }
    }    
}
