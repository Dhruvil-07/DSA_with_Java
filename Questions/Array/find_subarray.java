/*
 Find Indexes of a subarray with given sum

explaination:-

N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements 
from 2nd position to 4th position 
is 12.
 */

class find_subarray 
{
    public static void main(String[] args) {
        
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        //obj od subarray class
        subarray sa = new subarray(array);
        
        //methos call for find subaaray
        sa.find_sub_array(2);

        //method call for print sub array
        sa.print_sub_array();

        //method call for print position
        sa.position_print();

    }

}

class subarray
{
    int l , r , curr_sum;
    int[] array;

    subarray(int[] array)
    {
        l = r = curr_sum = 0;
        this.array = array;
    }

    //method for find sub array
    void find_sub_array(int sum)
    {   
        while(r<array.length)
        {
            if(curr_sum == sum)
            {
                break;
            }
            else if(array[r] == sum)
            {
                l = r;
                break;
            }
            else if(curr_sum < sum)
            {
                curr_sum += array[r];
                r++;
            }
            else if(curr_sum > sum)
            {
                curr_sum -= array[l];
                l++;
            }
        }
    }

    //method for print sub array
    void print_sub_array()
    {
        System.out.println("sub array : ");

        if(l == r)
        {   
            System.out.println(array[r]);
        }
        else
        {
            for(int i = l ; i <r ; i++)
            {
                System.out.print(array[i] + " ");
            }
        }
    }

    //method to print start and end position
    void position_print()
    {
        System.out.println();
        if(l == r)
        {
            System.out.println("Start Position : " + l) ;
            System.out.println("End Position : " + r) ;
        }
        else
        {
            l++;
            System.out.println("Start Position : " + l) ;
            System.out.println("End Position : " + r) ;
        }
    }
}

