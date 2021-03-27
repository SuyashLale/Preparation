package shreya;

import java.util.HashSet;

public class RemoveLinkedListElements {


    public static class ListNode {
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

    public ListNode removeElements(ListNode head, int val) {


        if (head == null) {
            return null;
        }

        ListNode p = head;


        while (p.next != null) {
            if (p.next.val == val) {
                p.next = p.next.next;
            }else {

                p = p.next;
            }
        }

        if (head.val == val) {
            head = head.next;
        }
        return head;
    }



    public static void main(String[] args) {
        RemoveLinkedListElements removeLinkedListElements = new RemoveLinkedListElements();

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(6);
        listNode.next.next.next = new ListNode(3);
        listNode.next.next.next.next = new ListNode(4);
        listNode.next.next.next.next.next= new ListNode(5);
        listNode.next.next.next.next.next.next= new ListNode(6);

        System.out.println(removeLinkedListElements.removeElements(listNode, 6).val);


    }
}
