package binarytrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class BalancedTreeReturn{
    int height;
    boolean isBalanced;
}

public class BinarytreeNode<T> {
    public T data;
    public BinarytreeNode<T> left;
    public BinarytreeNode<T>right;
    public BinarytreeNode(T data){
        this.data=data;
    }

    public  static  void  printatdepthk(BinarytreeNode<Integer>root,int k){
        if(root==null){
            return;
        }
        if (k==0){
            System.out.print(root.data+" ");
            return;
        }
        printatdepthk(root.left,k-1);
        printatdepthk(root.right,k-1);
    }
    public static  int noofleaves(BinarytreeNode<Integer>root){
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        return  noofleaves(root.left)+noofleaves(root.right);
    }
    public static int countnumofnodes(BinarytreeNode<Integer>root){
        if(root==null){
            return 0;
        }
        int countofleftnodes=countnumofnodes(root.left);
        int countofrightnodes=countnumofnodes(root.right);
        return 1+countofleftnodes+countofrightnodes;
    }
    public static int largest(BinarytreeNode<Integer>root){
        if(root==null){
            return  -1;
        }
        int leftlargest=largest(root.left);
        int rightlargest=largest(root.right);
        return Math.max(root.data, Math.max(leftlargest,rightlargest));
    }
    public static BinarytreeNode<Integer> takeTreeinputbetter(boolean isroot,int parentdata,boolean isLeft){
        if(isroot){
            System.out.println("Enter the root data");
        }else{
            if(isLeft){
                System.out.println("Enter left child of "+parentdata);
            }else {
                System.out.println("Enter right child of "+parentdata);
            }
        }
        Scanner sc=new Scanner(System.in);
        int rootdata= sc.nextInt();
        if(rootdata==-1){
            return null;
        }
        BinarytreeNode<Integer>root=new BinarytreeNode<>(rootdata);
        BinarytreeNode<Integer>leftchild=takeTreeinputbetter(false,rootdata,true);
        BinarytreeNode<Integer>rightchild=takeTreeinputbetter(false,rootdata,false);
        root.left=leftchild;
        root.right=rightchild;
        return root;
    }

    public static BinarytreeNode<Integer> takeTreeinput(){
        System.out.println("Enter the root data");
        Scanner sc=new Scanner(System.in);
        int rootdata= sc.nextInt();
        if(rootdata==-1){
            return null;
        }
        BinarytreeNode<Integer>root=new BinarytreeNode<Integer>(rootdata);
        BinarytreeNode<Integer>leftChild=takeTreeinput();
        BinarytreeNode<Integer>rightChild=takeTreeinput();
        root.left=leftChild;
        root.right=rightChild;
        return root;
    }
    public static void printTreeDetailed(BinarytreeNode<Integer> root) {
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
    public static void printTree(BinarytreeNode<Integer> root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);
//        if(root.left!=null) {
//            printTree(root.left);
//        }
//        if(root.right!=null) {
//            printTree(root.right);
//        }
    }
    public static BinarytreeNode<Integer> Removeleaf(BinarytreeNode<Integer>root){
        if(root==null){
            return null;
        }
        if(root.left==null&&root.right==null){
            return null;
        }
        root.left=Removeleaf(root.left);
        root.right=Removeleaf(root.right);
        return root;
    }
    public static int height(BinarytreeNode<Integer>root){
        if(root==null){
            return  0;
        }
        return 1+Math.max((height(root.left)),(height(root.right)));
    }
    public  static boolean isbalanced(BinarytreeNode<Integer>root){
        if(root==null){
            return true;
        }
        int leftheight=height(root.left);
        int rightheight=height(root.right);
        if (Math.abs(leftheight-rightheight)>1){
            return false;
        }
        return isbalanced(root.left)&&isbalanced(root.right);

    }
    public static BalancedTreeReturn isBalancedbetter(BinarytreeNode<Integer>root){
        if(root==null){
            int height=0;
            boolean isbal=true;
            BalancedTreeReturn ans=new BalancedTreeReturn();
            ans.height=height;
            ans.isBalanced=isbal;
            return ans;
        }
        BalancedTreeReturn leftoutput=isBalancedbetter(root.left);
        BalancedTreeReturn rightoutput=isBalancedbetter(root.right);

        boolean isbal=true;
        int height= 1+Math.max(leftoutput.height,rightoutput.height);
        if(Math.abs(leftoutput.height-rightoutput.height)>1){
            isbal=false;
        }
        if(!leftoutput.isBalanced||!rightoutput.isBalanced){
            isbal=false;
        }
        BalancedTreeReturn ans=new BalancedTreeReturn();
        ans.height=height;
        ans.isBalanced=isbal;
        return ans;
    }

    public static BinarytreeNode<Integer> takeinputlevelwise(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the root data");
        int rootdata= sc.nextInt();
        if(rootdata==-1){
            return  null;
        }
        BinarytreeNode<Integer> root=new BinarytreeNode<Integer>(rootdata);
        Queue<BinarytreeNode<Integer>> pendingchildern=new LinkedList<BinarytreeNode<Integer>>();
        pendingchildern.add(root);
        while (!pendingchildern.isEmpty()){
            BinarytreeNode<Integer> temp=pendingchildern.poll();
            System.out.println("Enter the left child of "+ temp.data);
            int left= sc.nextInt();
            if(left!=-1) {
                BinarytreeNode<Integer> leftchild = new BinarytreeNode<Integer>(left);
                temp.left=leftchild;
                pendingchildern.add(leftchild);
            }
            System.out.println("Enter the right child of "+ temp.data);
            int right= sc.nextInt();
            if(right!=-1) {
                BinarytreeNode<Integer> rightchild = new BinarytreeNode<Integer>(right);
                temp.right=rightchild;
                pendingchildern.add(rightchild);
            }
        }
        return root;
    }



    public static void main(String[]args){
//        BinarytreeNode<Integer>root=new BinarytreeNode<>(1);
//        BinarytreeNode<Integer>rootleft=new BinarytreeNode<>(2);
//        BinarytreeNode<Integer>rootright =new BinarytreeNode<>(3);
//        root.left=rootleft;
//        root.right=rootright;
//        BinarytreeNode<Integer>tworight=new BinarytreeNode<>(4);
//        BinarytreeNode<Integer>threeleft=new BinarytreeNode<>(5);
//        rootleft.right=tworight;
//        rootright.left=threeleft;
//        printTree(root);
//        BinarytreeNode<Integer>root=takeTreeinputbetter(true,0,true);
        BinarytreeNode<Integer>root=takeinputlevelwise();
        printTreeDetailed(root);
        System.out.println("Total no of nodes are " +countnumofnodes(root));;
        System.out.println("largest "+largest(root));
        System.out.println("No of leaf nodes are "+noofleaves(root));
        System.out.println("Print at depth k");
        printatdepthk(root,2);
        BinarytreeNode<Integer>newroot=Removeleaf(root);
        System.out.println();
        printTreeDetailed(newroot);
        System.out.println("height of root if  "+height(root));
        System.out.println("is tree balanced "+isbalanced(root));
        System.out.println("Is balancebetter"+isBalancedbetter(root).isBalanced);



    }
}
