package com.company;

public class sortings {
   /*** public static void printArray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={7,8,3,1,2};
        //time complexity =O(n^2)
        //bubble sort
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
        printArray(arr);***/
        public static void printarray(int arr[]){
          for (int i=0;i<arr.length;i++){
              System.out.print(arr[i]+" ");
          }
        }
       /*** public static void main(String args[]){
            int arr[]={7,8,3,1,2};
        //Selection sort

        for (int i=0;i<arr.length-1;i++){
            int smallest=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[smallest]>arr[j]){
                    int temp= arr[smallest];
                    arr[smallest]=arr[j];
                    arr[j]=temp;


                }
            }
        }
        printarray(arr);***/
       //insertion sort
      public static void main(String args[]){
          int arr[]={7,8,3,1,2};
          for (int i=1;i<arr.length;i++){
              int current =arr[i];
              int j= i-1;
              while(j>=0&&arr[j]>current){
                  //keep swapping
                  arr[j+1]=arr[j];
                  j--;
              }
              arr[j+1]=current;
          }

        printarray(arr);
    }
}
