package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		 //for reading the value from excel sheet
		
		 //creating object of fileinputStream
		 FileInputStream myFile = new FileInputStream("C:\\Users\\naikg\\Documents\\Velocity Automation Course pdf everyday file\\29thJulyVelocityBatch.xlsx");
		 //String value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
		 
		 double value1 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
		 //I want to see value
		 //System.out.println("Value from excel sheet is "+value);
		 System.out.println(value1);
	}

}
