package data_driven_testing;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest extends DriverSetup {
	
	@Test(dataProvider = "LoginData")
	public static void loginTest(String email, String password, String exp) throws InterruptedException {
        driver.get(baseUrl);
		
		//login
		WebElement email1 = driver.findElement(By.name("email"));
		WebElement password1 = driver.findElement(By.name("password"));
		
		Thread.sleep(2000);
		
		//set the element input
		email1.clear();
		email1.sendKeys(email);
		password1.clear();
		password1.sendKeys(password);
		Thread.sleep(2000);
		
		//find the button and click on it
		WebElement login = driver.findElement(By.className("btn-primary"));
		login.click();
		
	    System.out.println(login);
		
		if(exp.equals("valid")) {
			
			WebElement account = driver.findElement(By.xpath("//header/ul[2]/li[1]/a[1]"));
			account.click();

			WebElement logout = driver.findElement(By.xpath("//header/ul[2]/li[1]/div[1]/a[2]"));
			logout.click();
			Assert.assertTrue(true);
		}
		else{
			Assert.assertTrue(false);
		}
		
		Thread.sleep(3000);
		
		
		
	}
	
	
	
	@DataProvider(name = "LoginData")
	public String [][] getData() throws IOException {
		
		
		/*String loginData[][] = {
				{"superadmin@gmail.com", "superadmin", "valid"},
				{"admin@gmail.com", "admin", "invalid"},
				{"kamal@gmail.com", "kamal", "invalid"},
				{"jafar@gmail.com", "jafar", "invalid"}
		};*/
		
		//get data from excel file
		String path = ".\\datafiles\\loginData.xlsx";
		XLUtility xlutil = new XLUtility(path);
		
		int totalrows = xlutil.getRowCount("Sheet1");
		int totalcols = xlutil.getCellCount("Sheet1", 1);
		
		String loginData[][] = new String[totalrows][totalcols];
		
		for(int i=1;i<=totalrows;i++) //1
		{
			for(int j=0;j<totalcols;j++) //0
			{
				loginData[i-1][j]=xlutil.getCellData("Sheet1", i, j);
			}
				
		}

		
		
		return loginData;
		
	}

}
