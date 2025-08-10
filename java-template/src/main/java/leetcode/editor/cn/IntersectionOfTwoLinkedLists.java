package leetcode.editor.cn;

import leetcode.editor.common.ListNode;

public class IntersectionOfTwoLinkedLists {

    //leetcode submit region begin(Prohibit modification and deletion)
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            while (headA.next != null && headB.next != null) {
                headA = headA.next;
                if (headA.next == null) {
                    headA.next = headB;
                }
                headB = headB.next;
                if (headB.next == null) {
                    headB.next = headA;
                }
                System.out.println(headA.val + "," + headB.val);
                if (headA.next == headB.next) {
                    return headA.next;
                }
            }
            return null;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

    
    public static void main(String[] args) {
        Solution solution = new IntersectionOfTwoLinkedLists().new Solution();
        // put your test code here
        
    }
}