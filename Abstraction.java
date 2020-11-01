package Friday;
abstract class Motors{
	abstract void cost();
	abstract void mileage();
	abstract void speed();
	void start() {
		System.out.println("start with a self motor");
	}
}
 abstract class Pulsar extends Motors{
	void cost() {
		System.out.println("pulser cost is 1lakh");
	}
}
 abstract class Yamaha extends Pulsar{
	 
	void mileage() {
		System.out.println("yamaha mileage is 60km");
	}
}
 class Duke extends Yamaha{
	void speed() {
		System.out.println(" bajaj speed is 100");
	}
	
}
	

public class Abstraction {

	public static void main(String[] args) {
		Duke d=new Duke();
		d.start();
		d.cost();
		d.mileage();
		d.speed();
	}
}
