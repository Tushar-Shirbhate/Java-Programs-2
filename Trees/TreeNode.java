package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeNode<T> {
    T data;
    ArrayList<TreeNode<T>> childern;
    public  TreeNode(T data){
        this.data=data;
        this.childern=new ArrayList<>();
    }
    //normal way of printing
    public static  void printTree(TreeNode<Integer>root){
        //Special case not the base case
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        for(int i=0;i<root.childern.size();i++){
            TreeNode<Integer>child=root.childern.get(i);
            printTree(child);
        }
    }
    //print tree in better way
    public static  void printTreeBetter(TreeNode<Integer>root){
        //Special case not the base case
        if(root==null){
            return;
        }
        System.out.print(root.data+": ");
        for(int i=0;i<root.childern.size();i++){
            System.out.print(root.childern.get(i).data+" ");
        }
        System.out.println();
        for(int i=0;i<root.childern.size();i++){
            TreeNode<Integer>child=root.childern.get(i);
            printTreeBetter(child);
        }
    }
    //count of number of nodes
    public  static  int noofnodes(TreeNode<Integer>root){
      int count=1;
      for(int i=0;i<root.childern.size();i++){
          int childrencount=noofnodes(root.childern.get(i));
          count+=childrencount;
      }
      return count;
    }
    //taking input levelwise
    public static TreeNode<Integer> takeinputlevel(){
        Scanner sc=new Scanner(System.in);
        Queue<TreeNode<Integer>> pendingnodes=new LinkedList<>();
        System.out.println("Enter the root data");
        int rootdata=sc.nextInt();
        if(rootdata==-1){
            return  null;
        }
        TreeNode<Integer>root=new TreeNode<>(rootdata);
        pendingnodes.add(root);
        while (!pendingnodes.isEmpty()){
            TreeNode<Integer>temp= pendingnodes.poll();
            System.out.println("Enter the no of children of  "+temp.data);
            int numofchid= sc.nextInt();
            for(int i=0;i<numofchid;i++){
                System.out.println("Enter the "+i+"th child of"+temp.data);
                int childdata= sc.nextInt();
                TreeNode<Integer>childnode=new TreeNode<>(childdata);
                temp.childern.add(childnode);
                pendingnodes.add(childnode);
            }
        }
        return root;
    }

    public static void  main(String[]args){
//        TreeNode<Integer>root=new TreeNode<>(4);
//        TreeNode<Integer>node1=new TreeNode<>(2);
//        TreeNode<Integer>node2=new TreeNode<>(3);
//        TreeNode<Integer>node3=new TreeNode<>(1);
//        TreeNode<Integer>node4=new TreeNode<>(5);
//        TreeNode<Integer>node5=new TreeNode<>(6);
//        root.childern.add(node1);
//        root.childern.add(node2);
//        root.childern.add(node3);
//        node2.childern.add(node4);
//        node2.childern.add(node5);
//        printTree(root);
//        printTreeBetter(root);
//        System.out.println("The total no. of nodes in the tree is:"+noofnodes(root));
          TreeNode<Integer> root=takeinputlevel();
          printTreeBetter(root);




    }

}
