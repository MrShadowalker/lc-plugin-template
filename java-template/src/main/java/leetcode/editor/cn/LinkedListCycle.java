package leetcode.editor.cn;

import leetcode.editor.common.ListNode;

public class LinkedListCycle {

    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) {
     * val = x;
     * next = null;
     * }
     * }
     */
    public class Solution {
        public boolean hasCycle(ListNode head) {
            if (head == null || head.next == null) {
                return false;
            }
            // 快慢指针，快每次2步、慢每次1步，能追上就说明有环
            ListNode slow = head;
            ListNode fast = head;

            while (slow != null && fast != null) {
                slow = slow.next;
                fast = fast.next.next;
                System.out.println("slow:" + slow + ",fast:" + fast);
                if (slow == fast) {
                    return true;
                }
            }
            return false;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)


    public static void main(String[] args) {
        Solution solution = new LinkedListCycle().new Solution();
        // put your test code here
    }
}