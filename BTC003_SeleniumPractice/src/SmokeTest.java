import org.junit.Test;

public class SmokeTest extends BaseTest{

	
	Core c;
	
	@Test
	public void siteVerification(){
		c = new Core(dr);
		c.verifyHomePageLogo();
		c.clickViewCollections();
		
		
	}
	@Test
	public void siteVerification1(){
		c = new Core(dr);
		c.verifyHomePageLogo();
		
		
		
	}
	
}
