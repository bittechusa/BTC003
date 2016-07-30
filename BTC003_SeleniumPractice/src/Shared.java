import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shared {
	
	WebDriver dr;
	
	Shared(WebDriver dr){
		this.dr= dr;
	}
<<<<<<< HEAD
	public void verifyTitle(String t)
	{
		boolean title=dr.getTitle().contains(t);
		System.out.println(title);
	}
=======
	
	public List<WebElement> getElements(String x)
	{
		return dr.findElements(By.xpath(x));
	}
	
	
>>>>>>> 91157dac85a7b029e3479c2da723796d660f4854
	public void type(WebElement ele, String text)
	{
		ele.sendKeys(text);
		//getElements("dfh").get(40).click();
	}
	public WebElement waitForElement(WebElement ele){
		WebDriverWait w = new WebDriverWait(dr, 20);
		w.until(ExpectedConditions.visibilityOf(ele));
		return ele;
	}
	
	public boolean isElementPresent(WebElement ele){
		if(ele.isDisplayed())
		{
			return  true;
		}
		else
			return false;
	}
	public WebElement getElement(String y)
	{
		return dr.findElement(By.xpath(y))
	}
	public void clickElemnt(WebElement ele){
		ele.click();
		//getElement("email").getText();
	}
	
	public boolean verifyPageTitle(String expectedPageTitle){
		String currentPageTitle = dr.getTitle();
		
		if(currentPageTitle.equals(expectedPageTitle))
		{
			return  true;
		}
		else
			return false;
	}
	
	public void verifyPageTitle02(String pageURL){
		String title = dr.getTitle();
		
		if(title.contains(pageURL))
		{
			System.out.println("Title Didn't match");
		}
		else
			System.out.println("Title matched");
	}
	
	//Title, TextPresent, UrlPresent, SendKeys, MouseOver, DropDown, GetText, GetAttribute, 
	

}
