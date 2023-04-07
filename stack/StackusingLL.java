package stack;

import Linkedlist.Node;

public class StackusingLL<T> {
   private  Node<T >head;
   private int size;
   public StackusingLL(){
      head=null;
      size=0;
   }
   public int size(){
      return size;
   }
   public boolean isEmpty(){
      if(size==0){
         return true;
      }else{
         return false;
      }

   }
   public void push(T element){
      Node<T> newnode=new Node<T>(element);
      newnode.next=head;
      head=newnode;
      size++;

   }
   public T Top() throws stackemptyexception {
      if(head==null||size==0){
         throw new stackemptyexception();
      }
      return head.data;
   }
   public T pop() throws stackemptyexception {
      if(head==null||size==0){
         throw new stackemptyexception();
      }
      T temp=head.data;
      head=head.next;
      size--;
      return temp;
   }
   public static void main(String[] args) throws stackemptyexception {
      StackusingLL<Integer> stack=new StackusingLL<>();
      int arr[]={5,6,7,8,9,2,4,5,1,3,4,5};
      for (int i=0;i< arr.length;i++){
         stack.push(arr[i]);
      }
      while (! stack.isEmpty()){
         System.out.println(stack.pop());
      }


   }

}
