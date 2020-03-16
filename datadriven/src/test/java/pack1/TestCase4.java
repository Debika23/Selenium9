package pack1;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class TestCase4 {

	@Test
	public void test() throws Exception {
//poi--.xlsx
		File f = new File("C:\\Users\\admin\\workspace\\9pm\\datadriven\\testdata\\Book1.xlsx");
		// file--workbook--sheet--row--cell--celldata
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet s = wb.getSheetAt(0);
		XSSFRow r = s.getRow(1);
		XSSFCell c = r.getCell(1);
		System.out.println(c.getStringCellValue());

	}

}
