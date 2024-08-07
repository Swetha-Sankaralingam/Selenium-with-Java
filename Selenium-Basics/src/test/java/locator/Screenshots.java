package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/alert");
		driver.manage().window().maximize();
		/*
		 *full page screenshot
		 * File firstsrc=driver.getScreenshotAs(OutputType.FILE);
		File destination=new File("./snaps/img.png");
		FileUtils.copyFile(firstsrc, destination);
		
		//element screenshot
		WebElement ele=driver.findElement(By.id("home"));
		File elesrc=ele.getScreenshotAs(OutputType.FILE);
		File eledest=new File("./snaps/img1.png");
		FileUtils.copyFile(elesrc, eledest);
		
		//Section screenshot
		WebElement sec=driver.findElement(By.xpath("/html/body/app-root/app-buttons/section[1]/div/div/div[2]/app-learning-point/div/div"));
		File secstr=sec.getScreenshotAs(OutputType.FILE);
		File secdest=new File("./snaps/img2.png");
		FileUtils.copyFile(secstr, secdest);*/
		
		//Alert
		//accept
		/*driver.findElement(By.id("accept")).click();
		Alert alret=driver.switchTo().alert();
		String text=alret.getText();
		System.out.println("SimpleAlret text "+text);
		alret.accept();
		driver.quit();*/
		
		//dismiss
		/*driver.findElement(By.id("confirm")).click();
		Alert alert=driver.switchTo().alert();
		String text1=alert.getText();
		System.out.println("SimpleAlret text "+text1);
		alert.dismiss();
		driver.quit(); */
		
		//prompt alert(sendKeys)
		driver.findElement(By.id("prompt")).click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Swetha");
		alert.accept();
		String name=driver.findElement(By.id("myName")).getText();
		System.out.println(name);
	}

}
