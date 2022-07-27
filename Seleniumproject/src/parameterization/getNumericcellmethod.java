package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getNumericcellmethod {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file1 = new FileInputStream("C:\\Users\\JK\\OneDrive\\Desktop\\my_sheet.xlsx");
		
		     double data1 = WorkbookFactory.create(file1).getSheet("Sheet1").getRow(11).getCell(6).getNumericCellValue();
		    System.out.println(data1);
	}
	
}
