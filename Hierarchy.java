package Friday;

import java.util.Scanner;

class Mobile{

		int RAM=4;
		int ROM=16;
		int battery=15500;
	
}
class Redmi extends Mobile{
	int cost;
	int warranty;
	String proccessor;
	Scanner sc=new Scanner(System.in);
	void redmi() {
		System.out.println("==========redmi=========");
		System.out.println("enter the mobile cost");
		cost=sc.nextInt();
		System.out.println("enter the warranty in years");
		warranty=sc.nextInt();
		System.out.println("enter the proccessor name");
		proccessor=sc.next();
		}
	 
}
class Vivo extends Mobile{
	int cost;
	int warranty;
	String proccessor;
	Scanner sc=new Scanner(System.in);
	void vivo() {
	System.out.println("==========vivo=============");
		System.out.println("enter the  mobile cost");
		cost=sc.nextInt();
		System.out.println("enter the warranty in years");
		warranty=sc.nextInt();
		System.out.println("enter the proccessor name");
		proccessor=sc.next();
		}
}

public class Hierarchy {

	public static void main(String[] args) {
		Redmi mi=new Redmi();
		System.out.println("RAM="+mi.RAM);
		System.out.println("ROM="+mi.ROM);
		System.out.println("battery="+mi.battery);
		mi.redmi();
		Vivo v=new Vivo();
		v.vivo();
	
		}

}
