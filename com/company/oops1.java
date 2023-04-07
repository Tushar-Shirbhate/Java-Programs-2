package com.company;

/***class Student{
    String name;
    int roll_no;
}***/
class student {
  private String name;
  private int rollNo;
  private static int numstudent=0;
  public static int getNumstudent(){
      return numstudent;

  }


    public String getName() {
        return name;
    }
    public student(String n,int num  ){
     name=n;
     rollNo=num;
     numstudent++;

    }
    public student(String n){
     name=n;
     ++numstudent;
     rollNo=numstudent;
//     rollNo=10;
    }

  public void setName(String n) {
   name=n ;
  }

  public int getRollNo(){
   return rollNo;
  }
  public void setRollNo(int rollNo){
   if (rollNo<=0){
    return;
   }
   System.out.println("this"+this);
   this.rollNo=rollNo;
  }

 }
/***public class oops {
    public static void main(String args[]){
        Student s1= new Student();
        Student s2= new Student();
        s1.name="Tushar";
        s1.roll_no=04;
        s2.name="Chaitanya";
        s2.roll_no=19;
        System.out.println(s1.name+" " +s1.roll_no);
        System.out.println(s2.name+" " +s2.roll_no);
}***/
public class oops1 {
 public static void main(String args[]){

  student s1= new student("Tushar");
  student s2= new student("chaitanya");
     System.out.println(student.getNumstudent());
 // s1.name="Tushar";
  //s1.rollNo=04;
//  s1.setRollNo(100);
//  s1.setName("Tushar");
  System.out.println(s1.getName()+" " +s1.getRollNo());
//  System.out.println(s1.getNumstudent());

//  s2.setName("Chaitanya");
//  s2.setRollNo(19);
//  System.out.println("s2:"+s2);

  System.out.println(s2.getName()+" "+s2.getRollNo());
//     System.out.println(s2.getNumstudent());
  //s2.rollNo=19;
  //System.out.println(s2.name+" " +s2.rollNo);
 }

}
