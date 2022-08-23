public class MiddleoftheLinkedList {
    public ListNode middleNode(ListNode head) {
        int size = 0;
        int middle;
        ListNode test = head;
        while (test.next != null)
        {
            size ++;
            test = test.next;
        }
        if (size % 2 == 1)
            middle = size / 2 + 1;
        else
            middle = size / 2;
        for (int i = 0; i < middle; i++)
        {
            head = head.next;
        }
        return head;
    }
}
