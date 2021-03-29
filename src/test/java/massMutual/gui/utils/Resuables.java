package massMutual.gui.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Resuables {
	WebDriver driver;

	/**
	 * Checks for the visibility of the web element for given time period
	 * @param element
	 * @param time
	 * @return
	 * @throws InterruptedException
	 */

	public boolean Check_isVisible(WebElement element,int time) 
	{
		try
		{
			WebDriverWait wait=new WebDriverWait(driver,time);

			wait.until(ExpectedConditions.visibilityOf(element));
		}
		catch(Exception e)
		{
			return false;
		}
		return true;

	}
	/**
	 * Checks for the visibility of the web element
	 * @param element
	 * @return
	 * @throws InterruptedException
	 */
	public boolean Check_isVisible(WebElement element) 
	{
		try
		{
			WebDriverWait wait=new WebDriverWait(driver,2);

			wait.until(ExpectedConditions.visibilityOf(element));
		}
		catch(Exception e)
		{
			return false;
		}
		return true;

	}

}
