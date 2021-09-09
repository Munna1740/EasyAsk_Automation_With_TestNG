package overall_test;

import org.testng.annotations.Test;

public class SecurityTesting extends DriverSetup {
	
	
	
	@Test
	public static void isWebSiteSecure() throws InterruptedException {
		driver.get(baseUrl);
		
		String myUrl = driver.getCurrentUrl();
		
		if(myUrl.contains("https")) {
			System.out.println("This website is secured by HTTPS protocol");
		}
		
		else {
			System.out.println("This website isn't secured by HTTPS protocol");
		}
		Thread.sleep(3000);
	}
	
	

}
