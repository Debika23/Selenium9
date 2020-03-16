package pack1;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;

public class TestCase1 {

	@Test
	public void test() throws Exception{
		
		File f=new File("C:\\Users\\admin\\workspace\\9pm\\datadriven\\src\\main\\resources\\config\\global.properties");
		
		Properties prop=new Properties();
		prop.load(new FileInputStream(f));
		System.out.println(prop.getProperty("sys_url1"));
		
	}

}
