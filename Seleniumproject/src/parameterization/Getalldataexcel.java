package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Getalldataexcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException   {

		   FileInputStream file = new FileInputStream("C:\\Users\\JK\\OneDrive\\Desktop\\Parametrization.xlsx");
	         Sheet sh = WorkbookFactory.create(file).getSheet("Self");
	         
	  //  for(int i=0; i<=sh.getLastRowNum(); i++) {
	  //  	for(int j=0; j<=sh.getRow(i).getLastCellNum()-1; j++) {
	    		
	         for (int i=0; i<=2; i++) {
	        	 for (int j=0; j<=3; j++) {
	        		 
	    		Cell celltype = sh.getRow(i).getCell(j);
	    		CellType datatype = celltype.getCellType();
	    		
	    		if (datatype==celltype.getCellType().BLANK) {
	    			CellType a = celltype.getCellType().BLANK;
	    			a.toString();
	    			System.out.print("**"+a+"** |");
	    		}	
	    		else if (datatype==celltype.getCellType().STRING) {
	    			System.out.print(celltype.getStringCellValue()+" |  ");
	    		}
	    		else if (datatype==celltype.getCellType().BOOLEAN) {
	    			System.out.print(celltype.getBooleanCellValue()+" | ");
	    		}
	    		else if (datatype==celltype.getCellType().NUMERIC) {
	    			System.out.print(celltype.getNumericCellValue()+" | ");
	    		}
	    	}
	    	System.out.println();
	    }
	}

	}


