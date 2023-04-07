package com.company;
import java.sql.SQLOutput;
import java.util.*;
public class tenqueshw {
   // public static int printAverage(int a, int b,int c){
    /***    int avg=  (a+b+c)/3;

        return avg;

    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg= printAverage(a,b,c);
        System.out.println(avg);
    }***/
    //public static void printsumOdd(int n){
    /***    int add = 0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
             add=add+i;

            }
        }
        System.out.println(add);
    }
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
        int n= sc.nextInt();
        printsumOdd(n);
    }***/
    //public static void printgreatest(int a, int b){
    /***    if (a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
        return;
    }
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        printgreatest(a,b);
    }***/
    //public static float printCircumference(float rad) {
    /***float circumferance = 2*(3.14f)*rad;
        return circumferance;
    }
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        float rad = sc.nextFloat();
        System.out.println("The circumference of the given circle is"+printCircumference(rad));
    }***/
    //public static boolean printeligibility(int age){
    /***  if (age>18){
          return true;
      }else{
          return false;
      }

    }

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(printeligibility(age));
    }***/
    //public static void main(String args[]){
    /***do{

        }while(true);
    }***/
    //public static void main(String args[]) {
    /***    int positive = 0;
        int negative = 0;
        int zero = 0;
        System.out.println("Enter 1 to continue and 0 to stop");
        Scanner sc= new Scanner (System.in);
        int input= sc.nextInt();
        while (input == 1) {
            System.out.println("Enter a number");
            int number=sc.nextInt();
            if (number>0){
                positive++;
            }else if (number<0) {
                negative++;
            }else{
                zero++;
                }
            System.out.println("Press 1 to continue 0 to stop");
             input=sc.nextInt();

            }
        System.out.println("Positives"+positive);
        System.out.println("Negatives"+negative);
        System.out.println("Zeros"+zero);
    }***/
    //public static double greatestCD(int a,int b){
    /***    int c=1;

        for(int i =1;i<=a&&i<=b;i++){
            if(a%i==0&&b%i==0) {
             c=i;
            }
        }
        return c;
    }
    public static void main(String [] args){
        Scanner sc= new Scanner (System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("The gratest common divisor is"+greatestCD(a,b));
       /***while(a != b) {
            if(a>b) {
                a = a - b;
            } else {
                b = b- a;
            }
        }
        System.out.println("GCD is : "+ b)
   } ***/
    public static void printFS(int n){
        int a=0; int b=1;
        System.out.print(a+" ");
        if (n>1){
            for(int i=2;i<=n;i++){
                System.out.print(b+" ");
                int temp=b;
                b=a+b;
                a=temp;
            }
        }
        return ;
    }
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
        int n= sc.nextInt();
        //System.out.println("The fibonacci series:"+printFS(n));
       printFS(n);
    }
//   public static int printPower(int x,int n){
//       int result=1;
//       for (int i=1;i<=n;i++){
//           result=result*x;
//       }
//       return result;
//   }
//   public static void main(String[]args){
//       System.out.println("Enter the value of x");
//       Scanner sc= new Scanner (System.in);
//       int x= sc.nextInt();
//       System.out.println("Enter the value of n");
//       int n= sc.nextInt();
//       System.out.println("The power of the given number is:"+printPower(x,n));
//   }
}




