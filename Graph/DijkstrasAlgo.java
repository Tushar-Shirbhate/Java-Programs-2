package Graph;

import java.util.Scanner;

public class DijkstrasAlgo {
    public static int findminimum(int []distance,boolean[]visited){
        int minVertex=-1;
        for(int i=0;i<visited.length;i++){
        if(!visited[i]&&(minVertex==-1||distance[i]<distance[minVertex])){
           minVertex=i;
        }
        }
        return minVertex;
    }
    public static void dijkstra(int adjmatrix[][]){
     int n= adjmatrix.length;
     boolean visited[]=new boolean[n];
     int distance[]=new int[n];
     distance[0]=0;
     for(int i=1;i<n;i++){
         distance[i]=Integer.MAX_VALUE;
     }
     for(int i=0;i<n-1;i++){
         int minvertex=findminimum(distance,visited);
           visited[minvertex]=true;
            for(int j=0;j<n;j++){
              if(adjmatrix[minvertex][j]>0&&!visited[j]&&adjmatrix[minvertex][j]<Integer.MAX_VALUE){
               //j is unvisited neighbour of minvertex
                  //Calculate distance to reach j from source
                  int newDistance=distance[minvertex]+adjmatrix[minvertex][j];
                  if(newDistance<distance[j]){
                    distance[j]=newDistance;
                  }
              }
            }
         }
     for(int i=0;i<n;i++){
         System.out.println( i +" "+distance[i]);
     }

    }
    public static  void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int e=sc.nextInt();
      int [][]adjmatrix=new int[n][n];
      for(int i=0;i<e;i++){
          int v1=sc.nextInt();
          int v2=sc.nextInt();
          int weight=sc.nextInt();
          adjmatrix[v1][v2]=weight;
          adjmatrix[v2][v1]=weight;
      }
      dijkstra(adjmatrix);
    }
}
