package shreya;

public class QueueAsLinkedList {
    NodeItem root = null;
    NodeItem lastNode = root;


    void enqueue(int el){
        if(root==null){
            root = new NodeItem(el);
            lastNode = root;
        }
        else
        {
            lastNode.next = new NodeItem(el);
            lastNode = lastNode.next;
            lastNode.next = null;
        }
    }


    int dequeue(){
        if(root==null){
            return -1;
        }else{
            int val = root.value;
            root = root.next;
            return val;
        }
    }

}

class NodeItem{
    int value;
    NodeItem next;

    public NodeItem(int value) {
        this.value = value;
        this.next = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public NodeItem getNext() {
        return next;
    }

    public void setNext(NodeItem next) {
        this.next = next;
    }
}

class QueueMain{
    public static void main(String[] args) {

        QueueAsLinkedList stackAsLinkedList = new QueueAsLinkedList();

        stackAsLinkedList.enqueue(1);
        stackAsLinkedList.enqueue(2);
        stackAsLinkedList.enqueue(3);
        stackAsLinkedList.enqueue(4);
        stackAsLinkedList.enqueue(5);

        System.out.println(stackAsLinkedList.dequeue());
        System.out.println(stackAsLinkedList.dequeue());
        System.out.println(stackAsLinkedList.dequeue());
        System.out.println(stackAsLinkedList.dequeue());
        System.out.println(stackAsLinkedList.dequeue());
        System.out.println(stackAsLinkedList.dequeue());
        System.out.println(stackAsLinkedList.dequeue());
        System.out.println(stackAsLinkedList.dequeue());


        stackAsLinkedList.enqueue(9);
        stackAsLinkedList.enqueue(10);

        System.out.println(stackAsLinkedList.dequeue());
        System.out.println(stackAsLinkedList.dequeue());
        System.out.println(stackAsLinkedList.dequeue());



    }
}
