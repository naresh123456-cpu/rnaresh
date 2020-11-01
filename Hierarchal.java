package Friday;



class Car {
	void start() {
		System.out.println(" both cars starts with a key");
		int wheels=4;
		System.out.println("wheels="+wheels);
		int seats=6;
		System.out.println("wheels="+seats);
	}
	
}
class Audi extends Car{
	void car() {
		System.out.println("=======audi car========");
		int cost=500000;
		System.out.println("cost="+cost);
		String comfort="luxury";
		System.out.println("comfort="+comfort);
	}
}
class Ferrari extends Car{
	void cost() {
		System.out.println("===========ferrari car=======");
		int price=600000;
		System.out.println("price="+price);
		int capacity=6;
		System.out.println("capacity="+capacity);
	}
}
public class Hierarchal {

	public static void main(String[] args) {
		Audi a=new Audi();
		a.start();
		a.car();
		Ferrari f=new Ferrari();
		f.cost();

	}

}
