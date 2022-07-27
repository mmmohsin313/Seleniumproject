package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getTypeofdata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

       FileInputStream file = new FileInputStream("C:\\Users\\JK\\OneDrive\\Desktop\\my_sheet.xlsx");
         Cell cellinfo = WorkbookFactory.create(file).getSheet("Sheet1").getRow(4).getCell(2);
         
         CellType CT = cellinfo.getCellType();
         
         if (CT==CellType.STRING)  {
        	 System.out.println(cellinfo.getStringCellValue());
         }
         else if (CT==CellType.BOOLEAN) {
        	 System.out.println(cellinfo.getBooleanCellValue());
         }
         else if (CT==CellType.NUMERIC) {
        	 System.out.println(cellinfo.getNumericCellValue());
         }
       }   
       
	}


