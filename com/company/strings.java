package com.company;
import java.sql.SQLOutput;
import java.util.*;
public class strings {
    public static void main(String arge[]){
        // Scanner sc= new Scanner (System.in);
       /** String name = sc.nextLine ();
        System.out.println(name);**/
       //concatenation
       /***String firstname= "Jack";
       String secondname="and Jill";
       String fullname=firstname+" "+secondname;
        System.out.println(fullname);
        //length
        System.out.println(fullname.length());
        //print separate characters of the string
        for (int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i))
        }***/
       //campare (camparision)
      /***  Scanner sc= new Scanner(System.in);
        String one= sc.nextLine();
        String two= sc.nextLine();

            if (one.compareTo(two) == 0) {
                System.out.println("String are equal");
            }
            else if (one.compareTo(two) > 0) {
            System.out.println("String1 is greater than string 2");
            }
            else{
            System.out.println("String 1 is less than string 2");
        }
            //substring
        String newname= one.substring(0,6);
        System.out.println(newname);***/
      /***String srr="1234";
      int numbers=Integer.parseInt(srr);
        System.out.println(numbers);

        int num=12345;
        String str= Integer.toString(num);
        System.out.println(str);
        System.out.println(str.length());***/
     //print the total length of the strings in an array
    /*** Scanner sc= new Scanner (System.in);
      int size= sc.nextInt();
      String names[]= new String[size];
      int totallength=0;
      sc.nextLine();
      for(int i=0; i<size;i++){
          names[i]=sc.nextLine();
          totallength+=names[i].length();
      }
        System.out.println(totallength);***/
    //change the letter e by i
    /*** Scanner sc= new Scanner(System.in);
     String original= sc.nextLine();
     String result= "";

     for(int i=0;i<original.length();i++){
         if(original.charAt(i)=='e'){
             result+='i';
         }else{
             result += original.charAt(i);
         }
     }
        System.out.println(result);***/
    //to print the username from the emailid
    Scanner sc= new Scanner (System.in);
    System.out.println("Enter your email address");
    String email=sc.nextLine();
    String username="";

    for(int i=0;i<email.length();i++){
        if(email.charAt(i)=='@'){
            break;
        }else{
            username+=email.charAt(i);
        }
    }
        System.out.println("Your username is:"+" "+username);

    }
}
