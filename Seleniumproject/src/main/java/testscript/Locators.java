package testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
	public void id() {
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	
	//WebElement webelementname=driver.findElement(By.locator("locator value"));
	//web element declaration syntax
	WebElement wb=driver.findElement(By.id("single-input-field"));
	wb.sendKeys("Helloo");
	WebElement showmessage=driver.findElement(By.id("button-one"));
	showmessage.click();
	WebElement A = driver.findElement(By.id("value-a"));
	WebElement B=driver.findElement(By.id("value-b"));
	WebElement c=driver.findElement(By.id("message-two"));
	}
	
public void name() {
	WebElement name1= driver.findElement(By.name("description"));
	WebElement name2=driver.findElement(By.name("keywords"));
	WebElement name3=driver.findElement(By.name("author"));
	WebElement name4=driver.findElement(By.name("viewport"));
}
public void classname()
{
	WebElement cname= driver.findElement(By.className(null));
	
}
	public void linktext() {
		WebElement linktxt1=driver.findElement(By.linkText("Radio Buttons Demo"));
		WebElement linktxt2=driver.findElement(By.linkText("Checkbox Demo"));
		WebElement linktxt3 =driver.findElement(By.linkText("Select Input"));
		WebElement linktxt4 =driver.findElement(By.linkText("Ajax Form Submit"));
	}
	public void partialtext() {
		WebElement parlinktxt1=driver.findElement(By.partialLinkText("Radio B"));
		WebElement parlinktxt2=driver.findElement(By.partialLinkText("Checkbox"));
		WebElement parlinktxt3=driver.findElement(By.partialLinkText("Ajax Form "));
		WebElement parlinktxt4=driver.findElement(By.partialLinkText("Jquery Se"));
	}
	public void tagname() {
		List<WebElement> tagnme= driver.findElements(By.tagName("a"));
		List<WebElement> tagnme1=driver.findElements(By.tagName("b"));
	}
	
public static void main(String[] args) {
		Locators locators= new Locators();
		locators.browserInitialisation();
		locators.id();
		locators.name();

	}

}
