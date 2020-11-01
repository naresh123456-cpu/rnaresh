package Friday;
interface Vehicle
{
	void moveOnGround();
}
interface Rocket
{
	void fly(); 
}

 class Jet implements Vehicle,Rocket 
 {
	 public void moveOnGround() 
	 {
		 System.out.println("take off landing");
		 
	 }
	 public void fly() {
		 System.out.println("fly in air");
	 }
}
 class Aeroplane {
	 public static void main(String []args) {
		 Jet j=new Jet();
		 j.moveOnGround();
		 j.fly();
		 
	 }
 }
