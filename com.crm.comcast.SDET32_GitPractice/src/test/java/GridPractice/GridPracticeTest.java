package GridPractice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridPracticeTest {
	public RemoteWebDriver driver;
	@Parameters("browser")
	@Test
	public void gridPractice(String browser) throws MalformedURLException {
		URL url = new URL("http://localhost:4444/wd/hub");
		DesiredCapabilities cap = new DesiredCapabilities();
		
		if (browser.contains("chrome")) 
		{
			cap.setBrowserName("chrome");	
			driver= new RemoteWebDriver(url, cap);
			System.out.println();
		}
		
		else if (browser.contains("firefox")) 
		{
		
			cap.setBrowserName("firefox");	
			driver= new RemoteWebDriver(url, cap);
		}
		
		
	}
}
