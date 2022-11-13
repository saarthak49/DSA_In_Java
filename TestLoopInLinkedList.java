

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class TestLoopInLinkedList {

    public boolean hasCycle(ListNode head) {

        if (head == null)
            return false;

        if(head.next == null)
            return false;

        if(head.next.next == null)
            return false;


        ListNode slowPtr = head;
        ListNode fastPtr = head.next.next;

        while(slowPtr!=null && fastPtr!=null && slowPtr != fastPtr)
        {
            slowPtr = slowPtr.next;

            if(fastPtr.next == null)
                return false;

            fastPtr = fastPtr.next.next;
        }

        if(slowPtr == fastPtr)
            return true;
        return false;
    }
}
