package Friday;
class A {

	void start() {
		System.out.println("executing strt method");
	}
}
class B extends A{
	void enter() {
		System.out.println("executing enter method");
	}
}
class C extends B{
	void search() {
		System.out.println("executing search method");
	}
	
}
class LastClass extends C{
	void end() {
		System.out.println("exexuting end method");
	}
}

public class MultiLevelHeritance {
	public static void main(String args[]) {
		
	
	 LastClass lc=new LastClass();
	lc.start();
    lc.enter();
	lc.search();
	lc.end();
	

}
}
