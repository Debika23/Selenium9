package pack1;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;

import jxl.Sheet;
import jxl.Workbook;

public class TestCase3 {

	@Test
	public void test() throws Exception{
		//poi--.xls
		File f=new File("C:\\Users\\admin\\workspace\\9pm\\datadriven\\testdata\\Book2.xls");
		//file--workbook--sheet--row--cell--celldata
		FileInputStream fis=new FileInputStream(f);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet s=wb.getSheetAt(0);
		HSSFRow r=s.getRow(1);
		HSSFCell c=r.getCell(1);
		System.out.println(c.getStringCellValue());
		
		
		
		
		
	}

}
