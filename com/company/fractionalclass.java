package com.company;
import java.util.*;
//class
class Fraction1{
    private int numerator;
    private int denominator;

//    public int getNumerator(
//        return numerator;
//    }

// constructor
    public Fraction1(int numerator ,int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
        simplify();
    }

    private void simplify(){
        int gcd=1;
        int smaller =Math.min(numerator,denominator);
        for(int i=2;i<=smaller;i++){
            if (numerator%i==0&&denominator%i==0){
                gcd=i;
            }
        }
        numerator=numerator/gcd;
        denominator=denominator/gcd;
    }
    public void increament(){
       numerator=numerator+denominator;
       simplify();
    }

    public void print(){
        System.out.println(numerator+"/"+denominator);
    }
}
//main class
public class fractionalclass{
    public static void main(String args[]){
        Fraction1 f1= new Fraction1(4,6);
        f1.print();
        f1.increament();
        f1.print();



    }
}
