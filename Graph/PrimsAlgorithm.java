package Graph;
import java.util.Scanner;
public class PrimsAlgorithm {
    public static  int findminvertex(boolean[]visited,int []weight){
    int minVertex=-1;
    for(int i=0;i< visited.length;i++){
      if(!visited[i]&&(minVertex==-1||weight[i]<weight[minVertex])){
          minVertex=i;
      }
    }
    return minVertex;
    }
    public  static void prims(int [][]adjmatrix){
        int n= adjmatrix.length;
        boolean[]visited=new boolean[n];
        int parent[]=new int[n];
        int weight[]=new int[n];
        //source vertex 0
        parent[0]=-1;
        weight[0]=0;
        for(int i=1;i<n;i++){
         weight[i]=Integer.MAX_VALUE;
        }
        for(int i=0;i<n;i++){
            int minvertex=findminvertex(visited,weight);
            visited[minvertex]=true;
            for(int j=0;j<n;j++){
                if(adjmatrix[minvertex][j]!=0&&!visited[j]){
                    if(weight[j]>adjmatrix[minvertex][j]) {
                        //update values
                        weight[j] = adjmatrix[minvertex][j];
                        parent[j] = minvertex;
                    }
                }
            }
        }
    //print mst
     for(int i=0;i<n;i++){
        if(i<parent[i]){
            System.out.println(i+" "+parent[i]+" "+weight[i]);
        }else{
            System.out.println(parent[i]+" "+i+" "+weight[i]);
        }
     }

    }
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int e=sc.nextInt();
    int adjmatrix[][]=new int[n][n];
    for(int i=0;i<e;i++){
        int v1=sc.nextInt();
        int v2=sc.nextInt();
        int weight= sc.nextInt();
        adjmatrix[v1][v2]=weight;
        adjmatrix[v2][v1]=weight;
    }
    prims(adjmatrix);
}
}
