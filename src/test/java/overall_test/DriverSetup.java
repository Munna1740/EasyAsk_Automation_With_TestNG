package overall_test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {
	
	public static WebDriver driver;
	
		//System.setProperty("webdriver.chrome.driver", "F:\\Software\\Java\\Tools\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
	    
	@BeforeSuite
	public static void setDriver() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
	    }
	
	
	@AfterSuite
	public static void close() {
		driver.close();
	}

	}

