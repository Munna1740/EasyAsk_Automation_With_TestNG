package extentReport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Login extends DriverSetup{
	
	
	@Test
	public static void verify_login() throws InterruptedException {
		
		// start reporters
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("extentreport.html");
		
		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		
        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Login", "Verify EasyAsk admin login");
        
        
        //test script
        test1.log(Status.INFO, "Start testing here.");
        
    		driver.get(baseUrl);
    		
    		test1.pass("Pick the email and password fields");
    		WebElement email = driver.findElement(By.name("email"));
    		WebElement password = driver.findElement(By.name("password"));
    		Thread.sleep(2000);
    		test1.pass("Sends keys value in the fields");

    		email.sendKeys("superadmin@gmail.com");
    		password.sendKeys("super");
    		Thread.sleep(2000);
    		
    		
    		WebElement login = driver.findElement(By.className("btn-primary"));
    		login.click();
            
    		test1.pass("Successfully logged into the system");
    		Thread.sleep(3000);
    		


        test1.info("Test Completed");
		extent.flush();
		
		
		
	}

}
