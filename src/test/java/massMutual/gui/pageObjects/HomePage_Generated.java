package massMutual.gui.pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

public class HomePage_Generated {
	protected WebDriver driver;
	public HomePage_Generated(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Associated Label : Value 1
	@FindBy(id = "lbl_val_1")
	protected WebElement lbl_Value_1;
	
	// Associated Label : Value 2
	@FindBy(id = "lbl_val_2")
	protected WebElement lbl_Value_2;
	
	// Associated Label : Value 3
	@FindBy(id = "lbl_val_3")
	protected WebElement lbl_Value_3;
	
	// Associated Label : Value 4
	@FindBy(id = "lbl_val_4")
	protected WebElement lbl_Value_4;
	
	// Associated Label : Value 5
	@FindBy(id = "lbl_val_5")
	protected WebElement lbl_Value_5;
	
	// Associated Label : Total Balance
	@FindBy(id = "lbl_ttl_val")
	protected WebElement lbl_Total_Balance;
	
	// Associated Label : Value 1
	@FindBy(id = "txt_val_1")
	protected WebElement txt_Value_1;
	
	// Associated Label : Value 2
	@FindBy(id = "txt_val_2")
	protected WebElement txt_Value_2;
	
	// Associated Label : Value 3
	@FindBy(id = "txt_val_4")
	protected WebElement txt_Value_3;
	
	// Associated Label : Value 4
	@FindBy(id = "txt_val_5")
	protected WebElement txt_Value_4;
	
	// Associated Label : Value 5
	@FindBy(id = "txt_val_6")
	protected WebElement txt_Value_5;
	
	// Associated Label : Total Balance
	@FindBy(id = "txt_ttl_val")
	protected WebElement txt_Total_Balance;
	
	// Click : Value 1
	public void click_lbl_Value_1(){
		lbl_Value_1.click();
	}

	// Hover : Value 1
	public void hover_lbl_Value_1(){
		Actions action = new Actions(driver);
		action.moveToElement(lbl_Value_1).build().perform();
	}

	// Visible or not : Value 1
	public boolean isDisplayed_lbl_Value_1(){
		if(lbl_Value_1.isDisplayed()){ return true; } else{ return false; }
	}

	// Enabled or not : Value 1
	public boolean isEnabled_lbl_Value_1(){
		if(lbl_Value_1.isEnabled()){ return true; } else{ return false; }
	}

	// Get Css attribute : Value 1
	public String getCssValue_lbl_Value_1(String attribute){
		return lbl_Value_1.getCssValue(attribute);
	}

	// Get the text : Value 1
	public String getText_lbl_Value_1(){
		return lbl_Value_1.getText();
	}

	// Get the value : Value 1
	public String getValue_lbl_Value_1(){
		return lbl_Value_1.getAttribute("value");
	}
	// Click : Value 2
	public void click_lbl_Value_2(){
		lbl_Value_2.click();
	}

	// Hover : Value 2
	public void hover_lbl_Value_2(){
		Actions action = new Actions(driver);
		action.moveToElement(lbl_Value_2).build().perform();
	}

	// Visible or not : Value 2
	public boolean isDisplayed_lbl_Value_2(){
		if(lbl_Value_2.isDisplayed()){ return true; } else{ return false; }
	}

	// Enabled or not : Value 2
	public boolean isEnabled_lbl_Value_2(){
		if(lbl_Value_2.isEnabled()){ return true; } else{ return false; }
	}

	// Get Css attribute : Value 2
	public String getCssValue_lbl_Value_2(String attribute){
		return lbl_Value_2.getCssValue(attribute);
	}

	// Get the text : Value 2
	public String getText_lbl_Value_2(){
		return lbl_Value_2.getText();
	}

	// Get the value : Value 2
	public String getValue_lbl_Value_2(){
		return lbl_Value_2.getAttribute("value");
	}
	// Click : Value 3
	public void click_lbl_Value_3(){
		lbl_Value_3.click();
	}

	// Hover : Value 3
	public void hover_lbl_Value_3(){
		Actions action = new Actions(driver);
		action.moveToElement(lbl_Value_3).build().perform();
	}

	// Visible or not : Value 3
	public boolean isDisplayed_lbl_Value_3(){
		if(lbl_Value_3.isDisplayed()){ return true; } else{ return false; }
	}

	// Enabled or not : Value 3
	public boolean isEnabled_lbl_Value_3(){
		if(lbl_Value_3.isEnabled()){ return true; } else{ return false; }
	}

	// Get Css attribute : Value 3
	public String getCssValue_lbl_Value_3(String attribute){
		return lbl_Value_3.getCssValue(attribute);
	}

	// Get the text : Value 3
	public String getText_lbl_Value_3(){
		return lbl_Value_3.getText();
	}

	// Get the value : Value 3
	public String getValue_lbl_Value_3(){
		return lbl_Value_3.getAttribute("value");
	}
	// Click : Value 4
	public void click_lbl_Value_4(){
		lbl_Value_4.click();
	}

	// Hover : Value 4
	public void hover_lbl_Value_4(){
		Actions action = new Actions(driver);
		action.moveToElement(lbl_Value_4).build().perform();
	}

	// Visible or not : Value 4
	public boolean isDisplayed_lbl_Value_4(){
		if(lbl_Value_4.isDisplayed()){ return true; } else{ return false; }
	}

	// Enabled or not : Value 4
	public boolean isEnabled_lbl_Value_4(){
		if(lbl_Value_4.isEnabled()){ return true; } else{ return false; }
	}

	// Get Css attribute : Value 4
	public String getCssValue_lbl_Value_4(String attribute){
		return lbl_Value_4.getCssValue(attribute);
	}

	// Get the text : Value 4
	public String getText_lbl_Value_4(){
		return lbl_Value_4.getText();
	}

	// Get the value : Value 4
	public String getValue_lbl_Value_4(){
		return lbl_Value_4.getAttribute("value");
	}
	// Click : Value 5
	public void click_lbl_Value_5(){
		lbl_Value_5.click();
	}

	// Hover : Value 5
	public void hover_lbl_Value_5(){
		Actions action = new Actions(driver);
		action.moveToElement(lbl_Value_5).build().perform();
	}

	// Visible or not : Value 5
	public boolean isDisplayed_lbl_Value_5(){
		if(lbl_Value_5.isDisplayed()){ return true; } else{ return false; }
	}

	// Enabled or not : Value 5
	public boolean isEnabled_lbl_Value_5(){
		if(lbl_Value_5.isEnabled()){ return true; } else{ return false; }
	}

	// Get Css attribute : Value 5
	public String getCssValue_lbl_Value_5(String attribute){
		return lbl_Value_5.getCssValue(attribute);
	}

	// Get the text : Value 5
	public String getText_lbl_Value_5(){
		return lbl_Value_5.getText();
	}

	// Get the value : Value 5
	public String getValue_lbl_Value_5(){
		return lbl_Value_5.getAttribute("value");
	}
	// Click : Total Balance
	public void click_lbl_Total_Balance(){
		lbl_Total_Balance.click();
	}

	// Hover : Total Balance
	public void hover_lbl_Total_Balance(){
		Actions action = new Actions(driver);
		action.moveToElement(lbl_Total_Balance).build().perform();
	}

	// Visible or not : Total Balance
	public boolean isDisplayed_lbl_Total_Balance(){
		if(lbl_Total_Balance.isDisplayed()){ return true; } else{ return false; }
	}

	// Enabled or not : Total Balance
	public boolean isEnabled_lbl_Total_Balance(){
		if(lbl_Total_Balance.isEnabled()){ return true; } else{ return false; }
	}

	// Get Css attribute : Total Balance
	public String getCssValue_lbl_Total_Balance(String attribute){
		return lbl_Total_Balance.getCssValue(attribute);
	}

	// Get the text : Total Balance
	public String getText_lbl_Total_Balance(){
		return lbl_Total_Balance.getText();
	}

	// Get the value : Total Balance
	public String getValue_lbl_Total_Balance(){
		return lbl_Total_Balance.getAttribute("value");
	}
	// Type : Value 1
	public void type_txt_Value_1(String value){
		txt_Value_1.clear();
		txt_Value_1.sendKeys(value);
	}

	// Click : Value 1
	public void click_txt_Value_1(){
		txt_Value_1.click();
	}

	// Hover : Value 1
	public void hover_txt_Value_1(){
		Actions action = new Actions(driver);
		action.moveToElement(txt_Value_1).build().perform();
	}

	// Visible or not : Value 1
	public boolean isDisplayed_txt_Value_1(){
		if(txt_Value_1.isDisplayed()){ return true; } else{ return false; }
	}

	// Enabled or not : Value 1
	public boolean isEnabled_txt_Value_1(){
		if(txt_Value_1.isEnabled()){ return true; } else{ return false; }
	}

	// Get Css attribute : Value 1
	public String getCssValue_txt_Value_1(String attribute){
		return txt_Value_1.getCssValue(attribute);
	}

	// Get the text : Value 1
	public String getText_txt_Value_1(){
		return txt_Value_1.getText();
	}

	// Get the value : Value 1
	public String getValue_txt_Value_1(){
		return txt_Value_1.getAttribute("value");
	}
	// Type : Value 2
	public void type_txt_Value_2(String value){
		txt_Value_2.clear();
		txt_Value_2.sendKeys(value);
	}

	// Click : Value 2
	public void click_txt_Value_2(){
		txt_Value_2.click();
	}

	// Hover : Value 2
	public void hover_txt_Value_2(){
		Actions action = new Actions(driver);
		action.moveToElement(txt_Value_2).build().perform();
	}

	// Visible or not : Value 2
	public boolean isDisplayed_txt_Value_2(){
		if(txt_Value_2.isDisplayed()){ return true; } else{ return false; }
	}

	// Enabled or not : Value 2
	public boolean isEnabled_txt_Value_2(){
		if(txt_Value_2.isEnabled()){ return true; } else{ return false; }
	}

	// Get Css attribute : Value 2
	public String getCssValue_txt_Value_2(String attribute){
		return txt_Value_2.getCssValue(attribute);
	}

	// Get the text : Value 2
	public String getText_txt_Value_2(){
		return txt_Value_2.getText();
	}

	// Get the value : Value 2
	public String getValue_txt_Value_2(){
		return txt_Value_2.getAttribute("value");
	}
	// Type : Value 3
	public void type_txt_Value_3(String value){
		txt_Value_3.clear();
		txt_Value_3.sendKeys(value);
	}

	// Click : Value 3
	public void click_txt_Value_3(){
		txt_Value_3.click();
	}

	// Hover : Value 3
	public void hover_txt_Value_3(){
		Actions action = new Actions(driver);
		action.moveToElement(txt_Value_3).build().perform();
	}

	// Visible or not : Value 3
	public boolean isDisplayed_txt_Value_3(){
		if(txt_Value_3.isDisplayed()){ return true; } else{ return false; }
	}

	// Enabled or not : Value 3
	public boolean isEnabled_txt_Value_3(){
		if(txt_Value_3.isEnabled()){ return true; } else{ return false; }
	}

	// Get Css attribute : Value 3
	public String getCssValue_txt_Value_3(String attribute){
		return txt_Value_3.getCssValue(attribute);
	}

	// Get the text : Value 3
	public String getText_txt_Value_3(){
		return txt_Value_3.getText();
	}

	// Get the value : Value 3
	public String getValue_txt_Value_3(){
		return txt_Value_3.getAttribute("value");
	}
	// Type : Value 4
	public void type_txt_Value_4(String value){
		txt_Value_4.clear();
		txt_Value_4.sendKeys(value);
	}

	// Click : Value 4
	public void click_txt_Value_4(){
		txt_Value_4.click();
	}

	// Hover : Value 4
	public void hover_txt_Value_4(){
		Actions action = new Actions(driver);
		action.moveToElement(txt_Value_4).build().perform();
	}

	// Visible or not : Value 4
	public boolean isDisplayed_txt_Value_4(){
		if(txt_Value_4.isDisplayed()){ return true; } else{ return false; }
	}

	// Enabled or not : Value 4
	public boolean isEnabled_txt_Value_4(){
		if(txt_Value_4.isEnabled()){ return true; } else{ return false; }
	}

	// Get Css attribute : Value 4
	public String getCssValue_txt_Value_4(String attribute){
		return txt_Value_4.getCssValue(attribute);
	}

	// Get the text : Value 4
	public String getText_txt_Value_4(){
		return txt_Value_4.getText();
	}

	// Get the value : Value 4
	public String getValue_txt_Value_4(){
		return txt_Value_4.getAttribute("value");
	}
	// Type : Value 5
	public void type_txt_Value_5(String value){
		txt_Value_5.clear();
		txt_Value_5.sendKeys(value);
	}

	// Click : Value 5
	public void click_txt_Value_5(){
		txt_Value_5.click();
	}

	// Hover : Value 5
	public void hover_txt_Value_5(){
		Actions action = new Actions(driver);
		action.moveToElement(txt_Value_5).build().perform();
	}

	// Visible or not : Value 5
	public boolean isDisplayed_txt_Value_5(){
		if(txt_Value_5.isDisplayed()){ return true; } else{ return false; }
	}

	// Enabled or not : Value 5
	public boolean isEnabled_txt_Value_5(){
		if(txt_Value_5.isEnabled()){ return true; } else{ return false; }
	}

	// Get Css attribute : Value 5
	public String getCssValue_txt_Value_5(String attribute){
		return txt_Value_5.getCssValue(attribute);
	}

	// Get the text : Value 5
	public String getText_txt_Value_5(){
		return txt_Value_5.getText();
	}

	// Get the value : Value 5
	public String getValue_txt_Value_5(){
		return txt_Value_5.getAttribute("value");
	}
	// Type : Total Balance
	public void type_txt_Total_Balance(String value){
		txt_Total_Balance.clear();
		txt_Total_Balance.sendKeys(value);
	}

	// Click : Total Balance
	public void click_txt_Total_Balance(){
		txt_Total_Balance.click();
	}

	// Hover : Total Balance
	public void hover_txt_Total_Balance(){
		Actions action = new Actions(driver);
		action.moveToElement(txt_Total_Balance).build().perform();
	}

	// Visible or not : Total Balance
	public boolean isDisplayed_txt_Total_Balance(){
		if(txt_Total_Balance.isDisplayed()){ return true; } else{ return false; }
	}

	// Enabled or not : Total Balance
	public boolean isEnabled_txt_Total_Balance(){
		if(txt_Total_Balance.isEnabled()){ return true; } else{ return false; }
	}

	// Get Css attribute : Total Balance
	public String getCssValue_txt_Total_Balance(String attribute){
		return txt_Total_Balance.getCssValue(attribute);
	}

	// Get the text : Total Balance
	public String getText_txt_Total_Balance(){
		return txt_Total_Balance.getText();
	}

	// Get the value : Total Balance
	public String getValue_txt_Total_Balance(){
		return txt_Total_Balance.getAttribute("value");
	}
}