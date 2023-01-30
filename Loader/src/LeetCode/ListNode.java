package LeetCode;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
class Solution3 {
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        ListNode listNode = new ListNode(0);
        ListNode curr = listNode;
        int carry = 0;
        while (list1 != null || list2 != null || carry != 0 ) {
           int x = list1 != null ? list1.val : 0;
           int y = list2 != null ? list2.val : 0;
           int sum = x + y + carry;
           carry = sum / 10;
          curr.next = new ListNode(sum % 10);
          curr = curr.next;
         if (list1 != null)
             list1 = list1.next;
         if (list2 != null)
             list2 = list2.next;
        }
        return listNode;
    }
}
