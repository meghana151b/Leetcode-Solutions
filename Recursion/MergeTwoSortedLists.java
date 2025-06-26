// LeetCode Program:Merge Two Sorted Lists
// Link:http://leetcode.com/problems/merge-two-sorted-lists/submissions/1677372547/

//Time Complexity:O(m+n)
//Space Complexity:O(m+n)

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        if(list1.val<list2.val){
            list1.next = mergeTwoLists(list1.next,list2);
            return list1;
        }
        else{
            list2.next=mergeTwoLists(list1,list2.next);
            return list2;
        }
        
    }
}
