package testmvn;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class HelloWorld {
	
	public WebDriver driver;
	
	@Test
	public void testGoogle() throws Exception
	{
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();
		driver.quit();
	}
	


}
