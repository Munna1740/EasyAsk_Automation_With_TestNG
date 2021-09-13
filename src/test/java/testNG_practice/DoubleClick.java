package testNG_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleClick extends DriverSetup {
	
	@Test
	public static void doubleCLick() throws InterruptedException {
		driver.get("https://selenium-python.readthedocs.io/");
		Thread.sleep(3000);
		
		Actions a = new Actions(driver);
		
		//double click on text
		WebElement doubleClickText = driver.findElement(By.xpath("//*[@id=\"indices-and-tables\"]/h2"));
		a.doubleClick(doubleClickText).build().perform();
		Thread.sleep(6000);
		
		// right click on text
		WebElement rightClick = driver.findElement(By.xpath("//*[@id=\"indices-and-tables\"]/h2"));
		a.contextClick(rightClick).build().perform();
		Thread.sleep(6000);
		
		
	}

}
