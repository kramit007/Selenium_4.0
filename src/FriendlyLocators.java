import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;  //By default selenium will not autosuggest static package

import org.openqa.selenium.By;

public class FriendlyLocators {

	public static void main(String[] args) {
//		System.setProperty(webdriver.chrome.driver, "path");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
//		above
		WebElement editBox = driver.findElement(By.xpath("//input[@name=\"name\"]"));
		driver.findElement(with(By.tagName("label")).above(editBox));
		
//		below
		WebElement gender = driver.findElement(By.xpath("//label[@for='exampleFormControlSelect1']"));
		driver.findElement(with(By.tagName("select")).below(gender));
		
//		left
		WebElement iceCreamLabel =driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(iceCreamLabel)).click();

//		right
		WebElement rdb = driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());
		

	}

}
