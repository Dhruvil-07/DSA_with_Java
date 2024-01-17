/*
 hash method :-

 linear serach time complexity :- O(n)
 binary search time complexity :- O(logn)

 hashing time complexity :- O(1);
 because you get one index and you perform random access and get value
 by time complexity O(1).
 */

import java.util.Scanner;

class divide_hash
{

    //hash function -> h(x) = x mod m
    static int get_index(int key , int m)
    {
        int index = key % m;
        return index;
    }

    public static void main(String[] args) 
    {

        //scanner class obj
        Scanner sc = new Scanner(System.in);

        //given key and hash table size
        int a[] = {39,10,31,48,22};
        int m = 5;

        //hash table
        int hash_table[] = new int[m];
        int index;  //index of hash table

        //put given value in hash table
        for(int i = 0 ; i<a.length ; i++)
        {
            index = get_index(a[i], m);
            hash_table[index] = a[i];
        }



        //show hash table
        for(int i = 0 ; i<hash_table.length ; i++)
        {
            System.out.print(hash_table[i] + " ");
        }


        //serch value from hash table 
        System.out.print("Enter value : ");
        int data = sc.nextInt();
        int position = get_index(data, m);

        if(position >= m)
        {
            System.out.print("index out of bound...");
        }
        else if(hash_table[position] == data)
        {
            System.out.println("Data found...");
        }
        else
        {
            System.out.println("Data not found...");
        }


    }
}
