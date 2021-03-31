package orangehrm;

public class MainInfo {

	public static void main(String[] args) throws Exception {
		
		MyInfo data=new MyInfo();
		data.LaunchApp();
		data.Login("Admin", "admin123");
		data.recruitment("buttE","cassidy Hope","1");
		data.candiates("x" ,"y", "abc@gmail.com");
		//data.MyInfor("Paul","Collings","987654","654987","9603107203","2021-09-09","43002","650052","1975-05-05","jason");
		//data.AddEmployee("Naresh1", "Ragula1");

	}

}
