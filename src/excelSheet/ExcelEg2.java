package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//fileNotFoundException---If the path is wrong or koi mistake kiya hai
		//if i gave blank cell no. where data is not present---nullPointerException---because of data
		//cell category---Number,Booleaen,String
		//data hai number type ka and aap getStringCellValue karr rahe ho--casting, illegaleState
		
		
		//class ka object create karke interface mein store karr rahe----casting
		
		FileInputStream myFile = new FileInputStream("C:\\Users\\naikg\\Documents\\Velocity Automation Course pdf everyday file\\29thJulyVelocityBatch.xlsx");
		
		Workbook myWorkBook = WorkbookFactory.create(myFile);
		
		Sheet mySheet = myWorkBook.getSheet("Sheet1");
		
		Row myRow = mySheet.getRow(1);
		
		Cell myCell = myRow.getCell(0);
		
		//to get type of cell
		CellType myDataType = myCell.getCellType();
		
		System.out.println(myDataType);

		
		
		
	}

}
