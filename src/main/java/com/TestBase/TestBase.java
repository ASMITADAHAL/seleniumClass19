package com.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	private static final Reader FileInputStream = null;
	public static Properties prop;
	public static WebDriver driver;

	
	public TestBase() throws IOException {
		prop=new Properties();
		FileInputStream fle;
		try {
			fle = new FileInputStream("C:\\Users\\URMI\\eclipse-workspace\\selenium\\dell.qa\\src\\main\\java\\com\\Config");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}

		prop.load(FileInputStream);
}
	public static void initil() {
		String browser=prop.getProperty("browser");
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\auto1\\chromedriver.exe");
			driver=new ChromeDriver(); 
			}
			else if (browser.equalsIgnoreCase("FF")) {
			System.setProperty("webdriver.geko.driver","C:\\DRIVER\\geckodriver-v0.24.0-win64\\geckodriver.exe" );
			driver=new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.youtube.com/");
			
				
			}
		

	
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
