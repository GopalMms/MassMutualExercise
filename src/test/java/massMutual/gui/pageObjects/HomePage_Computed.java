package massMutual.gui.pageObjects;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import massMutual.gui.utils.Resuables;

public class HomePage_Computed extends HomePage_Generated{

	Resuables common ;
	public HomePage_Computed(WebDriver driver) {
		super(driver);
		this.driver = driver;
		common = new Resuables();
	}
	/**
	 * Given that if elements are available, this method verifies if the txt box values are greater than Zero 
	 * @param var
	 * @return
	 */
	public boolean verifyIfValuesAreGreaterThanZero(int var)
	{
		try
		{
			if(common.Check_isVisible(txt_Value_1))
			{
				if(Integer.parseInt(getText_txt_Value_1()) <= var || Integer.parseInt(getText_txt_Value_2())<=var || Integer.parseInt(getText_txt_Value_3())<=var
						|| Integer.parseInt(getText_txt_Value_4()) <= var || Integer.parseInt(getText_txt_Value_5()) <=var  )
					return false;		
				else
					return true;
			}
			else
				return false;

		}
		catch (Exception e) {

			//e.getLocalizedMessage();
			return false;
		}
	}
	/***
	 * Verifies if the total balance is equal to sum of all the txt box values 
	 * @return
	 */
	public boolean verifyTotalBalance()
	{
		try
		{
			if(common.Check_isVisible(txt_Value_1,5))
			{
				if((Integer.parseInt(getText_txt_Value_1()) + Integer.parseInt(getText_txt_Value_2()) + Integer.parseInt(getText_txt_Value_3()) + 
						Integer.parseInt(getText_txt_Value_4()) +  Integer.parseInt(getText_txt_Value_5()) ) == Integer.parseInt(getText_txt_Total_Balance()))
					return true;
				else 
					return false;
			}
			else 
				return false;
		}
		catch(Exception e)
		{
			//e.getLocalizedMessage();

			return false;
		}
	}
	/**
	 * Verifies if the numbers are with currency formatted
	 * @return
	 */
	public boolean IsCurrencyFormatted()
	{
		try
		{
			if(getText_txt_Value_1().startsWith("$") && getText_txt_Value_2().startsWith("$") && getText_txt_Value_3().startsWith("$") && 
					getText_txt_Value_4().startsWith("$") && getText_txt_Value_5().startsWith("$"))
			{return true;}
			else 
				return false;
		}
		catch(Exception e)
		{
			//e.getLocalizedMessage();
			return false;
		}
	}

	/**
	 * Verifies for the number of Labels and associated text boxes
	 * @return
	 */
	public boolean  CheckForRightCountOfWebElements()
	{
		try
		{
			List<WebElement> labels = driver.findElements(By.tagName("label"));
			List<WebElement> txtBoxes = driver.findElements(By.xpath("//input[@type='text']"));
			if(labels.size() != txtBoxes.size())
				return false;
			else 
				return true;
		}
		catch(Exception e)
		{

			e.printStackTrace();e.getLocalizedMessage();
			return false;
		}

	}
}
