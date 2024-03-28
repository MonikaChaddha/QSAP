	package Integrationtest;
	
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
	
	public class Tc_Demo_001_test {
		@Test
	public void run() throws InterruptedException {
		String url=System.getProperty("url");
		System.out.println(url);
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get(url);
		Thread.sleep(3000);
		
	}
	
	}
