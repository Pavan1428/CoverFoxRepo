package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//Now row and cell kaha tak hai essa muzhe kuch chahiye
        FileInputStream myFile = new FileInputStream("C:\\Users\\naikg\\Documents\\Velocity Automation Course pdf everyday file\\29thJulyVelocityBatch.xlsx");
		
		Workbook myWorkBook = WorkbookFactory.create(myFile);
		Sheet mySheet = myWorkBook.getSheet("Sheet2");
		
		//for total no of rows---according to java
		int totalNumberOfRows = mySheet.getLastRowNum();
		System.out.println(totalNumberOfRows);
		
		System.out.println("============================");
		//Directly we cant go to cell----0 no row me kitne cell hai//konse row me kitne cell hai
		//for total no of cells
		
		short totalNumberOfCells = mySheet.getRow(0).getLastCellNum();
		System.out.println(totalNumberOfCells);
		
		
		//for total +1
		//for total no of cells---will show practical value--so need to adjust -1 in cell only

	}

}
