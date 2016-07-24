import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseTest {
	
	WebDriver dr;
	
	@Before
	public void start() throws IOException{
		FileInputStream f=new FileInputStream("config.properties");
		Properties p=new Properties();
		p.load(f);
		if(p.getProperty("browserName").equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "/Users/bittech/Desktop/Driver/chromedriver");
			dr = new ChromeDriver();
		}
		else if(p.getProperty("browserName").equals("firefox")){
			dr = new FirefoxDriver();
		}
		
		else if (p.getProperty("browserName").equals("internetExplorer")) {
			System.setProperty("webdriver.chrome.driver", "/Users/bittech/Desktop/Driver/chromedriver");
			dr = new InternetExplorerDriver();
		}
		
		dr.get(p.getProperty("url"));
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@After
	public void end(){
		dr.quit();
	}

}
