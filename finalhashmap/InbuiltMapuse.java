package finalhashmap;
import java.util.HashMap;
import java.util.Set;

public class InbuiltMapuse {
    public static void main(String arge[]){
        HashMap<String,Integer> map=new HashMap<>();
        //insert
        map.put("abc",1);
        map.put("def",1);
        //size
        map.put("abc",4);
        System.out.println(map.size());
        //presence
        if(map.containsKey("abc")){
            System.out.println("map has abc");
        }
        if(map.containsKey("abc1")){
            System.out.println("map has abc1");
        }
        //get value
        int v=map.get("abc");
        System.out.println(v);
        //for key which is not present in the map to avoid the null point exception add the conditon of contains
        int v1=0;
        if(map.containsKey("abc1")){
            v1=map.get("abc1");
        }
        System.out.println(v1);
        //remove
//        map.remove("abc");
//        if(map.containsKey("abc")){
//            System.out.println("map has key");
//        }
        //iterate

        Set<String>keys=map.keySet();
        //this will return the keys
        for(String s:keys){
            System.out.println(s);
        }
        //this will return the values at given keys
        for(String s:keys){
            System.out.println(map.get(s));
        }
    }
}
