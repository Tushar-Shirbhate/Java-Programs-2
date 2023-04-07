package Linkedlist;
import java.util.*;

 class  doublenode{
    Node<Integer>head;
    Node<Integer>tail;
    doublenode(){
    }
    doublenode(Node<Integer>head,Node<Integer>tail){
        this.head=head;
        this.tail=tail;
    }

}

public class Node<T> {
    public T data;
   public Node<T> next;
    public  Node(T data){
        this.data=data;
       // next=null;
    }


    public static Node<Integer> createlinkedlist(){
        Node<Integer>n1;
           n1 =new Node<>(10);
           Node<Integer>n2=new Node<>(20);
           Node<Integer>n3=new Node<>(30);
       //    Node<Integer>n4=new Node<>(40);
           n1.next=n2;
        //    System.out.println("n1 "+n1+"data "+n1.data+"next "+n1.next);
        n2.next=n3;
        //    System.out.println("n1 "+n2+"data "+n2.data+"next "+n2.next);
       // n3.next=n4;
        //    System.out.println("n1 "+n3+"data "+n3.data+"next "+n3.next);
        //   System.out.println("n1 "+n4+"data "+n4.data+"next "+n4.next);
        return n1;
    }


    public static void print(Node<Integer> head){
 //       System.out.println("Print"+head);
        Node<Integer> temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();

//        while(head!=null){
//            System.out.print(head.data+" ");
//            head=head.next;
//        }
//        System.out.println();

//        System.out.println(head.data);
//        System.out.println(head.next);
//        System.out.println(head.next.data);
//        System.out.println(head.next.next.data);
    }
    public static void increment(Node<Integer>head){
       Node<Integer> temp = head;
        while ((temp!=null)){
            temp.data++;
            temp=temp.next;
        }
        System.out.println();
    }

    public static  Node<Integer> takeinput(){
        Scanner sc= new Scanner(System.in);
        int data= sc.nextInt();
        Node<Integer>head=null;
        Node<Integer>tail=null;
        while(data!=-1){
            Node<Integer>currentnode=new Node<Integer>(data);
            if(head==null){
                head=currentnode;
                tail=currentnode;
            }else{
//                Node<Integer>tail=head;
//                while (tail.next!=null){
//                    tail=tail.next;
//                }
                tail.next=currentnode;
                tail=currentnode;
            }
           data= sc.nextInt();
        }
        return head;
    }

    public  static  void printRE(Node<Integer>head){
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        printRE(head.next);



    }

    public static  Node<Integer> insertnodeRE(Node<Integer>head,int element,int pos){
        if(head==null&&pos<0){
            return head;
        }
        if(pos==0){
            Node<Integer>newelement=new Node<>(element);
            newelement.next=head;
            return newelement;
        }else {
            head.next=insertnodeRE(head.next,element,pos-1);
            return head;
        }
    }
    public static Node<Integer> reverseLinkedListRec(Node<Integer> head) {
        //Your code goes here


        if (head == null || head.next == null) {
            return head;
        } else {
            Node<Integer> newhead = reverseLinkedListRec(head.next);
            head.next.next = head;
            head.next = null;
            return newhead;
        }

    }
    public static Node<Integer> reverseLListRec(Node<Integer> head) {
        //Your code goes here
        if (head == null || head.next == null) {
            return head;
        } else {
            Node<Integer>newhead1=reverseLinkedListRec(head.next);
            Node<Integer>tail=newhead1;
            while (tail.next!=null){
                tail=tail.next;
            }
            tail.next=head;
            head.next=null;
            return newhead1;
        }

    }

    public  static  doublenode reverseRLLbetter(Node<Integer>head){
        doublenode ans;
        if (head == null || head.next == null) {
            ans=new doublenode(head,head);
//            ans.head=head;
//            ans.tail=head;
            return ans;
        }
         doublenode smallans= reverseRLLbetter(head.next);
         smallans.tail.next=head;
         head.next=null;
         ans=new doublenode();
         ans.head=smallans.head;
         ans.tail= head;
         return ans;



    }



    public static void main (String args[]){
      Node<Integer> head= takeinput();
    //  Node<Integer> head =createlinkedlist();
     // increment(head);
    // printRE(head);
   // head= insertnodeRE(head,20,0);
    //    head=reverseLinkedListRec(head);
     //   head=reverseLListRec(head)
        doublenode ans=reverseRLLbetter(head);
     print(ans.head);
//        System.out.println("Main"+head);




        //  Node n1;....reference
//        Node<Integer> n1= new Node(10);
//        System.out.println(n1);
//        System.out.println(n1.data);
//        System.out.println(n1.next);

    }
}
