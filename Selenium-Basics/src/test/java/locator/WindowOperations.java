package locator;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		//to maximize the window
		driver.manage().window().maximize();
		//to minimize the window
		driver.manage().window().minimize();
		//to go for Fullscreen
		driver.manage().window().fullscreen();
	}

}
