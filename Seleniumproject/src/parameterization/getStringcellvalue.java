package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getStringcellvalue {

	    public static void main(String[] args) throws EncryptedDocumentException, IOException {
			
	    	FileInputStream file = new FileInputStream("C:\\Users\\JK\\OneDrive\\Desktop\\my_sheet.xlsx");
	    	  String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	    	  System.out.println(data);
		}
	
}
