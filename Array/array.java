import java.util.Scanner;

class arrayst
{
  public static void main(String[] args) {
    
        //scanner class  object
        Scanner sc = new Scanner(System.in);

        //array class obj
        arrayy ar = new arrayy(5);

        //variable for value , position , choice , looping
        int val , choice , position;
        boolean check = true;

        while(check)
        {
            System.out.println();
            System.out.println("1. Insert at continues position....");
            System.out.println("2. Insert at specificc position....");
            System.out.println("3. delete by position...");
            System.out.println("4. delete by val...");
            System.out.println("5. display...");
            System.out.println("6. Exit...");

            System.out.println("Enter choice : ");
            choice = sc.nextInt();
            
            switch (choice) {
                
                case 1 : System.out.println("Enter value : ");
                         val = sc.nextInt();
                         ar.inset(val);
                         break;
                        
                case 2 : System.out.println("Enter val ");
                         val =sc.nextInt();
                         System.out.println("Enter Position : ");
                         position = sc.nextInt();
                         ar.insert_at_spec_pos(val, position);
                         break;

                case 3 : System.out.println("Enter position : ");
                         position = sc.nextInt();
                         ar.delete(position);
                         break;

                case 4 : System.out.println("Enter value  : ");
                         val = sc.nextInt();
                         ar.delete_by_value(val);
                         break;
                    
                case 5 : ar.display();
                         break;

                case 6 : check = false;
                         break;

                 default : System.out.println("Invalid choice...");
            }
        }


        System.out.println("Programe ended");
    
  }
}



class arrayy
{
    int a[];
    int point;

    arrayy(int size)
    {
        a = new int[size];
        point = -1;
    }


    ///grreting function
    void greeting(String grret)
    {
        System.out.println(grret + " Successfully....");
    }



    void inset(int val)
    {
        if(point == a.length-1)   
        {
            System.out.println("Array is full");
        }
        else
        {
            point++;
            a[point] = val;
            greeting("Inserted");
            display();
            return;
        }
    }

    void insert_at_spec_pos(int val , int position)
    {
        if(point == a.length-1)
        {
            System.out.println("Array is full...");
        }
        else
        {
            
            for(int i = point ; i>=position ; i--)            
            {
                a[i+1] = a[i];
            }

            //add value
            a[position] = val;
            point++;
            greeting("Inserted");
            display();
            return;
        }
    }


    void delete(int position)
    {
         if(point == -1)
         {
            System.out.println("Array is empty");
         }
         else
         {
            for(int i = position ; i<point ; i++)
            {
                a[i] = a[i+1];
            }
            point--;
            greeting("Deleted");
            display();
            return;        }
    }

    void delete_by_value(int val)
    {
        if(point == -1)
        {
            System.out.println("Array is  full...");
        }
        else
        {
            for(int i = 0 ; i<point ; i++)
            {
                if(a[i] == val)
                {
                    delete(i);
                }
            }
        }
    }


    void display()
    {
        for(int i = 0 ; i<=point ; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}