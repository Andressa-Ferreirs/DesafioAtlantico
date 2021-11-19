package baseClass;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import cucumber.api.Scenario;
import support.BrowserFactory;

public class BaseSteps {
	private static WebDriver browser;
	public static Scenario scenario;

	public static void OpenBrowser() throws Throwable {
		if (browser != null)
			return;
	}

	public static void CloseBrowser() throws Throwable {
		WebDriver driver = BrowserFactory.GetBrownser();
        if(driver != null) {
            driver.quit();
            driver = null;
        }

	}

    public static void screenShotNow() {
        try {
            byte[] screenshot = ((TakesScreenshot) BaseSteps.browser).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
            scenario.write("URL ScreenShot: " + BaseSteps.browser.getCurrentUrl());
        } catch (WebDriverException wde) {
            scenario.write("Embed ScreenShot " + wde.getMessage());
        } catch (ClassCastException cce) {
            cce.printStackTrace();
        }
    }
}
