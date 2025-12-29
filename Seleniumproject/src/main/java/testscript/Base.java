package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {
	public WebDriver driver;
	void browserInitialisation() {
		//WebDriver driver= new ChromeDriver();  //interface-webdriver,chrome driver - class
		 driver= new EdgeDriver();
		driver.get("https://selenium.qabible.in/");
	driver.manage().window().maximize();//to maximize window
	//driver.close();//to close parent window
	//driver.quit();//to close all windows
	}
public void closesession() {
	driver.close();
}
	public static void main(String[] args) {
		Base base=new Base();
		base.browserInitialisation();

	}

}
