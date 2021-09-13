package testNG_practice;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;


public class ClickRadioButton extends DriverSetup{

	
	
	@Test
	public static void clickRadioButton() throws InterruptedException {
	    String baseUrl = "https://jqueryui.com/checkboxradio/";
		driver.get(baseUrl);
		
		driver.switchTo().frame(0);
		
		//radio button
		WebElement radio_btn = driver.findElement(By.xpath("/html/body/div/fieldset[1]/label[3]/span[1]"));
		radio_btn.click();
		Thread.sleep(3000);
		
		
		// check box 
		WebElement check_btn1 = driver.findElement(By.xpath("/html/body/div/fieldset[2]/label[4]/span[1]"));
		check_btn1.click();
		Thread.sleep(2000);
		
		
		// Nested check box
		WebElement check_btn2 = driver.findElement(By.xpath("/html/body/div/fieldset[3]/label[3]/span[2]"));
		check_btn2.click();
		Thread.sleep(2000);
		
		WebElement check_btn3 = driver.findElement(By.xpath("/html/body/div/fieldset[3]/label[1]/span[1]"));
		check_btn3.click();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
	}		
}
