package Friday;

import java.util.Scanner;

class Student{
	int id;
	String name;
	int number;
	 Scanner sc=new Scanner(System.in);
	 void data(){
		 System.out.println("enter the  student id");
		 id=sc.nextInt();
		 System.out.println("enter the  student name ");
		 name=sc.next();
		 System.out.println("enter the student number");
		 number=sc.nextInt();
		  }
	 }
class Employee extends Student{
	int id;
	String name;
	int number;
	 Scanner sc=new Scanner(System.in);
	 void emp() {
		 System.out.println("enter employee id");
		 id=sc.nextInt();
		 System.out.println("enter the employee name");
		 name=sc.next();
		 System.out.println("enter the  employee number");
		 number=sc.nextInt();
	 }
	 
	
}
class Teacher extends Employee{
	int id;
	String name;
	int sal;
	 Scanner sc=new Scanner(System.in);
	 
	void teach() {
		
		System.out.println("enter the teacher id");
		id=sc.nextInt();
		System.out.println("enter the teacher name");
		name=sc.next();
		System.out.println("enter the teacher sal");
		sal=sc.nextInt();
		}
	}
public class MultiLevel {
	public static void main(String args[]) {
		
		Teacher t=new Teacher();
		t.data();
		t.emp();
		t.teach();
	}

}
