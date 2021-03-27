package shreya;

public class PalindromeLinkedList {

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

    public boolean isPalindrome(ListNode head) {

        if(head == null || head.next == null){
            return true;
        }

        ListNode p = head;
        ListNode q = head.next;

        while(q.next!=null && q.next.next!=null){
            q = q.next.next;
            p = p.next;

        }
        if(q.next==null){
            p = p.next;
        }else
        if(q.next.next == null){
            p = p.next.next;
        }

        System.out.println("Value of p is "+p.val);


        //to do reverse and compare

//
//    ListNode r = head;
//
//    while(p.next!=null){
//        if(r.val == p.val){
//            r.next = p.next;
//        }else{
//            return false;
//        }
//
//    }
//
//    return true;
        return false;
}


    public static void main(String[] args) {
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(3);
        listNode.next.next.next.next = new ListNode(2);
        listNode.next.next.next.next.next= new ListNode(2);
        listNode.next.next.next.next.next.next= new ListNode(1);

        System.out.println(palindromeLinkedList.isPalindrome(listNode));


    }
}
