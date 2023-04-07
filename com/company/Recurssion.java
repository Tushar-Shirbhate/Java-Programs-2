package com.company;

public class Recurssion {
    //Factorial program
    public static int fact(int n){
        if (n==0){
            return 1;
        }
        int smalloutput=fact(n-1);
        int output =n*smalloutput;
        return output;
    }
    //summision of upto n numbers
    public static int sum(int n){
        if (n==0){
            return 0;
        }
        int smalloutput=sum(n-1);
        int output= n+smalloutput;
        return output;
    }
    //power of numbers
    public static int power (int n,int m){
       if(m==0){
           return 1;
       }
       int smalloutput=power(n,m-1);
       int output=smalloutput*n;
       return output;
    }
    //cout the digits in given no
    public static int count(int n){
        if ( n==0){
            return 0;
        }
        int smalloutput=count(n/10);
        int output =1+smalloutput;
        return output;
    }
    //print 1 to n natural numbers
    public static void print1ton(int n){
        if (n==0){
            return;
        }
        print1ton(n-1);
        System.out.print(n+" ");
    }
    //print the fibonissi series

    public static int fibonacci(int n){
        if (n==0||n==1){
            return n;
        }
        int a=fibonacci(n-1);
        int b=fibonacci(n-2);
       // int output=a+b;
       // return output;
        return a+b;
    }
    //check the array is sorted or not
    public static boolean arrayissorted(int arr[]){
        if (arr.length==1){
            return true;
        }
        if (arr[0]>arr[1]){
            return false;
        }
        int smallarray[]=new int [arr.length-1];
        for(int i=1;i<arr.length;i++){
            smallarray[i-1]=arr[i];
        }
         boolean issmallarraysorted= arrayissorted(smallarray);
        return issmallarraysorted;

    }
    //sum of the given array
    public static int sumofarray(int arr2[],int n){
       // int n= arr2.length-1;
        if (n==0){
            return 0;
        }
        if(n==1){
            return arr2[n-1];
        }


        int smalloutput=  sumofarray(arr2,n-1);
        int output=smalloutput+arr2[n-1];
        return output;
    }
    //is array sorted by better method
    public static  boolean issortedbetter(int arr3[],int startind){
        if (startind==arr3.length-1){
            return true;
        }
        if (arr3[startind]>arr3[startind+1]){
            return false;
        }
       boolean  smalloutput= issortedbetter(arr3,startind+1);
        return smalloutput;

    }

    public static int sumOfDigits(int input){
        if (input==0){
            return 0;
        }
        int smalloutput = sumOfDigits(input / 10);
        int output = smalloutput+input % 10;
        return output;

    }



    public static void main(String []args){
        System.out.println("The factorial of the given no is: "+fact(6));

        System.out.println("The summition of the no/is:"+ sum(10));

        System.out.println(power(3,4));

        System.out.println(count(156));

        print1ton(5);



        System.out.println("The fibonacci number is:"+fibonacci(6)+" ");

        int arr[]={1,3,4,2,4,5,7,5,6};
        System.out.println("The given array is sorted:"+arrayissorted(arr));

        int arr2[]={4,5,6,7};
        int n=arr.length;
        System.out.println("The sum of the given array:"+sumofarray(arr2,arr2.length));

        int arr3[]={1,2,3,4,5};
        int n1=arr3.length;
        System.out.println("The array is sorted :"+issortedbetter(arr3,0));

        System.out.println(sumOfDigits(12345));


    }
}
