package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	protected static WebDriver browser;
	
	private static enum Browser {
		CHROME, FIREFOX
	}

	public static WebDriver GetBrownser() {
	 if(browser == null){
            browser = GetBrownser(Browser.FIREFOX); // Browser Default
        }
        return browser;
	}
	
	

	private static WebDriver GetBrownser(Browser browserUser) {
		WebDriver resultBrowser;
//		 System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\webDrivers\\chromedriver.exe");
		System.setProperty("webdriver.firefox.marionette", "src\\main\\resources\\webDrivers\\geckodriver.exe");

		switch (browserUser) {
		case CHROME:
			resultBrowser = new ChromeDriver();
			resultBrowser.manage().window().maximize();
			break;
		
		case FIREFOX:
			resultBrowser = new FirefoxDriver();
			resultBrowser.manage().window().maximize();
			break;
		
		default:
			resultBrowser = null;
			new Exception("Browser Nao Suportado");
		}

		return resultBrowser;
	}

}
