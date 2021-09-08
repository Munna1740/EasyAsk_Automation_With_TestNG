package overall_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class Store extends DriverSetup {
	

	
    @Test
	public static void verifyLogin() throws InterruptedException {
		String baseUrl = "http://18.209.122.163/admin/dashboard";
		driver.get(baseUrl);
		
		//login
		WebElement email = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("password"));
		
		Thread.sleep(2000);
		
		//set the element input
		email.sendKeys("superadmin@gmail.com");
		password.sendKeys("superadmin");
		Thread.sleep(2000);
		
		//find the button and click on it
		WebElement login = driver.findElement(By.className("btn-primary"));
		login.click();
		Thread.sleep(3000);
		

		
	}
	

	@Test
	public static void clickLocation() throws InterruptedException {	
		verifyLogin();
		
		WebElement location = driver.findElement(By.xpath("/html/body/div/div/nav/ul/li[13]/a"));
		location.click();
		Thread.sleep(2000);

		WebElement store = driver.findElement(By.xpath("//a[@href='http://18.209.122.163/admin/store']"));
		store.click();
		Thread.sleep(2000);
		driver.close();

	}
}


