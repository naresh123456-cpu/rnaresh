package Friday;
class Facebook{
	void start() {
		System.out.println("chatting started");
	}
}
class Messenger extends Facebook{
	void start() {
		System.out.println("updated to dtatus");
	}
}
class Calling extends Messenger{
	void start() {
		System.out.println("updated to calling");
	}
}


public class Override {
	public static void main(String args[]) {
		
	
	Calling c=new Calling();
	c.start();
	}
}
