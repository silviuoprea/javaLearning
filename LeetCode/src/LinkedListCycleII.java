import java.util.HashMap;

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        ListNode test = head;
        if (head == null)
            return null;
        HashMap<ListNode, ListNode> lista = new HashMap<>();
        while (test.next != null)
        {
            if(lista == null)
            {
                lista.put(test, test);
            }
            else
            {
                if (lista.containsKey(test))
                    return lista.get(test);
                lista.put(test, test);
            }
            test = test.next;
        }
        return null;
    }
}
