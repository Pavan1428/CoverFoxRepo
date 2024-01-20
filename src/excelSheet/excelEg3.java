package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelEg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//how to read total row
		FileInputStream myFile = new FileInputStream("C:\\Users\\naikg\\Documents\\Velocity Automation Course pdf everyday file\\29thJulyVelocityBatch.xlsx");
		
		Workbook myWorkBook = WorkbookFactory.create(myFile);
		Sheet mySheet = myWorkBook.getSheet("Sheet1");
		
		//how to read whole row
		for(int i=0;i<=2;i++)
		{
		String value = mySheet.getRow(0).getCell(i).getStringCellValue();//0---->2
		System.out.print(value+" ");
		}
		System.out.println();
		System.out.println("=======================================================");
		//how to read whole column (cell)
		
		for(int i=0; i<=3;i++)
		{
			String value = mySheet.getRow(i).getCell(4).getStringCellValue();
			System.out.println(value);
		}
		

	}

}
