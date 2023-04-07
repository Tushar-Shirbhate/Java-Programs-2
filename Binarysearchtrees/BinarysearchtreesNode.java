package Binarysearchtrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class IsBSTreturn{
    int min;
    int max;
    boolean isBST;
    public IsBSTreturn(int min,int max,boolean isBST){
        this.min=min;
        this.max=max;
        this.isBST=isBST;
    }
}

public class BinarysearchtreesNode <T>{
    public T data;
    public BinarysearchtreesNode<T> left;
    public BinarysearchtreesNode<Integer> right;
    public BinarysearchtreesNode(T data){
        this.data=data;
    }
    public static BinarysearchtreesNode<Integer> takeinputlevelwise(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the root data");
        int rootdata= sc.nextInt();
        if(rootdata==-1){
            return  null;
        }
        BinarysearchtreesNode<Integer> root=new BinarysearchtreesNode<>(rootdata);
        Queue<BinarysearchtreesNode<Integer>> pendingchildern=new LinkedList<BinarysearchtreesNode<Integer>>();
        pendingchildern.add(root);
        while (!pendingchildern.isEmpty()){
            BinarysearchtreesNode<Integer> temp=pendingchildern.poll();
            System.out.println("Enter the left child of "+ temp.data);
            int left= sc.nextInt();
            if(left!=-1) {
                BinarysearchtreesNode<Integer> leftchild = new BinarysearchtreesNode<Integer>(left);
                temp.left=leftchild;
                pendingchildern.add(leftchild);
            }
            System.out.println("Enter the right child of "+ temp.data);
            int right= sc.nextInt();
            if(right!=-1) {
                BinarysearchtreesNode<Integer> rightchild = new BinarysearchtreesNode<>(right);
                temp.right=rightchild;
                pendingchildern.add(rightchild);
            }
        }
        return root;
    }
    public static void printTreeDetailed(BinarysearchtreesNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data+":");
        if(root.left!=null){
            System.out.print("L"+root.left.data+", ");
        }
        if(root.right!=null){
            System.out.print("R"+root.right.data);
        }
        System.out.println();
        printTreeDetailed(root.left);
        printTreeDetailed(root.right);
    }
    public static  int maximum(BinarysearchtreesNode<Integer>root){
        if(root==null){
            return  Integer.MIN_VALUE;
        }
        int leftmax=maximum(root.left);
        int rightmax=maximum(root.right);
        return Math.max(root.data, Math.max(leftmax,rightmax));
    }
    public static int minimum(BinarysearchtreesNode<Integer>root){
        if (root==null) {
            return Integer.MAX_VALUE;
        }
            int leftmin=minimum(root.left);
            int rightmin=minimum(root.right);
            return Math.min(root.data,Math.min(leftmin,rightmin));

    }

//1st solution for finding is tree bst but this has worst time comprxity
    public  static boolean isBST(BinarysearchtreesNode<Integer>root){
     if(root==null){
         return  true;
     }
     int leftmax= maximum(root.left);
     if(leftmax>= root.data){
         return false;
     }
     int rightmin=minimum(root.right);
     if(rightmin< root.data){
        return false;
     }
     boolean isLeftbst=isBST(root.left);
     boolean isRightbst=isBST(root.right);
     return isLeftbst && isRightbst;
    }
    //improved solution for ISBST
    public  static IsBSTreturn isBST2(BinarysearchtreesNode<Integer>root){
      if(root ==null) {
          IsBSTreturn ans = new IsBSTreturn(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
          return ans;
      }
          IsBSTreturn leftans=isBST2(root.left);
          IsBSTreturn rightans=isBST2(root.right);
          int min=Math.min(root.data, Math.min(leftans.min,rightans.min));
          int max=Math.max(root.data, Math.max(leftans.max,rightans.max));
          boolean isBST =true;
          if(leftans.max>=root.data){
              isBST= false;
          }
          if(rightans.min< root.data){
              isBST=false;
          }
          if(!leftans.isBST){
              isBST=false;
          }
          if(!rightans.isBST){
              isBST=false;
          }
          IsBSTreturn fians=new IsBSTreturn(min,max,isBST);
          return fians;
    }
    public  static boolean isbstbetter(BinarysearchtreesNode<Integer>root,int minrange,int maxrange){
        if(root==null){
            return  true;
        }
        if(root.data<minrange||root.data>maxrange){
            return  false;
        }
        boolean isleftwithinrange=isbstbetter(root.left,minrange, root.data-1);
        boolean isrightwithinrange=isbstbetter(root.right,root.data,maxrange);
        return isleftwithinrange &&isrightwithinrange;

    }
    public static ArrayList<Integer> pathtok(BinarysearchtreesNode<Integer>root,int x){
        if(root==null){
            return null;
        }
        if(root.data==x){
            ArrayList<Integer>output=new ArrayList<>();
            output.add(root.data);
            return output;
        }
        ArrayList<Integer> leftoutput=pathtok(root.left,x);
        if(leftoutput!=null){
            leftoutput.add(root.data);
            return leftoutput;
        }
        ArrayList<Integer>rightoutput=pathtok(root.right,x);
        if(rightoutput!=null){
            rightoutput.add(root.data);
            return rightoutput;
        }
        return null;

    }
    public  static  void main(String args[]){
        BinarysearchtreesNode<Integer>root=takeinputlevelwise();
        printTreeDetailed(root);
        System.out.println(isBST(root));
        IsBSTreturn ans=isBST2(root);
        System.out.println(ans.min+" "+ ans.max+" "+ans.isBST);
        System.out.println(isbstbetter(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
        ArrayList<Integer> path=pathtok(root,7);
        if(path==null){
            System.out.println("Not found");
        }else{
            for(int i:path){
                System.out.print(i+" ");
            }
        }

    }

}
