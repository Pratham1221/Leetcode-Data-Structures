/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans;
        if (list1 == null) {
            ans = list2;
            return ans;
        }
        if (list2 == null) {
            ans = list1;
            return ans;
        }
        if (list1.val > list2.val) {
            ans = list2;
            list2 = list2.next;
        } else {
            ans = list1;
            list1 = list1.next;
        }
        ListNode curr = ans;
        while (list1 != null && list2 != null) {
            // if (list1 == null) {
            //     curr.next = list2;
            //     break;
            // }
            // if (list2 == null) {
            //     curr.next = list1;
            //     break;
            // }
            if (list1.val < list2.val) {
                curr.next = list1;
                list1 = list1.next;
                curr = curr.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
                curr = curr.next;
            }
        }
        if(list1==null){
            curr.next = list2;
        }else{
            curr.next = list1;
        }
        return ans;
    }
}
