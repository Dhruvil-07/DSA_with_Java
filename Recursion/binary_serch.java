class binary_serch 
{

    //return value in recursive stack
    static boolean binary(int a[] , int l , int u , int key)
    {
        boolean check;

        if(u<l)
        {
            check = false;
            return check;
        }

        int mid = l + (u-l) / 2;

        if(key == a[mid])
        {
            check = true;
            return check;
        }
        else if(key < a[mid])
        {
           check =  binary(a, l, mid-1, key);
        }
        else
        {
            check = binary(a, mid+1, u, key);
        }

        return check;
    }


    //without return value in recursive stack
    static void binary2(int a[] , int l , int u , int key)
    {
        if(u<l)
        {
            System.out.println("Elemnent not found...");
            return;
        }

        int mid = l + (u-l) / 2;

        if(key == a[mid])
        {
            System.out.println("element founded");
            return;
        }
        else if(key < a[mid])
        {
           binary(a, l, mid-1, key);
        }
        else
        {
            binary(a, mid+1, u, key);
        }

        return;
    }
 

    public static void main(String[] args) 
    {
        int a[] = {2,5,3,7,6,8};

        System.out.println("Your array : ");
        for(int i = 0 ; i<a.length ; i++)
        {
            System.out.print(a[i] + " ");
        }

        System.out.println();

        //return value form recursive stack 
        boolean check = binary(a, 0, a.length-1, 90);
        System.out.println(check);

        //without return value from recursive stack
        binary2(a, 0, a.length-1,6);

    }    
}
