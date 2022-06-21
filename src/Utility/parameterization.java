      package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class parameterization {
    	  
      public static String getdata (int row,int cell) throws EncryptedDocumentException, IOException {
    	  
    	FileInputStream file = new FileInputStream("C:\\Users\\Balaji\\OneDrive\\Documents\\exfile.xlsx") ;
    	  
    	  String value = WorkbookFactory.create(file).getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
    	  
    	  return value;
    	  
    	  
    	  
    	  
      }

}
