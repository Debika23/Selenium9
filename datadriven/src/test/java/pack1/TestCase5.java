package pack1;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

public class TestCase5 {

	@Test
	public void test() throws Exception {

		File f = new File("C:\\Users\\admin\\workspace\\9pm\\datadriven\\testdata\\text1.txt");
		FileUtils.writeStringToFile(f, "Testing Tools");
	
		

	}

}
