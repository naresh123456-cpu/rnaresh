package practices;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("info");
		Object empdata[][]= {
				             {"empid","empname","dept"},
		                     {"100","naresh","developer"},
		                     {"101","ramesh","qa"},
		                     {"102","surya","manual"},
		                     };
		int rowcount=empdata.length;
		int colcount=empdata[0].length;
		System.out.println(rowcount);//4
		System.out.println(colcount);//3
		/*for(int r=0;r<rowcount;r++) 
		{
			XSSFRow row=sheet.createRow(r);
			
			
				for(int c=0;c<colcount;c++)
				{
					XSSFCell cell=row.createCell(c);
					Object value=empdata[r][c];
					if(value instanceof String)
						cell.setCellValue((String)value);
					if(value instanceof Integer)
						cell.setCellValue((Integer)value);
					if(value instanceof Boolean)
						cell.setCellValue((Boolean)value);
				}
			}*/
		// USING FOR EACH LOOP
	int rowCount=0;
		for(Object emp[]:empdata)
		{
			XSSFRow row=sheet.createRow(rowCount++);
			int colCount=0;
			for(Object value:emp)
			{
				XSSFCell cell=row.createCell(colCount);
				if(value instanceof String)
					cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
			}
		}
			
			FileOutputStream outstream=new FileOutputStream(".\\Datafiles\\employee1.xlsx");
			workbook.write(outstream);
			outstream.close();
			System.out.println("done");
		           
	}

}
