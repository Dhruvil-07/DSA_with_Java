//find mission number from Array

/*
Input: arr[] = {1, 2, 4, 6, 3, 7, 8}
Output: 5
Explanation: Here the size of the array is 7, so the range will be [1, 8]. 
             The missing number between 1 to 8 is 5
 */


 class Find_Number
 {
    public static void main(String[] args) 
    {
        int arr[] = {1, 2, 4, 6, 3, 7, 8};
        int copy[] = new int[arr.length + 1];

         for(int i = 0 ; i<copy.length ; i++)
        {
            copy[i] = -1;
        }

        for(int i = 0 ; i<arr.length ; i++)
        {
            int copy_index = arr[i]-1;
            copy[copy_index] = arr[i];
        }

        for(int i = 0 ; i<copy.length ; i++)
        {
            if(copy[i] == -1)
            {
                System.out.print("Missing Element : " + (i+1));
                break;
            }
        }
        
    }
 }