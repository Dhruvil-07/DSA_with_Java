/*
-> interview question (AT FANGG COMPANY)
<<<<<<< HEAD

=======
>>>>>>> fbb221b24d14bbecebc6937c66d2acc062ea6eda
 1
 2 9
 3 8 10
 4 7 11 14
 5 6 12 13 15

 */

import java.util.Scanner;

class q1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // var for row and column
        int row , column;

        //get input of row and column
        System.out.println("Enter row :- ");
        row = sc.nextInt();
        System.out.println("Enter column");
        column = sc.nextInt();

        //intilize matrix 
        int m[][] = new int[row][column];

        //this variable value store in matrix then 
        //it will increse after every looping statamen.
        int num = 1;
        
        //column  loop
        for(int j = 0 ; j<column ; j++)
        {
            if(j%2 == 0)
            {
                //column number is even then this loop will run
                for(int i = j ; i<column ; i++)
                {
                    m[i][j] = num;
                    num++;
                }
            }
            else
            {
                //column number is odd then this lopp will run
                for(int k = 4 ; k>=j ; k--)
                {
                    m[k][j] = num;
                    num++;
                }               
            }
        }


        //print over matrix
        for(int i = 0 ; i<column ; i++)
        {
            for(int j = 0 ; j<=i  ; j++)
            {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

    }

}
