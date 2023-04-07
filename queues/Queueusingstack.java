package queues;

import java.util.Stack;

public class Queueusingstack<T> {
    Stack<T>s1;
    Stack<T>s2;


    public Queueusingstack(){
        s1=new Stack<>();
        s2=new Stack<>();
    }
    public int size(){
        return s1.size();

    }
    public boolean isEmpty(){
        return s1.size()==0;

    }
    public void enqueue(T element){
        while ((!s1.isEmpty())){

         T temp=s1.pop();
         s2.push(temp);
        }
        if(s1.isEmpty()){
            s1.push(element);
        }
        while (!s2.isEmpty()){
            T elem=s2.pop();
            s1.push(elem);
        }
    }
    public T front() throws QueueEmptyexception {
        if(s1.isEmpty()){
            throw new QueueEmptyexception();
        }
        return s1.peek();

    }
    public T dequeue() throws QueueEmptyexception {
        if(s1.isEmpty()){
            throw new QueueEmptyexception();
        }
        return s1.pop();
    }
    public static void main(String[]args) {
        Queueusingstack queue = new Queueusingstack();
        int arr[] = {10, 20, 30, 40};
        for (int elem : arr) {

            queue.enqueue(elem);
        }
        while (!queue.isEmpty()) {
            try {
                System.out.println(queue.dequeue());
            } catch (QueueEmptyexception e) {
                e.printStackTrace();
            }
        }
    }

}
