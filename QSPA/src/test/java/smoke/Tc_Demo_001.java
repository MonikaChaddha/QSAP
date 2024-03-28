package smoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc_Demo_001 {
	@Test
	public void demowebshop() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demowebshop.tricentis.com/");
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.quit();
	}
}
