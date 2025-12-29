package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelector extends Base{
	        //1.Tag and ID(tag#id)
			//2.Tag and class(tag.class)
			//3.Tag and Attribute(tag[attribute=value]
			//4.Tag,class,and Attribute(tag.classname[attribute=value]
public void  tagAndId()
{
	WebElement tagid= driver.findElement(By.cssSelector("input#single-input-field"));
	WebElement tagid1= driver.findElement(By.cssSelector("input#value-a"));
	WebElement tagid2= driver.findElement(By.cssSelector("input#value-b"));
	WebElement tagid3= driver.findElement(By.cssSelector("button#button-two"));
	WebElement tagid4= driver.findElement(By.cssSelector("button#button-one"));
	WebElement tagid5= driver.findElement(By.cssSelector("button#button-one"));
}
public void tagAndClass() {
	
}
public void tagAndAttribute() {
	
}
public void tagAndClassAndAttribute() {
	
}
public static void main(String[] args) {
		
	CssSelector cssselector= new CssSelector();
	cssselector.browserInitialisation();
	cssselector.tagAndId();
	}

}
