public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode mergedList = new ListNode(0);
    ListNode head = mergedList;
    if (list1 == null && list2 == null)
        return list2;
    else if (list2 == null)
        return list1;
    else if (list1 == null)
        return list2;
    while (list1 != null || list2 != null)
    {
        if (list2 == null || (list1 != null && list1.val <= list2.val))
        {
            mergedList.next = list1;
            list1 = list1.next;
        }
        else
        {
            mergedList.next = list2;
            list2 = list2.next;
        }
        mergedList = mergedList.next;
    }
    return head.next;
    }
}
