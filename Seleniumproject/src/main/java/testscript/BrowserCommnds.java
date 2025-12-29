package testscript;

public class BrowserCommnds extends Base {

	public static void main(String[] args) {
		
		BrowserCommnds browsercommnds =new BrowserCommnds();
		browsercommnds.browserInitialisation();
		browsercommnds.browsercommands();
		browsercommnds.closesession();
		
	}
	public void browsercommands() {
		/*String title=driver.getTitle();
		System.out.println("page title is "+title);*/
		
		/*String Url=driver.getCurrentUrl();
		System.out.println(Url);*/
		String pagesource =driver.getPageSource();
		System.out.println(pagesource);
	}
}
