//linear search algo with array

class ArrayLinearSerch
{
    //is available or not 
    static boolean serch(int a[] , int val)
    {
        for(int i = 0 ; i<a.length ; i++)
        {
            if(a[i] == val)
            {
                return true;
            }            
        }
        return false;
    }


    //return index
    static int search2(int a[] , int val)
    {
        for(int i = 0 ; i<a.length ; i++)
        {
            if(a[i] == val)
            {
                return i;
            }
        }
        return -1;
    }



    public static void main(String[] args) 
    {
        int a[] = {1,4,2,6,8,9,3}; 

        //for check present or not  
        if(serch(a, 10))
        {
        System.out.println("Element is present in array");
        }
        else
        {
            System.out.println("Elemetn is not present in array");
        }

        System.out.println();

        //for check elemnt is present or not and print index 
        int index;
        index = search2(a,5);
        
        if(index == -1)
        {
            System.out.println("Element is not present in array");
        }
        else
        {
            System.out.println("Element present at index : " + index);
        }

    }
}