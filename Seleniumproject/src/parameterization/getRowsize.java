package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getRowsize {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file1 = new FileInputStream("C:\\Users\\JK\\OneDrive\\Desktop\\my_sheet.xlsx");
                    int data = WorkbookFactory.create(file1).getSheet("Sheet1").getLastRowNum();
       System.out.println(data);
	}

}
