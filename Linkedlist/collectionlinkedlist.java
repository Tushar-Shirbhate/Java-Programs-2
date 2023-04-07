package Linkedlist;

import java.util.LinkedList;

public class collectionlinkedlist {
    public static void  main (String arga[]){
        LinkedList<Integer>list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1 ,40);
        list.addFirst(100);
        list.addLast(200);
        list.set(0,110);
        list.remove(3);
        System.out.println(list.size());
        System.out.println(list.get(2));
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

    }
}
