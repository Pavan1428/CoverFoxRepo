package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
        FileInputStream myFile = new FileInputStream("C:\\Users\\naikg\\Documents\\Velocity Automation Course pdf everyday file\\29thJulyVelocityBatch.xlsx");
		
		Workbook myWorkBook = WorkbookFactory.create(myFile);
		Sheet mySheet = myWorkBook.getSheet("Sheet3");
		
		int lastRowNum = mySheet.getLastRowNum();
		int totalNoOfRows = lastRowNum;
		
		short lastCellNo = mySheet.getRow(0).getLastCellNum();
		int totalNumOfCell = lastCellNo-1;
		
		//outer for loop for rows--->
		for(int i=0;i<=totalNoOfRows;i++)
		{
			for(int j=0; j<=totalNumOfCell;j++)
			{
				String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
		}
		



	}

}
