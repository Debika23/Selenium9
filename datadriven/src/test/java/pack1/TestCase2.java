package pack1;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;

import jxl.Sheet;
import jxl.Workbook;

public class TestCase2 {

	@Test
	public void test() throws Exception{
		//jxl
		File f=new File("C:\\Users\\admin\\workspace\\9pm\\datadriven\\testdata\\Book2.xls");
		Workbook w=Workbook.getWorkbook(f);
		Sheet s=w.getSheet(0);
		String str=s.getCell(2, 9).getContents();
		System.out.println(str);
		
		
		
	}

}
