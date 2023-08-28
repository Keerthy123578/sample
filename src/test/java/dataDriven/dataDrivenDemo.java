package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDrivenDemo {

	
	public static void main(String[] args) throws IOException {
		File location=new File("C:\\Users\\DELL\\eclipse-workspace\\MavenTest\\src\\test\\resources\\testData\\testdata1.xlsx");
		FileInputStream input=new FileInputStream(location);
		Workbook w=new XSSFWorkbook(input);
		//Sheet s=(Sheet) w.getSheet("Sheet1");
		//Sheet s=w.getSheetAt(0);
	
		
		

	}

}

