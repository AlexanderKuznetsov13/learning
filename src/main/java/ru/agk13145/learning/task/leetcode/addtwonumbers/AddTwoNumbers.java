package ru.agk13145.learning.task.leetcode.addtwonumbers;

public class AddTwoNumbers {

    /**
     * reverse l1 and l2, and return them sum as inverted
     * @param l1 inverted first integer as a digits
     * @param l2 inverted second integer as a digits
     * @return sum l1 and l2 in reverse order
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int mind = 0;
        ListNode listNode = new ListNode();
        ListNode l = listNode;
        int result = 0;

        while (l1 != null || l2 != null) {
            l.next = new ListNode();
            l = l.next;
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            result = x + y + mind;
            mind = result / 10;
            result = result % 10;
            l.val = result;
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        if (mind != 0) {
            l.next = new ListNode(mind);
        }
        return listNode.next;
    }

    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        //ListNode listNode1 = new ListNode(9);
        //ListNode listNode2 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9,new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))))));
        ListNode listNode1 = new ListNode(5);//, new ListNode(4, new ListNode(3)));
        ListNode listNode2 = new ListNode(5);//, new ListNode(6, new ListNode(4)));


        ListNode result = addTwoNumbers.addTwoNumbers(listNode1, listNode2);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
