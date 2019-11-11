package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

	public Properties prop;
	public int RESPONSE_STATUS_CODE_200 = 200;
	

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fls = new FileInputStream(
					"D:\\Java Test Program\\RestAPI\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(fls);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
