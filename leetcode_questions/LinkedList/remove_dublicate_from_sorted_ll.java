/*
 83. Remove Duplicates from Sorted List
Given the head of a sorted linked list, delete all duplicates such 
that each element appears only once. Return the linked list sorted as well.

Example 1:
Input: head = [1,1,2]
Output: [1,2]


Example 2:
Input: head = [1,1,2,3,3]
Output: [1,2,3]
 

Example 3 :
Input: head = [];
Output: []

 */

import java.util.*;

class Solution {

    static class ListNode
    {
        int val;
        ListNode next;

        ListNode(int val)
        {
            this.val= val;
            this.next = null;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) 
    {
        if(head == null)
        {
            return null;
        }
        else
        {
            ListNode temp = head;
            ListNode ptr = head.next;
            
            while (ptr != null) 
            {
                if(temp.val != ptr.val)
                {
                    temp.next = ptr;
                    temp = ptr;
                    ptr = ptr.next;
                }
                else
                {
                    ptr = ptr.next;
                }
            }

            if(temp.next != null)
            {
                temp.next = null;
            }
        }
        return head;
    }

    public static void main(String[] args) 
    {
        ListNode head;
        
        head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        ListNode result = deleteDuplicates(head);

        while (result != null) 
        {
                System.out.print(result.val + " ");
                result = result.next;
        }
  
    }
}