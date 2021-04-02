package shreya;

import java.util.LinkedList;
import java.util.List;

class MinStack {

    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(2);

    }


    List<Integer> list;
    List<Integer> minList;

    /** initialize your data structure here. */

    public MinStack() {
      list = new LinkedList<Integer>();
       minList = new LinkedList<Integer>();

    }

    public void push(int val) {
        list.add(val);
        if(minList.isEmpty()){
            minList.add(val);
        }else{
            if(val < minList.get(minList.size()-1)){
                minList.add(val);
            }else{
                minList.add(minList.get(minList.size()-1));
            }
        }

    }

    public void pop() {
        list.remove(list.size()-1);
        minList.remove(minList.size()-1);


    }

    public int top() {
        return list.get(list.size()-1);

    }

    public int getMin() {
        return minList.get(minList.size()-1);

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */