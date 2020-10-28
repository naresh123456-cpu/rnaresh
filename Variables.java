class StudentInfo{
  int id;
  float percentage;
  static String clg;
  long phn;
  int rno;
  float height;
  float weight;
  String blood;
  int fee;
  String branch;
}
 class EmployeeInfo{
   int employee_id;
   int salary;
   static String company_name;
   long phn;
   int rno;
   float height;
   float weight;
   String blood;
   String department;
}
class Variables{
 public static void main(String args[])
{
  StudentInfo naresh=new StudentInfo();
   naresh.id=100;
   naresh.percentage=89.5f;
   StudentInfo.clg= "SPEC";
   naresh.phn= 9876543210L;
   naresh.rno=105;
   naresh.height=6.5f;
   naresh.weight=50.25f;
   naresh.blood="O positive";
   naresh.fee=5000;
   naresh.branch="ECE";
  
 System.out.println("==============student details==============");
   System.out.println("student_id="+naresh.id);
   System.out.println("percentage="+naresh.percentage);
   System.out.println("college="+StudentInfo.clg);
   System.out.println(" mobile number="+naresh.phn);
   System.out.println("roll number="+naresh.rno);
   System.out.println("height="+naresh.height);
   System.out.println("weight="+naresh.weight);
   System.out.println("blood group="+naresh.blood);
   System.out.println("fee="+naresh.fee);
   System.out.println("branch="+naresh.branch);

   EmployeeInfo ramesh=new EmployeeInfo();
   ramesh.employee_id=102;
   ramesh.salary=25000;
   EmployeeInfo.company_name="jnit";
   ramesh.phn= 980043210L;
   ramesh.rno=15;
   ramesh.height=6.1f;
   ramesh.weight=51.25f;
   ramesh.blood="B positive";
   ramesh.department= "developer";
  
  
 System.out.println("===========employee details===============");
   System.out.println("employee_id="+ramesh.employee_id);
   System.out.println("salary="+ramesh.salary);
   System.out.println(EmployeeInfo.company_name);
   System.out.println("phn="+ramesh.phn);
   System.out.println("rno="+ramesh.rno);
   System.out.println("height="+ramesh.height);
   System.out.println("weight="+ramesh.weight);
   System.out.println("blood="+ramesh.blood);
   System.out.println("department="+ramesh.department);
}
}
   
