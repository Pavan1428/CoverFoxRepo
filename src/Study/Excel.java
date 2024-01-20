package Study;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream myFile = new FileInputStream("C:\\Users\\naikg\\Downloads\\Book1.xlsx");
		
		Workbook file = WorkbookFactory.create(myFile);
		
		Sheet sheet = file.getSheet("Sheet1");
		
		//value = sheet.getRow(3).getCell(0).get
		
		//System.out.println(value);
		int noOfRows = sheet.getLastRowNum();
		System.out.println(noOfRows);
		
		short cellNo = sheet.getRow(0).getLastCellNum();
		System.out.println(cellNo);
		
		

	}

}
