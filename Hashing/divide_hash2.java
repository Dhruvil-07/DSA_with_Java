/*
 hashing technique by user input
 */


import java.util.Scanner;

public class divide_hash2 
{
    //hash function -> h(x) = x mod n;
    static int get_index(int data , int n)
    {
        int index = data % n;
        return index;
    }


    public static void main(String[] args) 
    {
        //scanner class obj
        Scanner sc = new Scanner(System.in);

        System.out.println("how many element do you want to enter : ");
        int n = sc.nextInt();

        //define hash table 
        int hash_table[] = new int[n];

        //get user input and store in hash table
        for(int i = 0 ; i<n ; i++)
        {
            System.out.println("Enter data : ");
            int data = sc.nextInt();

            int position = get_index(data, n);
            hash_table[position] = data;

            System.out.println("data Inserted successfully...");

            System.out.println();
        }



        //print hash table 
        for(int i = 0 ; i<hash_table.length ; i++)
        {
            System.out.print(hash_table[i] + " ");
        }

        System.out.println();



        //serch value for hash table
        System.out.println("Enter value : ");
        int val = sc.nextInt();
        int serch_position = get_index(val, n);

        if(hash_table[serch_position] == val)
        {
            System.out.println("value found");
        }
        else
        {
            System.out.println("Not youe serached value at same position...");
        }

    }    

}
