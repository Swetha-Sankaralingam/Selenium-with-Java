package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		String url=driver.getCurrentUrl();
		System.out.println("Button Page URL "+url);
		//to make code wait or to slow down the code
		Thread.sleep(3000);
		//click button
		driver.findElement(By.id("home")).click();
		String homeurl=driver.getCurrentUrl();
		System.out.println("home page url "+homeurl);
		Thread.sleep(3000);
		//return to button page
		driver.navigate().back();
		String backurl=driver.getCurrentUrl();
		System.out.println("Button Page URL "+backurl);
		//to refresh the current page
		driver.navigate().refresh();
		driver.navigate().to("https://letcode.in/signin");
		//to go forward
		driver.navigate().forward();
		driver.navigate().to(backurl);
		/*Thread.sleep(3000);
		Navigation nav=driver.navigate();
		nav.back();		
		nav.forward();
		nav.to("https://letcode.in/signin");
		nav.refresh();*/
		driver.quit();
	}

}
