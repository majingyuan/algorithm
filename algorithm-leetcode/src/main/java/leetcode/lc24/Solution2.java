package leetcode.lc24;

public class Solution2 {
    public ListNode2 reverseList(ListNode2 head) {
        ListNode2 prve = null;
       ListNode2 cur = head;

        while(cur !=  null){
            ListNode2 temp = cur.next;
            cur.next = prve;

            prve = cur;
            cur = temp;
        }
        return prve;
    }

    private static class ListNode2 {
        int val;
        ListNode2 next;
    }
}
