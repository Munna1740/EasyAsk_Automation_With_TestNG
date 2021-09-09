package Jira_Issues;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import overall_test.DriverSetup;

public class Eas182 extends DriverSetup {
	
	
	
	@Test
	public static void verify_login() throws InterruptedException {
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
	public static void eas182() throws InterruptedException {
		verify_login();
		
		WebElement catalogue = driver.findElement(By.xpath("/html/body/div/div/nav/ul/li[3]/a"));
		catalogue.click();
		Thread.sleep(2000);
		
		WebElement products = driver.findElement(By.xpath("//a[@href='http://18.209.122.163/admin/product']"));
		products.click();
		Thread.sleep(2000);
		
		WebElement add_product = driver.findElement(By.xpath("//a[@href='http://18.209.122.163/admin/product/create']"));
		add_product.click();
		Thread.sleep(2000);
		
		WebElement product_type = driver.findElement(By.name("product_type"));
		product_type.click();
		Thread.sleep(2000);
		
		WebElement bundle_type = driver.findElement(By.xpath("//*[@id=\"tab_basic-info\"]/div/div[2]/select/option[2]"));
		bundle_type.click();
		Thread.sleep(5000);
		
		WebElement bundle_product = driver.findElement(By.xpath("//a[@href='#tab_products']"));
		bundle_product.click();
		Thread.sleep(5000);
		
		WebElement search = driver.findElement(By.xpath("//*[@id=\"tab_products\"]/div/div[3]/div/button"));
		search.click();
		Thread.sleep(5000);
		
		//type product name on search field
		WebElement search_by_name = driver.findElement(By.xpath("//*[@id=\"addProductModal\"]/div/div/div[2]/div/div/div[1]/input"));
		search_by_name.click();
		search_by_name.sendKeys("Laptop");
		
		
		
		Thread.sleep(6000);
		
	}
	

}
