package testNG_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.google.gson.internal.bind.TreeTypeAdapter;

public class PracticeTestNG extends DriverSetup{

	
	
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
	
	
	@Test
	public static void pageRefresh() throws InterruptedException {
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
		Thread.sleep(3000);
		
		driver.navigate().to("https://stackoverflow.com/questions/6202223/auto-code-completion-on-eclipse");
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		
		driver.navigate().refresh();
		Thread.sleep(3000);
	}
	
	
	@Test
	public static void scrolling() throws InterruptedException {
		driver.get("https://www.selenium.dev/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Scroll to bottom
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		
		// scroll to top
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		Thread.sleep(3000);
		
		// scroll specific 
		WebElement specificLoc = driver.findElement(By.xpath("/html/body/div/main/div[6]/h2"));
		
		js.executeScript("arguments[0].scrollIntoView();", specificLoc);
		Thread.sleep(3000);

		
	}
	
	
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
