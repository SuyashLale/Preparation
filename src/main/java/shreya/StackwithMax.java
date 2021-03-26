package shreya;

import java.util.*;

public class StackwithMax {


    Stack<Integer> stack = new Stack<Integer>();
    int maxEl;

    void push(int el){
        if(stack.isEmpty()){
            stack.push(el);
            maxEl = el;
        }else {
            if(el>maxEl){
                stack.push(2*el-maxEl);
                maxEl = el;
            }else{
                stack.push(el);
            }
        }
    }

    int pop(){
        int poppedEl = stack.pop();
        if(poppedEl<maxEl){
            return poppedEl;
        }else {
            int newMax = maxEl;
            maxEl = 2 * newMax - poppedEl;
            return newMax;
        }
    }

    int getMaxEl(){
        if(stack.isEmpty()){
            maxEl = -1;
        }
        return maxEl;
    }

    public static void main(String[] args) {

        StackwithMax stackwithMax = new StackwithMax();

        stackwithMax.push(2);
        stackwithMax.push(4);
        stackwithMax.push(7);
        stackwithMax.push(5);
        stackwithMax.push(9);
        stackwithMax.push(1);

        System.out.println("Max el = "+stackwithMax.getMaxEl());

        System.out.println(stackwithMax.pop());
        System.out.println(stackwithMax.pop());

        System.out.println("Max el = "+stackwithMax.getMaxEl());

        System.out.println(stackwithMax.pop());

        System.out.println("Max el = "+stackwithMax.getMaxEl());

        System.out.println(stackwithMax.pop());

        System.out.println("Max el = "+stackwithMax.getMaxEl());
        System.out.println(stackwithMax.pop());

        System.out.println(stackwithMax.pop());

        System.out.println("Max el = "+stackwithMax.getMaxEl());

        //System.out.println("Max el = "+stackwithMax.getMaxEl());

    }

}
