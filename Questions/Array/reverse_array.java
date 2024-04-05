/* 
 reverse array whiout using inn built  function
*/

public class reverse_array 
{
     public static void main(String[] args) {
        
        int[] a = new int[]{1,2,3};

        int l = 0;
        int u = a.length-1;
        int temp;


        System.out.println("main array : "); 
        for(int i = 0 ; i<a.length ; i++)
        {
            System.out.print(a[i] + " ");
        }

        while(l<u)
        {
            temp = a[l];
            a[l] = a[u];
            a[u] = temp;

            l++;
            u--;
        }


        System.out.println();
        System.out.println("reversed array : "); 
        for(int i = 0 ; i<a.length ; i++)
        {
            System.out.print(a[i] + " ");
        }

     }   
}
