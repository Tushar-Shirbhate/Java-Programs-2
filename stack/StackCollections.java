package stack;

import java.util.Stack;

public class StackCollections {
    public static void main(String []args){
        Stack<Integer> stack=new Stack<>();
//        stack.push(10);
//        System.out.println(stack.size());
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.isEmpty());
        int arr[]={5,6,7,8};
        for (int element:arr){
            stack.push(element);
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
}
