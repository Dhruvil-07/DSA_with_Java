/*
leat code -> question 4

Given two sorted arrays nums1 and nums2 of size m and n respectively, 
return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).


Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.


Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 */


 /*
  first merge two sorted array and create one final array
  then find median of final array
  (
    concept  -> array length odd or even
  )
  */


class Meadian_of_two_sorted_array 
{
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int final_arr[] = new int[nums1.length + nums2.length];
      
        int index1 = 0;
        int index2 = 0;
        int x = 0;

        while(index1 < nums1.length && index2<nums2.length)
        {
            if(nums1[index1] < nums2[index2])
            {
                final_arr[x] = nums1[index1];
                index1++;
                x++;
            }
            else
            {
                final_arr[x] = nums2[index2];
                index2++;
                x++;
            }
        }

        while(index1<nums1.length)
        {
            final_arr[x] = nums1[index1];
            index1++;
            x++;
        }

        while(index2<nums2.length)
        {
            final_arr[x] = nums2[index2];
            index2++;
            x++;
        }

       //find median
       if(final_arr.length % 2 == 0)
       {
           int position = (final_arr.length / 2);
           double first = final_arr[position];
           double second = final_arr[position-1];
           double result = (first + second) / 2;
           return result;
       }
       else
       {
            int position = (final_arr.length + 1) / 2;
            double result = final_arr[position-1];
            return result;
       }
    }

    public static void main(String[] args) 
    {
        int nums1[] = {10,12,14}; 
        int nums2[] = {13};

        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println("Median : " + median);
    }
}
