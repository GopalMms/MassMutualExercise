package massMutual.gui.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class WebDriverManager {
	private static WebDriver driver;
	//final static String url = "https://www.exercise1.com/values";
	//Above URL would throw an error
	final static String url = "https://www.google.com/";

	public static WebDriver getDriverInstance(String BrowserType)
	{

		try
		{

			switch (BrowserType.toUpperCase()) {
			case "CHROME":

				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				driver.manage().deleteAllCookies();
				driver.get(url);
				driver.manage().window().maximize();

			case "IE":
				//implement
				break;
			default:
				break;
			}


		}
		catch(Exception e)
		{
			//.printStackTrace();
			return null;

		}
		return driver;

	}

}
