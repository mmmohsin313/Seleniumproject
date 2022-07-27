package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getcellsize {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
       
		FileInputStream file1 = new FileInputStream("C:\\Users\\JK\\OneDrive\\Desktop\\my_sheet.xlsx");
                 short data = WorkbookFactory.create(file1).getSheet("Sheet1").getRow(0).getLastCellNum();
                 System.out.println(data);  
	}

}
