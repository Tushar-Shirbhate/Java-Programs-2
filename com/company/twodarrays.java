package com.company;
import java.util.*;
public class twodarrays {
    public static void main(String []args){
     // Scanner sc= new Scanner (System.in);
     /***   int rows= sc.nextInt();
        int columns=sc.nextInt();
        int [][] matrix=new int[rows][columns];

        for (int i = 0;i<rows;i++){
            for(int j = 0;j<columns;j++){
                  matrix[i][j]=sc.nextInt();

            }
        }
        for(int i=0;i<rows;i++){
            for(int j = 0;j<columns;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }***/
     //Scanner sc= new Scanner (System.in);
     /***int rows= sc.nextInt();
     int columns= sc.nextInt();
     int[][]matrix=new int[rows][columns];

     for (int i=0;i<rows;i++){
         for(int j = 0;j<columns;j++){
             matrix[i][j]=sc.nextInt();
         }
     }
     System.out.println("Enter the number of which you want to find the position");
     int x= sc.nextInt();
     for(int i=0;i<rows;i++){
         for(int j=0;j<columns;j++){
             if (matrix[i][j]==x){
                 System.out.println("The x is at the position:"+ i+","+j);
             }
         }
     }***/
     //Scanner sc= new Scanner (System.in);
     /***int n= sc.nextInt();
     int m= sc.nextInt();


     int [][] matrix= new int[n][m];

     for (int i=0;i<n;i++){
         for (int j =0;j<m;j++){
             matrix[i][j]=sc.nextInt();
         }
     }
     System.out.println("The spiral order matrix is:");
     int rowstart=0;
     int rowend= n-1;
     int columnstart=0;
     int columnend= m-1;

     while(rowstart<=rowend&&columnstart<=columnend){
         for(int col=columnstart;col<=columnend;col++){
             System.out.print(matrix[rowstart][col]+" ");
         }
         rowstart++;

         for(int row=rowstart;row<=rowend;row++){
             System.out.print(matrix[row][columnend]+" ");
         }
         columnend --;
         for(int col=columnend;col>=columnstart;col--){
             System.out.print(matrix[rowend][col]+" ");

         }
         rowend--;
         for(int row= rowend;row>=rowstart;row--){
             System.out.print(matrix[row][columnstart]+" ");
         }
         columnstart ++;
         System.out.println();
     }***/
     Scanner sc= new Scanner (System.in);
     int n=sc.nextInt();
     int m=sc.nextInt();

     int matrix[][]= new int[n][m];

     for(int i = 0; i<n;i++){
         for (int j=0;j<m;j++){
             matrix[i][j]=sc.nextInt();
         }
     }
     System.out.println("The given matrix is:");
     for(int i=0;i<n;i++){
         for(int j=0;j<m;j++){
             System.out.print(matrix[i][j]+" ");
         }
         System.out.println();
     }

     System.out.println("The transpose of the given matrix is:");
     for(int i=0;i<m;i++){
         for(int j=0;j<n;j++){
             System.out.print(matrix[j][i]+" ");
         }
         System.out.println();
     }

    }
}
