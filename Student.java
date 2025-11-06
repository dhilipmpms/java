
import java.io.*; 

import java.util.*;

public class Student{

String name;

String ph_no;

int m1,m2,m3,m4,m5,total;

float avg;

void Student1(){

inter();

out();

}

void inter(){

System.out.println("");

System.out.print("ENTER THE STUDENT NAME:");

Scanner A=new Scanner(System.in);

name=A.nextLine();

System.out.println("");

System.out.print("Enter The Student Mobile Number: ");

ph_no= A.nextLine();

System.out.println("");

System.out.print("Enter The Student Firts Mark:");

m1=A.nextInt();

System.out.println("");

System.out.print("Enter The Student Second Mark:");

m2=A.nextInt();

System.out.println("");

System.out.print("Enter The Student Third Mark:");

m3=A.nextInt();

System.out.println("");

System.out.print("Enter The Student Fourth Mark:");

m4=A.nextInt();

System.out.println("");

System.out.print("Enter The Studemt Fifth Mark:");

m5=A.nextInt();

}

void out(){

total=m1+m2+m3+m4+m5;

avg=total/5.0f;

System.out.println("");

System.out.println("----------------------------------------");

System.out.println("| STUDENT NAME: "+name+" ..");

System.out.println("| STUDENT MOBILE NUMBER: "+ph_no+" ..");

System.out.println("| STUDENT TOTAL MARK: "+total+" ..");

System.out.println("| STUDENT AVERAGE MARK: "+avg+" ..");

System.out.println("----------------------------------------");

}

public static void main(String[] arg){

Student s1=new Student();

s1.Student1();

}

}
