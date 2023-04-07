package Graph;
import java.util.Arrays;
import java.util.Scanner;

class Edge implements Comparable<Edge>{
  int v1;
  int v2;
  int weight;
  public Edge(int v1,int v2,int weight){
      this.v1=v1;
      this.v2=v2;
      this.weight=weight;
  }

    @Override
    public int compareTo(Edge o) {
        return this.weight-o.weight;
    }
}
public class kruskalsAlgo {
    public static int findParent(int v,int parent[]){
       if(v==parent[v]){
           return v;
       }
       return findParent(parent[v],parent);
    }
    public static  Edge[] krushalAlgorithm(Edge[]edges,int n){
        Arrays.sort(edges);
        Edge mst[]=new Edge[n-1];
        int parent[]=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
        int count=0;int i=0;
        while (count!=n-1){
            Edge currentedge=edges[i++];
            int v1parent=findParent(currentedge.v1,parent);
            int v2parent=findParent(currentedge.v2,parent);
            if(v1parent!=v2parent){
                //including currentEdge
                mst[count]=currentedge;
                count++;
                parent[v1parent]=v2parent;
            }
        }
        return mst;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int e=sc.nextInt();
        Edge[]edges=new Edge[e];
        for (int i=0;i<e;i++) {
            int v1=sc.nextInt();
            int v2=sc.nextInt();
            int weight=sc.nextInt();
          Edge edge=new Edge(v1,v2,weight);
          edges[i]=edge;
        }
        Edge mst[]=krushalAlgorithm(edges,n);
        for(int i=0;i< mst.length;i++){
          if(mst[i].v1<mst[i].v2){
              System.out.println(mst[i].v1 +" " +mst[i].v2+" "+mst[i].weight);
          }else{
              System.out.println(mst[i].v2 +" "+ mst[i].v1+" "+mst[i].weight);
          }
        }
    }
}
