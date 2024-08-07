package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/frame");
		//by using frame(String)
		//driver.switchTo().frame("firstFr");
		//by using xpath
		WebElement  myframe= driver.findElement(By.xpath("//*[@id=\"firstFr\"]"));
		driver.switchTo().frame(myframe);
		driver.findElement(By.name("fname")).sendKeys("swetha");
		driver.findElement(By.name("lname")).sendKeys("Surender");
		WebElement  myframes= driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/div/iframe"));
		driver.switchTo().frame(myframes);
		driver.findElement(By.name("email")).sendKeys("2112036");
		driver.switchTo().parentFrame();
		driver.findElement(By.name("lname")).clear();
		driver.findElement(By.name("lname")).sendKeys("Balaji");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("/html/body/app-root/app-frames/section[1]/div/div/div[2]/app-learning-point/div/footer/a"));
		driver.quit();
	}

}
