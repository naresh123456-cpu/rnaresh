package Friday;
class Google {
	void search() {
		System.out.println("executing search method");
	}
}
class Whatsaap extends Google {
	void chatting() {
		System.out.println("executing chatting method");
	}
}
public class SingleInheritance {
	public static void main( String args[]) {
		Whatsaap w=new Whatsaap();
		w.chatting();
		w.search();
		
	}
	

}
