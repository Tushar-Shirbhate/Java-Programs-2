package com.company;

public class stringsbuilders {
    public static  void main(String[] args){
        StringBuilder sb= new StringBuilder ("Chaitanya" +
                "");
        System.out.println(sb);
        //to print perticular character
        System.out.println(sb.charAt(0));
        //set char at perticular index
        sb.setCharAt(0,'p');
        System.out.println(sb);
        //insert the character
        sb.insert(3,'s');
        System.out.println(sb);
        //deleting the part
        sb.delete(3,4);
        System.out.println(sb);
        //append the chracter(add the character or string at the end)
        sb.append("Pranjal");
        System.out.println(sb);
        //print the length of the string
        System.out.println(sb.length());
        //reverse the string using string builder class
        StringBuilder pp= new StringBuilder("Monster");
        for (int i=0;i<pp.length()/2;i++){
            int front=i;
            int back=pp.length()-1-i;
            char frontchar= pp.charAt(front);
            char backchar= pp.charAt(back);

            pp.setCharAt(front,backchar);
            pp.setCharAt(back,frontchar);
        }
        System.out.println(pp);







    }
}
