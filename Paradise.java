
 class Restaurant {
	void takeOrder(String order)
	{
		
		System.out.println("given order is=" +order);
	}
	void takeOrder(String order1,String order2) {
		System.out.println("given order is=" +order1+ "order2=" +order2);
	}
	void takeOrder(String order1,String order2,String order3) {
		System.out.println("given order is=" +order1+ "order2=" +order2 +"order3=" +order3);
	}

}
class Paradise{
	public static void main (String []args) {
	
	Restaurant hotel=new Restaurant();
	hotel.takeOrder("dosa");
	hotel.takeOrder("poori", "upma");
	hotel.takeOrder("poori", "upma","wada");
	
	}
}
