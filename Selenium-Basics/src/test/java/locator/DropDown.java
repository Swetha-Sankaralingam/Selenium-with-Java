package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.tools.javac.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		
		//fruits DropDown
		WebElement ele=driver.findElement(By.id("fruits"));
		Select fruits=new Select(ele);
		//get By VISIBLE TEXT
		//fruits.selectByVisibleText("Mango");
		//get By Value
		fruits.selectByValue("2");
		
		//country DropDown
		WebElement country=driver.findElement(By.id("country"));
		Select mycountry=new Select(country);
		mycountry.selectByVisibleText("India");
		WebElement text=mycountry.getFirstSelectedOption();
		System.out.println(text.getText());
		
		//Super hero's dropdown
		WebElement heros=driver.findElement(By.id("superheros"));
		Select multiple=new Select(heros);
		boolean multi=multiple.isMultiple();
		System.out.println("Is Multiple: "+multi);
		
		//Super heros dropdown
		//multiple.selectByIndex("1");
		multiple.selectByIndex(1);
		multiple.selectByVisibleText("The Avengers");
		multiple.selectByValue("bt");
		
		//List<WebElement> allheros=(List<WebElement>) multiple.getAllSelectedOptions();
		
		List<WebElement> alloptions=(List<WebElement>) multiple.getAllSelectedOptions();
		
		for(WebElement i : alloptions){
			System.out.println(i.getText());
		}
		
		
	}

}
