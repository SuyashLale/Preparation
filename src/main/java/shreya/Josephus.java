package shreya;

public class Josephus {

    static void  printEliminationOrder(int m, int n ){
        QueueAsLinkedList queueAsLinkedList = new QueueAsLinkedList();

        for(int i = 0; i<n; i++ ){
            queueAsLinkedList.enqueue(i);
        }

        while (queueAsLinkedList.root.next !=null){

            for(int i =1; i<m; i++){
                queueAsLinkedList.enqueue(queueAsLinkedList.dequeue());
            }
            System.out.print(queueAsLinkedList.dequeue() + "  ");
        }

    }

    public static void main(String[] args) {
        printEliminationOrder(2, 7);
    }
}
