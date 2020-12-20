package leetcode.lc24;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prve = null;
        ListNode cur = head;

        while(cur !=  null){
            ListNode temp = cur.next;
            cur.next = prve;

            prve = cur;
            cur = temp;
        }
        return prve;
    }
}
