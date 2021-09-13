package testNG_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown extends DriverSetup{
	
	@Test
	public static void dropDown() throws InterruptedException {
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
		
		
		driver.switchTo().frame("iframeResult");
		WebElement select_btn = driver.findElement(By.id("cars"));
		select_btn.click();
		Select s = new Select(select_btn);
		Thread.sleep(2000);
		s.selectByIndex(1);
		
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
	}

}
