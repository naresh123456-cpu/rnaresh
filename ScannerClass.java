package Friday;

import java.util.Scanner;

class Square{
	
	int a;
	 Scanner sc=new Scanner(System.in);
	 void sqr() {
		System.out.println("enter the value for a");
		a=sc.nextInt();
		int c=a*a;
		System.out.println("value for a square is ="+c);
		 
		
	}
}
class Sum extends Square {
	
		int b;
		 Scanner sc=new Scanner(System.in);
		 void add() {
			 System.out.println(" enter the value for b");
			 b=sc.nextInt();
		     int d=a+b;
		     System.out.println("value for d is="+d);
	}
}

 class ScannerClass {
	public static void main(String []args)
	{
		 Sum s=new Sum();
		 s.sqr();
		 s.add();
		
	}

}

