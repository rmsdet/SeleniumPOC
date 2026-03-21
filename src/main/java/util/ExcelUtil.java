package util;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil {

	public static String cellValue(String Sheet,int rCount, int cCount) {
		
			try {
				
				//load the file 
				FileInputStream fis=new FileInputStream("src/main/resources/TestData.xlsx");
				
				// Contains entier excel file, contaims all sheets  		
				Workbook wb= WorkbookFactory.create(fis);// WorkbookFactory support all format like .xlsx or xls
				
				// this will go inside Sheet
				
				Sheet sh= wb.getSheet(Sheet);
				
				Row roN= sh.getRow(rCount);
				Cell ceN=roN.getCell(cCount);
				return ceN.getStringCellValue();
			}
			catch(Exception e) {
				e.printStackTrace();
				return null;
			}
	}

}
