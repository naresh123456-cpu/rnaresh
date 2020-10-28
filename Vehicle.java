

	class Bike{
		  float cost;
		  int gears;
		  int wheels;
		  float mileage;
		  int weight;
		  float fuel_capacity;
		  int top_speed;
		  boolean automtion;
		  int cubic_capacity;
		  String brand;
		  static String fuel;
		}

		 class Bus{
		   float cost;
		  int gears;
		  int wheels;
		  float mileage;
		  int weight;
		  float fuel_capacity;
		  int top_speed;
		  boolean automtion;
		  int cubic_capacity;
		  String brand;
		  static String fuel;
		}
		  class Vehicle{
		  public static void main( String args[]){
		  
		   Bike bajaj= new Bike();
		   bajaj.cost=11.1f;
		   bajaj.gears=4;
		   bajaj.wheels=2;
		   bajaj.mileage=84.5f;
		   bajaj.weight=35;
		   bajaj.fuel_capacity=10.2f;
		   
		   bajaj.cubic_capacity=150;
		   bajaj.brand="bajaj CT100";
		   Bike.fuel="petrol";
		 System.out.println("============Bike Details===========");
		  
		   System.out.println("cost="+bajaj.cost);
		   System.out.println("gears="+bajaj.gears);
		   System.out.println("wheels="+bajaj.wheels);
		   System.out.println("mileage="+bajaj.mileage);
		   System.out.println("weight of the bike="+bajaj.weight);
		   System.out.println("fuel capacity="+bajaj.fuel_capacity);
		  
		   System.out.println("cubic capacity of the bike="+bajaj.cubic_capacity);
		   System.out.println("brand name of the bike="+bajaj.brand);
		   System.out.println("fuel type="+Bike.fuel);

		  Bus leyland=new Bus();
		   leyland.cost=15.1f;
		   leyland.gears=6;
		   leyland.wheels=10;
		   leyland.mileage=34.5f;
		   leyland.weight=355;
		   leyland.fuel_capacity=100.2f;
		   
		   leyland.cubic_capacity=1500;
		   leyland.brand="Ashok leyland";
		   Bus.fuel="Diesel";
		   
		 System.out.println("===========Bus Details============");
		   System.out.println("cost="+leyland.cost);
		   System.out.println("gears="+leyland.gears);
		   System.out.println("wheels="+leyland.wheels);
		   System.out.println("mileage="+leyland.mileage);
		   System.out.println("weight of the bike="+leyland.weight);
		   System.out.println("fuel capacity="+leyland.fuel_capacity);
		   
		   System.out.println("cubic capacity of the bike="+leyland.cubic_capacity);
		   System.out.println("brand name of the bike="+leyland.brand);
		   System.out.println("fuel type="+Bus.fuel);
		 }
		


		  


}
