package base;

import java.net.URL;
import java.net.MalformedURLException;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.MainWelcomePage;

import static org.testng.Assert.assertEquals;

public class BrowserStackBase {

    protected AppiumDriver driver;
    protected MainWelcomePage homePage;

    @BeforeClass
    public void setUp() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("browserstack.user","laionking_BVpreo");
        caps.setCapability("browserstack.key","8w54XJUYCxRJkBHJvNJ2");

        caps.setCapability("app","bs://429694a689e61b09c43e493ec23ce27f58463349");

        caps.setCapability("device","Samsung Galaxy A10");
        caps.setCapability("os_version","9.0");

         driver = new AndroidDriver<AndroidElement>(
                new URL("http://hub.browserstack.com/wd/hub"), caps);

         homePage = new MainWelcomePage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }


}
