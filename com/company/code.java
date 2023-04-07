package com.company;
import java.util.*;
public class code {
    /***public static int printpower (int a,int b) {
        int ans=1;
        for (int i=1;i<=b;i++){
            ans=ans*a;
        }
        return ans;
    }
    public static void main( String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the value of base a");
        int a= sc.nextInt();
        System.out.println("Enter the value of power b");
        int b=sc.nextInt();
        System.out.println("The power of the given number is :"+printpower( a, b));***/
    public static void main(String args[]){
        double a=2,b=3;
       double ans= Math.pow(a,b);
        System.out.println(ans);
    }
}
