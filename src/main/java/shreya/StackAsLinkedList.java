package shreya;

public class StackAsLinkedList<T> {

    Node<T> root = null;


   void push(T el){
       if(root==null){
           root = new Node(el);
       }else {
           Node n = root;
           while(n.next!=null){
               n = n.next;
           }
           n.next = new Node(el);
       }
   }


    T pop(){
        if(root==null){

        }else
        if(root.next==null){
            T val = root.value;
            root = null;
            return val;
        }{
            Node<T> p1 = root;
            Node<T> p2 = p1.next;
            while (p2.next!=null){
                p1 = p1.next;
                p2 = p1.next;
            }
            T val = p2.value;
            p2 = null;
            p1.next = p2;
            return val;
        }
    }

}

class Node<T>{
    T value;
    Node next;

    public Node(T value) {
        this.value = value;
        this.next = null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

class Main{
    public static void main(String[] args) {

        StackAsLinkedList<String> stackAsLinkedList = new StackAsLinkedList();

//        stackAsLinkedList.push(1);
//        stackAsLinkedList.push(2);
//        stackAsLinkedList.push(3);
//        stackAsLinkedList.push(4);
//        stackAsLinkedList.push(5);
//
//        System.out.println(stackAsLinkedList.pop());
//        System.out.println(stackAsLinkedList.pop());
//        System.out.println(stackAsLinkedList.pop());
//        System.out.println(stackAsLinkedList.pop());
//        System.out.println(stackAsLinkedList.pop());
//        System.out.println(stackAsLinkedList.pop());
//        System.out.println(stackAsLinkedList.pop());
//        System.out.println(stackAsLinkedList.pop());

        stackAsLinkedList.push("it");
        stackAsLinkedList.push("was");
        System.out.print(stackAsLinkedList.pop() + " ");
        stackAsLinkedList.push("the");
        stackAsLinkedList.push("best");
        System.out.print(stackAsLinkedList.pop()+ " ");
        stackAsLinkedList.push("of");
        stackAsLinkedList.push("times");
        System.out.print(stackAsLinkedList.pop()+ " ");
        System.out.print(stackAsLinkedList.pop()+ " ");
        System.out.print(stackAsLinkedList.pop()+ " ");
        stackAsLinkedList.push("it");
        stackAsLinkedList.push("was");
        System.out.print(stackAsLinkedList.pop()+ " ");
        stackAsLinkedList.push("the");
        System.out.print(stackAsLinkedList.pop()+ " ");
        System.out.print(stackAsLinkedList.pop()+ " ");





    }
}
