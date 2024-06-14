package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {

	public void getData() throws EncryptedDocumentException, IOException {
		String path ="C:\\Selenium\\Testdata.xlsx";//path of the file
		FileInputStream file = new FileInputStream(path);///connects to the path
		String UserName =WorkbookFactory.create(file).getSheet("Data").getRow(1).getCell(0).getStringCellValue();
		System.out.println(UserName);
		String PassWord =WorkbookFactory.create(file).getSheet("Data").getRow(1).getCell(2).getStringCellValue();
		System.out.println(PassWord);
			
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
ExcelSheet obj = new ExcelSheet();
obj.getData();
	}

}
