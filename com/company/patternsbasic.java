package com.company;

import javax.sound.midi.Soundbank;

public class patternsbasic {
    public static void main(String[]args){
       // for(int i=1;i<=4;i++){
           /*** for(int j=1;j<=5;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }***/
           //int m= 4;
           //int n= 5;
           //outer loop
        /***for(int i=1;i<=m;i++){
            for (int j=1;j<=n;j++){
                if(i==1||j==1||i==m||j==n) {
                    System.out.print('*');
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }***/
        //for (int i=1;i<=4;i++){
          /***  for (int j =1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }***/
          //for (int i=4;i>=1;i--){
           /***  for(int j=1;j<=i;j++) {
                 System.out.print("*"+' ');
             }
              System.out.println();
          }***/
          // for(int i=1 ;i<=4;i++){
          /***     for( int j = 1;j<=4-i;j++){
                   System.out.print(" ");
               } for( int j=1; j<=i;j++){
                   System.out.print("*");
               }
               System.out.println();
           }***/
          //for (int i =1 ; i<=5;i++){
          /***   for (int j = 1;j<=i;j++){
                  System.out.print(j+" ");
              }
              System.out.println();
          }***/
          //for (int i = 5;i>=1;i--){
           /***   for (int j =1;j<=i;j++){
                  System.out.print(j+" ");
              }
              System.out.println();
          }***/
         //  for (int i= 1;i<=5;i++){
           /***   for(int j =1;j<=5-i+1;j++){
                   System.out.print(j+" ");
               }
               System.out.println();
           }***/
           //int n=5;
           //int num = 1;
           /***for (int i=1;i<=n;i++) {
               for (int j = 1; j <= i; j++) {
                   System.out.print(num+" ");
                   num++;
               }
               System.out.println();
           }***/
           //int n= 5;
           /***for (int i = 1; i<=n;i++){
               for (int j =1;j<=i;j++){
                   int sum= i+j;
                   if (sum%2==0){
                       System.out.print("1"+" ");
                   }else{
                       System.out.print("0"+" ");
                   }
               }
               System.out.println();
           }***/
           //int n =5;
          /*** for (int i =1 ; i<=n;i++){
               for (int j = 1; j<=n-i;j++){
                   System.out.print(" ");
               }
               for(int j= 1;j<=5;j++ ){
                   System.out.print("*"+" ");
               }
               System.out.println();
           }***/
          //int n= 5;
          /***for(int i =1 ;i<=n;i++){
              for(int j=1;j<=n-i;j++){
                  System.out.print(" ");
              }
              for(int j =1;j<=i;j++){
                  System.out.print(i +" " );
              }
              System.out.println();
          }***/
         //int n=4;
         /***for (int i=1;i<=n;i++){
             for (int j=1;j<= i ; j++){
                 System.out.print("*");
             }
             int space= 2*(n-i);
             for(int j=1;j<=space; j++){
                 System.out.print(" ");
             }
             for (int j=1;j<=i;j++){
                 System.out.print("*");
             }
             System.out.println();
         }
        for (int i=4;i>=1;i--){
            for (int j=1;j<= i ; j++){
                System.out.print("*");
            }
            int space= 2*(n-i);
            for(int j=1;j<=space; j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }***/
        // int n=5;
         /***for (int i =1 ; i<=n;i++){
             for (int j=1;j<=n-i;j++){
                 System.out.print(" ");
             }
             for (int j=i ; j>=1;j--){
                 System.out.print(j);
             }
             for(int j =2 ;j<=i;j++){
                 System.out.print(j);
             }
             System.out.println();
         }***/
         //int n=4;
         /***for(int i =1 ; i<=n;i++){
             for (int j =1;j<=n-i;j++){
                 System.out.print("  ");
             }
             for (int j =1; j<=i;j++){
                 System.out.print("*"+" ");
             }
             for (int j=2 ;j<=i;j++){
                 System.out.print("*"+" ");
             }
             System.out.println();
         }
        for(int i =n ; i>=1;i--){
            for (int j =1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j =1; j<=i;j++){
                System.out.print("*"+" ");
            }
            for (int j=2 ;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }***/
         //int n=5;
         /***for(int i =1 ;i<=n;i++) {
             for (int j = 1; j <= i; j++) {

                 if (i == 1 || j == 1 || j == i) {
                     System.out.print("*");
                 } else {
                     System.out.print(" ");
                 }
             }
             int space = 2 * (n - i);
             for (int j = 1; j <= space; j++) {
                 System.out.print(" ");
             }
             for (int j = 1; j <= i; j++) {
                 if (i == 1 || j == 1 || j == i) {
                     System.out.print("*");
                 } else {
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }
        for(int i =5;i>=1;i--) {
            for (int j = 1; j <= i; j++) {

                if (i == 1 || j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i == 1 || j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }***/
         //int n=5;
         /***for(int i=1 ;i<=n;i++){
            for (int j = 1 ; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++){
                if (i==1 || j==1 ||i ==n || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
             System.out.println();
         }***/
        // int n=5;
        /*** for(int i =1 ;i<=n;i++){
             for (int j=1;j<=n-i;j++){
                 System.out.print(" ");
             }
             for(int j = 1 ;j<=i;j++){
                 System.out.print(j+" ");
             }
             System.out.println();
         }***/
        int n=4;
        for(int i =1;i<=n;i++){
            for (int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for (int j =4 ;j>=i;j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
