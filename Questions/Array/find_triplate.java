import java.util.*;

class find_triplate 
{
    static int count_triplate(ArrayList<Integer> li)
    {
        int counter = 0;

        for(int i = 0 ; i<li.size() ; i++)
        {
            for(int j = i+1 ; j<li.size() ; j++)
            {
                if(li.contains(li.get(i) + li.get(j)))
                {
                    counter++;
                }
            }
        }

        return counter;
    }
    

    public static void main(String[] args) 
    {
        ArrayList<Integer> li = new ArrayList<Integer>();
        li.add(1);
        li.add(2);
        li.add(5);
        li.add(3);

        System.out.println("Toatal Triplate : " + count_triplate(li));
    }

}
