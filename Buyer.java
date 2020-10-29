
class Shop{
	
	void laptops() {
		System.out.println(" 1.Dell 2.Hp 3.Lenovo 4.Acer 5.Toshiba ");
	}
	void selectedLap(String order) {
		System.out.println("selected laptop is "+order);
		
	}
	int cost() {
		return 50000;
	
	}
	String payAmount(int Amount) {
		System.out.println(" paying amount is "+Amount);
		return "paid";
	}
	String aboutLap() {
		return "looking good";
	}
	int rating() {
		return 5;
	}
	
}





public class Buyer {

	public static void main(String [] args) {
		Shop seller=new Shop();
		seller.laptops();
		seller.selectedLap("dell");
		System.out.println(seller.cost());
		System.out.println(seller.payAmount(50000));
		System.out.println(seller.aboutLap());
		System.out.println("rating for laptop is " +seller.rating());
	}
	}
