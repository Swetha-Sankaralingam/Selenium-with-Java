package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		WebElement ele=driver.findElement(By.id("position"));
		Point point = ele.getLocation();
		System.out.println("Position of X "+point.getX());
		System.out.println("Position of Y "+point.getY());
		String css=driver.findElement(By.id("color")).getCssValue("color");
		System.out.println(css);
		Dimension size=ele.getSize();
		System.out.println("Width "+size.getWidth()+" ,Height "+size.getWidth());
		System.out.println("Enable or not "+driver.findElement(By.id("isDisabled")).isEnabled());
		System.out.println("Colour of the button : "+driver.findElement(By.id("property")).getText());
		System.out.println("Tag Name of the button: "+driver.findElement(By.id("property")).getTagName());
		driver.quit();
	}
}
