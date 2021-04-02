package shreya;

public class LinkedListAdd2Nos {

    public static void main(String[] args) {

        ListNode listNode = new ListNode(9);
        listNode.next = new ListNode(9);
        listNode.next.next = new ListNode(9);
        listNode.next.next.next = new ListNode(9);
        listNode.next.next.next.next = new ListNode(9);
        listNode.next.next.next.next.next = new ListNode(9);
        listNode.next.next.next.next.next.next = new ListNode(9);


        ListNode listNode1 = new ListNode(9);
        listNode1.next = new ListNode(9);
        listNode1.next.next = new ListNode(9);
        listNode1.next.next.next = new ListNode(9);

        ListNode result = new LinkedListAdd2Nos().addTwoNumbers(listNode, listNode1);

        while (result!=null){
            System.out.println(result.val);
            result = result.next;
        }

    }


    public static class ListNode {
    int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2==null){
            return l1;
        }

        int rem = 0;
        ListNode head = new ListNode();
        ListNode p = head;
        while(l1!=null && l2!=null){
            int sum = l1.val + l2.val+rem;
            if(sum>9) {
                rem = sum / 10;
                sum = sum%10;
            }else {
                rem = 0;
            }
            p.next = new ListNode(sum);
            p = p.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if(l1==null && l2!=null){
            while(l2!=null){
                int sum = l2.val + rem;
                if(sum>9) {
                    rem = sum / 10;
                    sum = sum%10;
                }else {
                    rem = 0;
                }

                p.next = new ListNode(sum) ;
                p = p.next;
                l2 = l2.next;
            }
        }

        if(l2==null && l1!=null){
            while(l1!=null){
                int sum = l1.val + rem;
                if(sum>9) {
                    rem = sum / 10;
                    sum = sum%10;
                }else {
                    rem = 0;
                }

                p.next = new ListNode(sum);
                p = p.next;
                l1 = l1.next;
            }
        }

        if(l1 == null && l2 == null){
            if (rem!=0){
                p.next = new ListNode(rem);
            }
        }
        return head.next;

    }
}
