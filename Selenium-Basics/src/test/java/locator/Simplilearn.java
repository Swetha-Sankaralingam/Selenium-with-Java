package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Simplilearn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.simplilearn.com/");
		driver.findElement(By.id("header_srch")).sendKeys("java");
		driver.findElement(By.xpath("//*[@id=\"homepage-search-form\"]/form/button[3]/span")).click();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		//driver.findElement(By.xpath("//*[@id=\"search-results\"]/div/ul/li[1]/a/div[2]/div[1]/div[1]/h4")).click();
		// Wait for the page to load
        Thread.sleep(3000); // Temporarily using sleep for demo purposes

        // Locate the first course element
        WebElement courseElement = driver.findElement(By.xpath("//*[@id=\"search_freeCourse\"]/div/div[1]/a/div[1]/h5"));

        // Use JavaScript Executor to click the element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", courseElement);
		String url1=driver.getCurrentUrl();
		String title=driver.getTitle();
		System.out.println(url1);
		System.out.println(title);
	}

}
