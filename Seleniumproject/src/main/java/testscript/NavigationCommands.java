package testscript;

public class NavigationCommands extends Base{
	public void navigationMethod()//to move to other pages
	{
		driver.navigate().to("https://www.amazon.com/");
			                        //to which page we need to visit give that url
			driver.navigate().back();
	        driver.navigate().forward();
	        driver.navigate().refresh();
	}

	public static void main(String[] args) {
		
		NavigationCommands navigationcommands = new NavigationCommands();
		navigationcommands.browserInitialisation();
		navigationcommands.navigationMethod();
		navigationcommands.closesession();
	}

}
