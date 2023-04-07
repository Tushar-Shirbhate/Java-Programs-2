package queues;

import Linkedlist.Node;

public class queueusingLL<T> {
    private Node<T>front;
    private Node<T>reare;
     int size;

    public queueusingLL(){
        front=null;
        reare=null;
        size=0;
    }

    public int size(){
        return size;

    }
    public boolean isEmpty(){
        return size==0;

    }
    public void enqueue(T element){
        Node<T>newnode=new Node<>(element);
        if(reare==null){
            front=newnode;
            reare=newnode;
        }else {
            reare.next = newnode;
            reare=newnode;
        }
        size++;
    }
    public T front() throws QueueEmptyexception {
        if(size==0){
          throw new QueueEmptyexception ();
        }
        return front.data;

    }
    public T dequeue() throws QueueEmptyexception {
        if(size==0){
          throw new QueueEmptyexception() ;
        }
        T temp= front.data;
        front=front.next;
        if(front==null){
            reare=null;
        }
        size--;
        return temp;
    }
    public static void main(String[]args){
        queueusingLL queue=new queueusingLL();
        int arr[]={10,20,30,40};
        for(int elem:arr) {

            queue.enqueue(elem);
        }
        while (!queue.isEmpty()){
            try {
                System.out.println(queue.dequeue());
            } catch (QueueEmptyexception e) {
                e.printStackTrace();
            }
        }
    }
}
