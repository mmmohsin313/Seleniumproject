package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class print1rowa {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		   FileInputStream file = new FileInputStream("C:\\Users\\JK\\OneDrive\\Desktop\\my_sheet.xlsx");
		        Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		        
		          short cellsize = sh.getRow(0).getLastCellNum();
		          
		          for (int i=0; i<cellsize; i++) {
		        	   String data = sh.getRow(1).getCell(i).getStringCellValue();
		        	   
		        	 System.out.print(data + " ");
		          }
	}
}
