import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Core {
	
	WebDriver dr;
	Core(WebDriver m){
		dr = m;
	}
	Shared sh ;
	public void verifyHomePageLogo(){
		sh= new Shared(dr);
		sh.isElementPresent(dr.findElement(By.xpath("html/body/div[4]/header/section[2]/div/div[1]/a/img")));
		sh.verifyPageTitle("online shopping in Bangladesh for men and women : tangail saree | Brand watch | Brand Shoes ");
	}
	
	public void clickViewCollections(){
		sh= new Shared(dr);
		sh.waitForElement(dr.findElement(By.xpath(".//*[contains(@id,'revslider')]/ul/li[1]/div[5]/a"))).click();
	}
	
	
	

}
