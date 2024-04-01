package Config;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	public static void capture(WebDriver d)
	{
		TakesScreenshot ts=(TakesScreenshot) d;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(System.getProperty("user.dir") +"//Screenshot//CRM"+System.currentTimeMillis());
		
		try {
			FileHandler.copy(temp, dest);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
