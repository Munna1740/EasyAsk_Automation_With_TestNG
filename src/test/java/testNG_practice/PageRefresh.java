package testNG_practice;

import org.testng.annotations.Test;

public class PageRefresh extends DriverSetup {
	
	
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

}
