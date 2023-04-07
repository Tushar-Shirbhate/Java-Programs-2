package com.company;
import java.util.*;

class dynamicarray{
    private int data[];
    private int nextelementindex;
    public  dynamicarray (){
      data=new int[5];
      nextelementindex=0;
    }
    public int size(){
        return nextelementindex;
    }
    public boolean isEmpty(){
        return nextelementindex==0;
    }
    public int get(int i){
        if (i>=nextelementindex){
            //throw error
            return -1;
        }
        return data[i];
    }

    public void set(int i,int value){
        if (i>=nextelementindex){
            //throw error
            return ;
        }
         data[i]=value;
    }
    public void add(int value){
     if (nextelementindex==data.length){
         doublecapacity();
     }
     data[nextelementindex]=value;
     nextelementindex++;
    }
    public void doublecapacity(){
        int temp[]=data;
        data=new int[2*temp.length];
        for (int i=0;i<temp.length;i++){
            data[i]=temp[i];
        }
    }
    public int removeLast(){
        if (nextelementindex==0){
            return -1;
        }
        int temp=data[nextelementindex - 1];
        data[nextelementindex-1]=0;
        nextelementindex--;
        return temp;
    }


}

public class dynamicarrayclass {
    public static void main(String args[]){
    dynamicarray d=new dynamicarray();

    for(int i=1;i<100;i++){
        d.add(100+i);
    }
        System.out.println(d.size());
        System.out.println(d.get(98));
        d.set(3,170);
        System.out.println(d.get(3));

        while(!d.isEmpty()){
            System.out.println(d.removeLast());
            System.out.println("size - "+d.size());
        }
    }
}
