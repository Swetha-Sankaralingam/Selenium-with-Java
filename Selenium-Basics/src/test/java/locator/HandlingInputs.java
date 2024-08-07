package locator;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/edit");
        driver.manage().window().maximize();
        driver.findElement(By.id("fullName")).sendKeys("Swetha");
        driver.findElement(By.id("join")).sendKeys("person",Keys.TAB);
        String myvalue=driver.findElement(By.id("getMe")).getAttribute("value");
        System.out.println(myvalue);
        driver.findElement(By.id("clearMe")).clear();
        boolean istypeable=driver.findElement(By.id("noEdit")).isEnabled();
        System.out.println(istypeable);
        String read=driver.findElement(By.id("dontwrite")).getAttribute("readonly");
        System.out.println(read);
        driver.quit();
	}

}
