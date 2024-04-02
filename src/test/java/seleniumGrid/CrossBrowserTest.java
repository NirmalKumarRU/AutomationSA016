package seleniumGrid;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;

public class CrossBrowserTest {
	public WebDriver d;
	@Parameters({"bname"})
	
	@Test
	public void browserTest(String bname) throws MalformedURLException, InterruptedException
	{
		
		
		if (bname.equalsIgnoreCase("chrome"))
		{
			
			ChromeOptions options = new ChromeOptions();
			Reporter.log("Test executing on chrome", true);

			d = new RemoteWebDriver(new URL("http://localhost:4444"), options);
			Reporter.log("Driver session established with Server", true);
			
		}else if (bname.equalsIgnoreCase("edge"))
		{
			EdgeOptions options = new EdgeOptions();
			Reporter.log("Test executing on edge", true);

			d = new RemoteWebDriver(new URL("http://localhost:4444"), options);
			Reporter.log("Driver session established with Server", true);
			
		}else if(bname.equalsIgnoreCase("firefox"))
		{
			FirefoxOptions options = new FirefoxOptions();
			Reporter.log("Test executing on firefox", true);

			d = new RemoteWebDriver(new URL("http://localhost:4444"), options);
			Reporter.log("Driver session established with Server", true);
			
		}
		
		Thread.sleep(5000);
		d.get("https://www.amazon.in/");
		System.out.println("Title is :" + d.getTitle());
		Thread.sleep(10000);
		Reporter.log("Test execution for Amazon application", true);

		//d.quit();
		Reporter.log("Test execution on chrome completed", true);
		//Reporter.log("Test execution on edge completed", true);
		//Reporter.log("Test execution on firefox completed", true);
		
	}

}
