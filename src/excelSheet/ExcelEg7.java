
package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg7 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//for data type---illegale stale exception
        FileInputStream myFile = new FileInputStream("C:\\Users\\naikg\\Documents\\Velocity Automation Course pdf everyday file\\29thJulyVelocityBatch.xlsx");
		
		Workbook myWorkBook = WorkbookFactory.create(myFile);
		Sheet mySheet = myWorkBook.getSheet("Sheet4");
		
		int lastRowNum = mySheet.getLastRowNum();
		int totalNumOfRows=lastRowNum;

		short lastCellNum = mySheet.getRow(0).getLastCellNum();
		int totalNumOfCell=lastCellNum-1;
		
		//outer for loop--> rows
		for(int i=0; i<=totalNumOfRows;i++)
		{
			for(int j=0; j<=totalNumOfCell;j++)
			{
				CellType myCellDataType = mySheet.getRow(i).getCell(j).getCellType();
				//System.out.println(myCellDataType);
				
				if(myCellDataType==CellType.STRING)
				{
					String value = mySheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(value+" ");
				}
				
				else if(myCellDataType== CellType.BOOLEAN)
				{
					boolean value = mySheet.getRow(i).getCell(j).getBooleanCellValue();
					System.out.print(value+" ");
				}
				else if(myCellDataType==CellType.NUMERIC)
                {
					double value = mySheet.getRow(i).getCell(j).getNumericCellValue();
					System.out.print(value+" ");
				}

			}
			System.out.println();
		}

	}

}
