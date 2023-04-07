package finalhashmap;

import java.util.ArrayList;

public class Map <k,v>{
    ArrayList<MapNode<k,v>> buckets;
    int count;
    int numBuckets;
    public  Map(){
        buckets=new ArrayList<>();
        numBuckets=20;
        for (int i=0;i<numBuckets;i++){
            buckets.add(null);
        }
    }
    public int size(){
     return  count;
    }
    public v removekey(k key){
        int bucketindex=getbucketindex(key);
        MapNode<k,v>head=buckets.get(bucketindex);
        MapNode<k,v>prev=null;
        while (head!=null){
          if(head.key.equals(key)){
              if(prev!=null){
                  prev.next=head.next;
              }else{
                  buckets.set(bucketindex,head.next);
              }
              count--;
              return head.value;
          }
          prev=head;
          head=head.next;

        }
        return null;
    }
    public v getvalue(k key){
        int bucketindex=getbucketindex(key);
        MapNode<k,v>head=buckets.get(bucketindex);
        while (head!=null){
            if(head.key.equals(key)){
                return head.value;
            }
            head=head.next;
        }
        return null;
    }
    private void reHash(){
        ArrayList<MapNode<k,v>>temp=buckets;
        buckets=new ArrayList<>();
        for(int i=0;i<2*numBuckets;i++){
            buckets.add(null);
        }
        count=0;
        numBuckets=2*numBuckets;
        for(int i=0;i<temp.size();i++){
            MapNode<k,v>head=temp.get(i);
            while (head!=null){
                k key= head.key;
                v value= head.value;
                insert(key,value);
                head=head.next;
            }
        }
    }

    private  int getbucketindex(k key){
        int hc=key.hashCode();
        int index=hc%numBuckets;
        return index;
    }
    public void insert(k key,v value){
        int bucketindex=getbucketindex(key);
        MapNode<k,v>head=buckets.get(bucketindex);
        //if element is already present just update the value
        while(head!=null){
            if(head.key.equals(key)){
                head.value=value;
                return;
            }
            head=head.next;
        }
        //if element is not there insert it at the 0th index
        head=buckets.get(bucketindex);
        MapNode<k,v>newnode=new MapNode<>(key,value);
        newnode.next=head;
        buckets.add(bucketindex,newnode);
        count++;
        double loadfactor=(1.0*count)/numBuckets;
        if(loadfactor>0.7){
            reHash();
        }

    }



}
