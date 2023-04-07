package queues;

public class Queuesusingarray {
    private int []data;
    private int front;//index of the element at the front of the queue
    private int rear;//index of the element at the rear of the queue
    private int size;

    public Queuesusingarray(){
        data=new int[5];
        front=-1;
        rear=-1;
    }
    public Queuesusingarray(int capacity){
        data=new int [capacity];
        front=-1;
        rear=-1;
    }
    public int size(){

        return size;
    }
    public boolean isEmpty(){
//        if(size==0){
//            return true;
//        }else{
//            return false;
//        }
        return size==0;
    }
    public void enqueue(int elem){
        if(size==data.length){
//          throw new Queuefullexception();
            doublecapacity();
        }
        if (size==0){
            front=0;
        }
//        rear++;
//        if(rear==data.length){
//            rear=0;
//        }
        rear=(rear+1)%data.length;
        data[rear]=elem;
        size++;

    }
    public void doublecapacity(){
        int temp[]=data;
        data=new int[2*temp.length];
        int index=0;
        for(int i=front;i<temp.length;i++){
         data[index++]=temp[i];
        }
        for(int i=0;i<front;i++){
            data[index++]=temp[i];
        }
        front=0;
        rear=temp.length-1;
    }
    public int front() throws QueueEmptyexception {
        if(size==0){
            throw new QueueEmptyexception();
        }
        return data[front];
    }
    public int dequeue() throws QueueEmptyexception {
        if(size==0){
            throw new QueueEmptyexception();
        }
        int temp=data[front];
//        front++;
//        if(front==data.length){
//            front=0;
//        }
        front=(front+1)%data.length;
        size--;
        if(size==0){
            front=-1;
            rear=-1;
        }
        return temp;


    }
    public static void main(String[]args){
        Queuesusingarray queue=new Queuesusingarray(2);
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
