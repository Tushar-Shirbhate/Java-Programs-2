package com.company;

import java.util.Scanner;

public class Recussion3 {
    //return the subsequences
    public static String[] subsequences(String word){
        if(word.length()==0){
            String output[]=new String[1];
            output[0]="";
            return output;
        }
        String smalloutput[]=subsequences(word.substring(1));
        String output[]=new String[smalloutput.length*2];
        for(int i=0;i<smalloutput.length;i++){
            output[i]=smalloutput[i];
        }
        for(int i=0;i< smalloutput.length;i++){
          output[smalloutput.length+i]= word.charAt(0)+smalloutput[i] ;

        }
        return output;
    }
    //print subsequences in better way
    public static void printsubsequences(String input,String ans){
       if(input.length()==0){
           System.out.println(ans);
           return;
       }
       String smalloutput=input.substring(1);
       printsubsequences(smalloutput,ans);
       printsubsequences(smalloutput,ans+input.charAt(0));


    }

    //print factorial
    public static void factorial(int n,int ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        ans=ans*n;
        factorial(n-1,ans);
    }
    //print minimum of the array
    public static void printminimum(int input[],int startindex,int minsofar){
        if(startindex==input.length){
            System.out.println(minsofar);
            return;
        }
        int newmin=minsofar;
        if(input[startindex]<newmin){
         newmin=input[startindex];
        }
        printminimum(input,startindex+1,newmin);

    }



    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
//        String word=sc.next();
//        String []ans=subsequences(word);
//        for(int i=0;i<ans.length;i++){
//            System.out.println(ans[i]);
//        }
//        int input= sc.nextInt();
//        factorial(input,1);
//        int in[]={4,5,6,1,4,7};
//        printminimum(in,0,Integer.MAX_VALUE);
        System.out.println("Enter the String");
        String input= sc.next();
        printsubsequences(input," ");


    }
}
