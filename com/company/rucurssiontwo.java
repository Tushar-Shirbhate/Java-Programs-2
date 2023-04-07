package com.company;
import java.util.*;

public class rucurssiontwo {
    //replace a by b in a string
    public static String replacechar(String s,char a,char b){
        if (s.length()==0){
            return s;
        }
        String smalloutput = replacechar(s.substring(1),a,b);
        if (s.charAt(0)==a){
            return b+smalloutput;
        }else{
            return s.charAt(0)+smalloutput;
        }
    }

   //remove x from the string
    public static String removeX(String input){
        //char a='x';
        if (input.length()==0){
            return input;
        }
        String smalloutput=removeX(input.substring(1));
        if (input.charAt(0)=='x'){

            return smalloutput;
        }else{
            return input.charAt(0)+smalloutput;
        }

        //return solve( input, '0');
    }
    /*public static String solve(String input,char x){
        if (input.length()==0){
            return input;
        }
        String smalloutput=solve(input.substring(1),x);
        if (input.charAt(0)==x){

            return smalloutput;
        }else{
            return input.charAt(0)+smalloutput;
        }
    }*/

    //remove pi and replace it by 3.14

    public static String removepi(String si){
       if (si.length()<=1){
           return si;
       }
       if (si.charAt(0)=='p'&&si.charAt(1)=='i'){
           String smalloutput=removepi(si.substring(2));
           return "3.14"+smalloutput;
       }else{
           String smalloutput=removepi(si.substring(1));
           return si.charAt(0)+smalloutput;
       }
    }

    //using binary search ...find the index in sorted array
    public static int binarysearch(int a[],int si,int ei,int x){
        if (si>ei){
            return -1;
        }
        int midindex=(si+ei)/2;
        if (a[midindex]==x){
            return midindex;
        }else if(a[midindex]<x){
            return binarysearch(a,midindex+1,ei,x);
        }else {
            return binarysearch(a,si,midindex-1,x);
        }
    }
    //merge sort
    public static  void mergeSort(int input[]) {
        if (input.length<=1) {
            return ;
        }
        //int mid = (si + ei) / 2;
        int s1[] = new int[input.length / 2];
        int s2[] = new int[input.length - s1.length];
        for (int i = 0; i < input.length/2; i++) {
            s1[i] = input[i];
        }
        for (int i = input.length/2; i < input.length; i++) {
            s2[i-input.length/2] = input[i];
        }
        //int smalloutput1 = meargesort(s1, si, mid);
        //int smalloutput2 = meargesort(s2, mid + 1, ei);
       // return merge(arr,s1,s2,0);
        mergeSort(s1);
        mergeSort(s2);
        merge(s1,s2,input);


    }
    public static void merge(int s1[],int s2[],int finalarr[]) {
       int i=0;
        int j=0;
        int k=0;


    while ( i<s1.length && j<s2.length) {

        if (s1[i] < s2[j]) {
            finalarr[k] = s1[i];
            i++;
            k++;
        } else {
            finalarr[k] = s2[j];
            j++;
            k++;
        }
    }
        if (i<s1.length){
            while (i<s1.length){
                finalarr[k]=s1[i];
                i++;
                k++;
            }
        }
        if (j<s2.length){
            while (j<s2.length){
                finalarr[k]=s2[j];
                j++;
                k++;
            }
        }
    }





    public static void main (String args []){
//        System.out.println(replacechar("abcxysbxuxuwx",'x','y'));
//
//       System.out.println(removeX("axrxexsdx"));
//       Scanner sc= new Scanner (System.in);
//       String input= sc.next();
//        char a='x';
//        System.out.println(removeX(input));
//
       System.out.println(removepi("pispipigfhpipip"));
//
//       int a[]={1,2,5,5};
//       System.out.println(binarysearch(a,0,a.length-1,100));


        //length of main arr
        //input arr
        int input[]={1,4,6,2,4,9,7,8,5};
         mergeSort(input);
        for (int p=0;p<input.length;p++) {
              System.out.print(input[p]);
            }
    }

}
