package stack;

public class StackusingArray {
   private int data[];
   private int topindex;//index of the top most element of the stack

    public StackusingArray(){
        data= new  int [10];
        topindex=-1;

    }
    public StackusingArray(int size){
        data= new  int [size];
        topindex=-1;

    }
    public int size(){
        return topindex+1;

    }

    public boolean isEmpty(){
//        if (topindex==-1){
//            return true;
//        }else{
//            return false;
//        }
        return topindex==-1;

    }
    public void  push(int element) throws StackFullException {
        //if stack is full
        if(topindex==data.length-1){
            //throw exception
//            throw new StackFullException();
            doubleCapacity();
        }
        data[++topindex]=element;
    }
    private void doubleCapacity(){
        System.out.println("doublecapacity");
        int temp[]=data;
        data=new int[2*temp.length];
        for(int i=0;i<temp.length;i++){
            data[i]=temp[i];
        }
    }
    public int top() throws stackemptyexception {
        if (topindex==-1){
            //throw stackemptyexception
            throw new stackemptyexception();
        }
        return data[topindex];
    }
    public int pop() throws stackemptyexception {
        if (topindex==-1){
            //throw stackexception
            throw new stackemptyexception();
        }
        int temp=data[topindex];
        topindex--;
        return temp;

    }

    public static  void main(String[]args) throws StackFullException, stackemptyexception {
        StackusingArray stack=new StackusingArray(2);
        int arr[]={5,6,7,8,9,2,4,5,1,3,4,5};
        for (int i=0;i< arr.length;i++){
            stack.push(arr[i]);
        }
        while (! stack.isEmpty()){
            System.out.println(stack.pop());
        }
//        stack.push(10);
//        System.out.println(stack.top());
//        stack.pop();
//        stack.size();
//        System.out.println(stack.isEmpty());
//    //    stack.pop();

    }


}
