/** 
Linked List Cycle       
Given head, the head of a linked list, determine if the linked list has a cycle in it. 

*/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    boolean checkCycle(ListNode head){
        ListNode curr=head;
        ListNode fast=head;
        
        while(curr!=null && fast!=null && fast.next!=null){
            
            curr=curr.next;
            fast=fast.next.next;
            if(curr==fast){
                return true;
                
            }
        }
        
        return false;
    }
    
    public boolean hasCycle(ListNode head) {
        boolean b= checkCycle(head);
        System.out.println(b);
        return b;
    }
}