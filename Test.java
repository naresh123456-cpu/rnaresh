import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;

public class Test {
	public static ArrayList<Object[]> getDataFromExcel() throws Exception{
		ArrayList<Object[]> mydata= new ArrayList<Object[]>();
		FileInputStream f=new FileInputStream("E:\\Tasks\\datadriven.xls");
		Workbook w= Workbook.getWorkbook(f);
		Sheet sh=w.getSheet("data");
		int rc=sh.getRows();
		int cc=sh.getColumns();
		System.out.println(rc);
		System.out.println(cc);
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		for(int i=1;i<rc-1;i++)
		{
			String uname=sh.getCell(0,i).getContents();
			String pswd=sh.getCell(1,i).getContents();
			String location=sh.getCell(2,i).getContents();
			String hotels=sh.getCell(3,i).getContents();
			String roomtype=sh.getCell(4,i).getContents();
			String nofrms=sh.getCell(5,i).getContents();
			String chkndate=sh.getCell(6,i).getContents();
			String chkotdate=sh.getCell(7,i).getContents();
			String adlts=sh.getCell(8,i).getContents();
			String chlds=sh.getCell(9,i).getContents();
			String fstnm=sh.getCell(10,i).getContents();
			String lstnm=sh.getCell(11,i).getContents();
			String blnadd=sh.getCell(12,i).getContents();
			String crdno=sh.getCell(13,i).getContents();
			String crdtype=sh.getCell(14,i).getContents();
			String mnth=sh.getCell(15,i).getContents();
			String year=sh.getCell(16,i).getContents();
			String cvv=sh.getCell(17,i).getContents();
            System.out.println(uname+"   "+pswd+"   "+location+" "+hotels+" "+roomtype+" "+nofrms+" "+chkndate+" "+chkotdate+" "+adlts+" "+chlds+" "+fstnm+" "+lstnm+" "+blnadd+" "+crdno+" "+crdtype+" "+mnth+" "+year+"  "+cvv);
            mydata.add(new Object[] {uname,pswd,location,hotels,roomtype,nofrms,chkndate,chkotdate,adlts,
            		chlds,fstnm,lstnm,blnadd,crdno,crdtype,mnth,year,cvv});
		}
		
		
	
		return mydata;
	}
	 
	
 
}
