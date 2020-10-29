class Employee{
	int empid;
	String empname;
	int salary;
	String department;
	Employee( int empid,String empname,int salary,String department){
		this.empid=empid;
		this.empname=empname;
		this.salary=salary;
		this.department=department;
	}
	void display() {
		System.out.println("employee id is="+empid);
		System.out.println("employeename is="+empname);
		System.out.println("salary="+salary);
		System.out.println("department="+department);
	}
	
}

 class Constructor {
	 public static void main(String []args) {
		 Employee naresh=new Employee(201,"naresh",25000,"developer");
		 naresh.display();
		 Employee raji=new Employee(501,"raji",23000,"tester");
		 raji.display();
	 }

}
