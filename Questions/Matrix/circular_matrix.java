import java.util.Scanner;

/**
 * circular_matrix
 */
public class circular_matrix {

    public static void main(String[] args) {
        
        System.out.println("WElcome To circular metrix program");

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value : ");
        n = sc.nextInt();

        int a = 0;  //starting row index
        int b = n-1; //ending row index
        int c = 0;    //starting column index
        int d = n-1;  //starting row index

        int m[][] = new int[n][n];

        int num = 1;


        //main loop 
        while(a<=b && c<=d)
        {
            //right direction row
            //a value is constan here.
            for(int i = c ; i<=d ; i++)
            {
                m[a][i] = num;
                num++;
            }
            a++;

            //bottom direction column
            //d value is constant here
            for(int i = a ; i<=b ; i++)
            {
                m[i][d] = num;
                num++;
            }
            d--;

            //left direction row
            //b value is constant here
            for(int i = d ; i>=c ; i--)
            {
                m[b][i] = num;
                num++;
            }
            b--;

            //top direction column
            //c value is constant here
            for(int i = b ; i>=a ; i--)
            {
                m[i][c] = num;
                num++;
            }
            c++;
        }


        //display matrix
        for(int i = 0 ; i<=n-1 ; i++)
        {
            for(int j = 0 ; j<=n-1 ; j++)
            {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

    }
    
}