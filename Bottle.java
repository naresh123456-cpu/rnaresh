
 class Bottles {

	String brand;
	String colour;
	int price;
	int size;
	int weight;
	String looking;
	int capacity;
	int warranty;
	Bottles(){
		brand="bisleri";
		colour="yellow";
		price=500;
		size=20*10;
		weight=10;
		looking="good";
		capacity=2;
		warranty=2;
	}
	void display() {
		System.out.println("brand="+brand);
		System.out.println("colour="+colour);
		System.out.println("price="+price);
		System.out.println("bottle size is="+size);
		System.out.println("weight of the bottle is="+weight);
		System.out.println("looking="+looking);
		System.out.println("capacity of the bottle in letres="+capacity);
		System.out.println("warranty of the bottle is in years="+warranty);

		
	}

}

 class Bottle
{
	public static void main(String [] args)
	{
	Bottles bisleri=new Bottles();
	bisleri.display();
}
}
