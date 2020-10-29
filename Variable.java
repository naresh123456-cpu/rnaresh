package Motivity;

import java.util.Scanner;

class Student{
	  int id;
	  float percentage;
	  static String clg;
	}
	 class Employee{
	   int employee_id;
	   int salary;
	   static String company_name;
	}
	class Variable{
	 public static void main(String args[])
	{
	  Student naresh=new Student();
	  Scanner sc=new Scanner(System.in);
	  System.out.println("entering the student details");
	   naresh.id=sc.nextInt();
	   naresh.percentage=sc.nextFloat();
	   Student.clg= sc.next();
	   System.out.println("==============student details==============");
	   System.out.println("student id="+naresh.id);
	   System.out.println("percentage="+naresh.percentage);
	   System.out.println("college="+Student.clg);


	   Employee ramesh=new Employee();
	   Scanner sc1=new Scanner(System.in);
		  System.out.println("entering the employee details");
	   ramesh.employee_id=sc1.nextInt();
	   ramesh.salary=sc1.nextInt();
	   Employee.company_name=sc1.next();
	   System.out.println("===========employee details===============");
	   System.out.println(ramesh.employee_id);
	   System.out.println(ramesh.salary);
	   System.out.println(Employee.company_name);
	}
	}


