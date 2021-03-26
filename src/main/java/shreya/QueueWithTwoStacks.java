package shreya;

import java.util.Stack;

public class QueueWithTwoStacks {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();


    void enqueue(int val){
        if(stack1.empty()) {
            stack1.add(val);
        }
        else {
            pushElementsUsingStacks(val);
        }
    }

    int dequeue(){
        if(stack1.isEmpty()){
            return  -1;
        }else

       return stack1.pop();
    }

    private void pushElementsUsingStacks(int val) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(val);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public static void main(String[] args) {
        QueueWithTwoStacks queueWithTwoStacks = new QueueWithTwoStacks();
        queueWithTwoStacks.enqueue(1);
        queueWithTwoStacks.enqueue(2);
        queueWithTwoStacks.enqueue(3);
        queueWithTwoStacks.enqueue(4);
        queueWithTwoStacks.enqueue(5);

        System.out.println(queueWithTwoStacks.dequeue());
        System.out.println(queueWithTwoStacks.dequeue());
        System.out.println(queueWithTwoStacks.dequeue());
        System.out.println(queueWithTwoStacks.dequeue());
        System.out.println(queueWithTwoStacks.dequeue());
        System.out.println(queueWithTwoStacks.dequeue());
        System.out.println(queueWithTwoStacks.dequeue());
    }


}
