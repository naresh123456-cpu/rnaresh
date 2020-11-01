package Friday;
class Bmw{
	void cost() {
		System.out.println("50lakhs");
		System.out.println("15km");
		
	}
}
class Maruti extends Bmw{
	void mileage() {
		System.out.println("40lakhs");
		System.out.println("10km");
		
	}
}

public class UpCasting {
	public static void main(String args []) {
		
	
	Maruti m=new Maruti();
	m.cost();
	m=new Maruti();
	m.mileage();
	
	}
}
