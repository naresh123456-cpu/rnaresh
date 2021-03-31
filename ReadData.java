package practices;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("E:\\Tasks\\datadriven1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheet("data");
		int rowcount= sheet.getLastRowNum();
		int columncount=sheet.getRow(0).getLastCellNum();
		System.out.println(rowcount);
		System.out.println(columncount);
		for(int i=0;i<rowcount;i++) {
			XSSFRow currentrow=sheet.getRow(i);
			for(int j=0;j<columncount;j++) {
				String value=currentrow.getCell(j).toString();
				System.out.print(value+" ");
			}
			System.out.println();
			
		}
		
	}

}
