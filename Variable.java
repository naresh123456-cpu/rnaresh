class Student{
  int id;
  float percentage;
  static String clg;
}
 class Employee{
   int employee_id;
   int salary;
   static String company_name;
}
class Variable{
 public static void main(String args[])
{
  Student naresh=new Student();
   naresh.id=100;
   naresh.percentage=89.5f;
   Student.clg= "SPEC";
   System.out.println("==============student details==============");
   System.out.println("student id="+naresh.id);
   System.out.println("percentage="+naresh.percentage);
   System.out.println("college="+Student.clg);


   Employee ramesh=new Employee();
   ramesh.employee_id=102;
   ramesh.salary=25000;
   Employee.company_name="jnit";
   System.out.println("===========employee details===============");
   System.out.println(ramesh.employee_id);
   System.out.println(ramesh.salary);
   System.out.println(Employee.company_name);
}
}

