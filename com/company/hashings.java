package com.company;
import java.util.*;
public class hashings {
    /***public static int countdistinct(int arr[]){
        HashSet<Integer>set=new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        return set.size();
    }
    public static void main(String[] args) {
        //count the distinct elements

      int arr[]  = {6,10,5,4,9,120,4,6,10};

        System.out.println( countdistinct(arr));
     }***/
    public static void Subarraysum(int arr[], int sum){
        int currsum= 0;
        int start=0;
        int end=-1;
        HashMap<Integer,Integer>map= new HashMap<>();
        for (int i=0;i<arr.length;i++){
            currsum += arr[i];
            if (currsum-sum==0){
                start=0;
                end=i;
                break;
            }
            if (map.containsKey(currsum-sum) ){
                start=map.get(currsum-sum)+1;
                end= i;
                break;
            }
            map.put(currsum,i);
        }
        if(end==-1){
            System.out.println("Not found");
        }else{
            System.out.println("start:"+start+" "+"End:"+end);
        }
        return;
    }
    public static void main(String args[]){
        //find the subarray with the given sum
        int arr[]= {10,15,-5,15,-10,5};
        int sum = 5;
        Subarraysum(arr,sum);

    }
}
