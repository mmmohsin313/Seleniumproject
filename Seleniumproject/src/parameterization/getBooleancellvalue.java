package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getBooleancellvalue {
    
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	FileInputStream file2 = new FileInputStream("C:\\Users\\JK\\OneDrive\\Desktop\\my_sheet.xlsx");
	            
	         boolean data2 = WorkbookFactory.create(file2).getSheet("Sheet1").getRow(1).getCell(2).getBooleanCellValue();
	         
	         System.out.println(data2);
	}
}
