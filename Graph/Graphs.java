package Graph;

import java.util.Scanner;

public class Graphs {
    public static void dftraversalhepler(int [][]adjmatrix,int currentvertex,boolean[]visited){
        visited[currentvertex]=true;
        System.out.print(currentvertex+" ");
        for(int i=0;i< adjmatrix.length;i++){
            if(adjmatrix[currentvertex][i]==1&&visited[i]==false){
                //i is a neighbor of currentVertex
                dftraversalhepler(adjmatrix,i,visited);
            }
        }
    }
    public static void dftraversal(int [][]adjmatrix){
        boolean visited[]=new boolean[adjmatrix.length];
    dftraversalhepler(adjmatrix,0,visited);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of vertices");
        int n=sc.nextInt();
        System.out.println("enter the no of edges");
        int e=sc.nextInt();
        int AdjMatrix[][]=new int [n][n];
        for(int i=0;i<e;i++){
            System.out.println("enter the "+(i+1)+ "edge");
            int v1= sc.nextInt();
            int v2=sc.nextInt();
            AdjMatrix[v1][v2]=1;
            AdjMatrix[v2][v1]=1;
        }
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                System.out.print(AdjMatrix[i][j]+" ");
//            }
//            System.out.println();
//        }
        dftraversal(AdjMatrix);
    }
}
