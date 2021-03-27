package shreya;

public class MergeSortedLists {


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


    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode headNode = new ListNode();
        ListNode p = headNode;

        while(l1!=null && l2!=null){

            if(l1.val <= l2.val){
                ListNode node = new ListNode(l1.val);
                p.next = node;
                p = p.next;
                l1 = l1.next;
            }else{
                ListNode node = new ListNode(l2.val);
                p.next = node;
                p = p.next;
                l2 = l2.next;
            }

        }
        if(l1 == null){
            p.next = l2;
        }else {
            p.next = l1;
        }

        return headNode.next;
    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l1P = l1;
        System.out.println( "l1 is   ");
        while (l1P!=null){
            System.out.print(l1P.val + " ");
            l1P = l1P.next;

        }
        System.out.println();

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l2P = l2;

        System.out.println( "l2 is   ");
        while (l2P!=null){
            System.out.print( l2P.val + "   ");
            l2P = l2P.next;
        }
        System.out.println();

        ListNode result = mergeTwoLists(l1, l2);

        System.out.println( "Result is   ");
        while (result!=null){
            System.out.print(result.val + "  ");
            result = result.next;

        }
    }
}


