package com.company;
import java.util.*;
public class lec4hw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n= sc.nextInt();
        /***for (int i =0;i<=n;i++){
         if (i%2==0){
         System.out.println(i);
         }
         } ***/
        //int n = sc.nextInt();
        /***if (n == 1) {
         int marks = sc.nextInt();
         if (marks >= 90) {
         System.out.println("This is Good");
         } else if (marks >= 60) {
         System.out.println("This is also Good");
         } else {
         System.out.println("This is also Good");
         }
         } else {
         System.out.println("invalid");
         }***/
        int input;
        do {
            int marks = sc.nextInt();
            if (marks >= 90 && marks <= 100) {
                System.out.println("This is good");
            } else if (marks <= 89 && marks >= 60) {
                System.out.println("This is also good");
            } else if (marks <= 59 && marks >= 0) {
                System.out.println("This is Good as well");
            } else {
                System.out.println("Invalid");
            }

            System.out.println("want to continue?(yes(1)or No(0)");
            input = sc.nextInt();
        }while (input==1);
        //int num = sc.nextInt();

        /***boolean isPrime = true;
        for(int i =2; i<=num/2 ; i++){
            if(num % i == 0) {
                isPrime= false;
                break;
            }
        }
        if (isPrime){
            if (num == 1) {
                System.out.println("This number is nither prime nor composite");
            }else{
                System.out.println("This is a prime number");
            }
        }else{
            System.out.println("This is not a prime number");
        }***/
    }

}
