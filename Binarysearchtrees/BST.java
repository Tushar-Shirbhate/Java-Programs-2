package Binarysearchtrees;

  class BSTDeleteReturn{
    BinarysearchtreesNode<Integer>root;
    boolean deleted;
    public BSTDeleteReturn(BinarysearchtreesNode<Integer>root,boolean deleted){
        this.root=root;
        this.deleted=deleted;
    }
}

public class BST {
    private  BinarysearchtreesNode<Integer>root;
    private int size;
    //searcher helper
    private  static  boolean ispresenthelper(BinarysearchtreesNode<Integer>root,int x){
        if(root==null){
            return  false;
        }
        if(root.data==x){
            return  true;
        }
        else if(x< root.data){
            return ispresenthelper(root.left,x);
        }else{
            return  ispresenthelper(root.right,x);
        }

    }
    //serchiing element
    public boolean ispresent(int x){

        return  ispresenthelper(root,x);
    }
    private  static BinarysearchtreesNode<Integer> inserthelper(BinarysearchtreesNode<Integer>node,int x){
    if(node==null){
        BinarysearchtreesNode<Integer>newnode=new BinarysearchtreesNode<Integer>(x);
        return newnode;
    }
    if(x>=node.data){
        node.right=inserthelper(node.right,x);
    }else {
        node.left=inserthelper(node.left,x);
    }
    return node;
    }
    //insert the element
    public void insert(int x){
        root=inserthelper(root,x);
//        size++;
    }
    private  static  int minimum(BinarysearchtreesNode<Integer>root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        int minLeft=minimum(root.left);
        int minright=minimum(root.right);
        return Math.min(root.data, Math.min(minLeft,minright));
    }
    private static BSTDeleteReturn  deletedatahelper(BinarysearchtreesNode<Integer>root,int x){
        if(root==null){
            return new BSTDeleteReturn(null,false);
        }
        if(root.data<x){
            BSTDeleteReturn outputright=deletedatahelper(root.right,x);
            root.right=outputright.root;
            outputright.root=root;
            return outputright;
        }if(root.data>x){
            BSTDeleteReturn outputleft=deletedatahelper(root.left,x);
            root.left=outputleft.root;
            outputleft.root=root;
            return outputleft;
        }
        //0 children
        if(root.left==null&&root.right==null){
            return new BSTDeleteReturn(null,true);
        }
        //only left child
        if(root.left!=null&&root.right==null){
            return new BSTDeleteReturn(root.left,true);
        }
        //only right child
        if(root.left==null&&root.right!=null){
            return new BSTDeleteReturn(root.right,true);
        }
        //both the children is present
        int rightmin=minimum(root);
        root.data=rightmin;
        BSTDeleteReturn outputRight=deletedatahelper(root.right,rightmin);
        root.right=outputRight.root;
        return new BSTDeleteReturn(root,true);
    }
    public boolean deletedata(int x){
        BSTDeleteReturn output=deletedatahelper(root,x);
        root=output.root;
        if(output.deleted){
            size--;
        }
        return output.deleted;
    }
    //return size
    public  int size(){

        return size;
    }
    //print tree helper
    private static  void printtreehelper(BinarysearchtreesNode<Integer>root){
      if(root==null){
          return;
      }
      System.out.print(root.data+":");
      if(root.left!=null){
          System.out.print("L:"+root.left.data+", ");
      }
      if(root.right!=null){
          System.out.print("R:"+root.right.data);
      }
        System.out.println();
      printtreehelper(root.left);
      printtreehelper(root.right);
    }
    //print tree
    public void printTree(){
        if(root==null){
            return;
        }
     printtreehelper(root);
    }

    public static void main(String[]args){
        BST b=new BST();
        b.insert(5);
        b.insert(2);
        b.insert(7);
        b.insert(1);
        b.insert(3);
        b.insert(6);
        b.insert(8);

        b.printTree();
        System.out.println(b.ispresent(5));
        b.deletedata(5);
        System.out.println(b.ispresent(5));
        b.printTree();
        b.deletedata(2);
        System.out.println(b.ispresent(2));
        b.printTree();

    }


}
