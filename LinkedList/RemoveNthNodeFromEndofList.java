//LeetCode Solution:19. Remove Nth Node From End of List
//Link:https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/

//Time Complexity:O(L)
//Space Complexity:O(1)

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode fast=dummy,slow=dummy;
        for(int i=0;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
        
    }
}
