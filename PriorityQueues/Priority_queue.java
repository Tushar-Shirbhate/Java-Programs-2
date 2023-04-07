package PriorityQueues;

import java.util.ArrayList;

public class Priority_queue<T> {
    private ArrayList<Element<T>> heap;

    public Priority_queue(){
        heap=new ArrayList<>();
    }

    public void insert(T value,int priority){
        Element<T>e=new Element<>(value, priority);
        heap.add(e);
        int childindex= heap.size()-1;
        int parentindex=(childindex-1)/2;
        while(childindex > 0){
            if(heap.get(childindex).priority<heap.get(parentindex).priority){
                Element<T>temp=heap.get(childindex);
                heap.set(childindex,heap.get(parentindex));
                heap.set(parentindex,temp);
                childindex=parentindex;
                parentindex=(childindex-1)/2;
            }else{
                return;
            }
        }
    }
    public T getMin() throws PriorityQueueException {
        if(isEmpty()){
            throw new PriorityQueueException();
        }
        return  heap.get(0).value;


    }
    public T removeMin() throws PriorityQueueException {
        if(isEmpty()){
            throw new PriorityQueueException();
        }
        Element<T>removed=heap.get(0);
        T ans=removed.value;
        heap.set(0,heap.get(heap.size()-1));
        heap.remove(heap.size()-1);

        int parentindex=0;
        int leftchidindex=parentindex*2+1;
        int rightchildindex=parentindex*2+2;

        while (leftchidindex< heap.size()){
            int midindex=parentindex;
            if(heap.get(leftchidindex).priority<heap.get(midindex).priority){
                midindex=leftchidindex;
            }
            if(rightchildindex< heap.size()&&heap.get(rightchildindex).priority<heap.get(midindex).priority){
                midindex=rightchildindex;
            }
            if(midindex==parentindex){
                break;
            }
            Element<T>temp=heap.get(midindex);
            heap.set(midindex,heap.get(parentindex));
            heap.set(parentindex,temp);
            parentindex=midindex;
            leftchidindex=parentindex*2+1;
            rightchildindex=parentindex*2+2;
        }
        return ans;
    }
    public int size(){
        return heap.size();

    }
    public boolean isEmpty(){
       if(size()==0){
           return true;
       }else {
           return  false;
       }
    }
    public static void main(String[]args) throws PriorityQueueException {
        Priority_queue<String>pq=new Priority_queue<>();
        pq.insert("abc",15);
        pq.insert("def",13);
        pq.insert("hij",90);
        pq.insert("klm",150);
        pq.insert("nop",120);
        while (!pq.isEmpty()){
            System.out.println(pq.getMin());
            pq.removeMin();
        }

    }


}
