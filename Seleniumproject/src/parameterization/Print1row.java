package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Print1row {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

   FileInputStream file = new FileInputStream("C:\\Users\\JK\\OneDrive\\Desktop\\my_sheet.xlsx");
        Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
     for (int i=0; i<=sh.getLastRowNum(); i++) {
    	 for (int j=0; j<=sh.getRow(i).getLastCellNum()-1; j++) {
    		 
    		      String data = sh.getRow(i).getCell(j).getStringCellValue();
    		 System.out.print(data + " ");
    	 }
    	 System.out.println();
     }
	}

}
