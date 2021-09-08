package overall_test;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle extends DriverSetup {

	
	public static String baseUrl = "http://18.209.122.163/admin/dashboard";
	
	
    @Test
	public static void verifyTitle() throws InterruptedException {
		driver.get(baseUrl);
		String titleActual = driver.getTitle();
		System.out.println("The actual page title is: "+ titleActual);
		Thread.sleep(2000);
		String titleExpected = "EasyAsk";
		Assert.assertEquals(titleActual, titleExpected);
		
		
	}

}
