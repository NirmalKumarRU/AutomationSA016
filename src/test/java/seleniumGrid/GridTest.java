package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GridTest {

	@Test
	public void testChrome() throws MalformedURLException, InterruptedException
	{
		ChromeOptions options = new ChromeOptions();
		Reporter.log("Test executing on chrome", true);

		WebDriver d = new RemoteWebDriver(new URL("http://localhost:4444"), options);
		Reporter.log("Driver session established with Server", true);
		Thread.sleep(5000);
		d.get("https://www.amazon.com");
		System.out.println("Title is :" + d.getTitle());
		Thread.sleep(10000);
		Reporter.log("Test execution for Amazon application", true);

		d.quit();
		Reporter.log("Test execution on chrome completed", true);
		  
	}
	
}
