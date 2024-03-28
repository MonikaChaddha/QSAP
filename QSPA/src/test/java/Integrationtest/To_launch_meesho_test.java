package Integrationtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class To_launch_meesho_test {
	@Test
	public void demowebshop() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		Thread.sleep(3000);
		driver.quit();
}
}