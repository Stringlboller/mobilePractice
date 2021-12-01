package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    AppiumDriver driver;

    public static final long WAIT = 10;

    public BasePage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void waitForVisibility_(MobileElement element){
        WebDriverWait wait = new WebDriverWait(driver, WAIT);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clear_(MobileElement element){
        waitForVisibility_(element);
        element.clear();
    }

    public void click_(MobileElement element){
        waitForVisibility_(element);
        element.click();
    }

    public void type_(MobileElement element, String textToSend){
        waitForVisibility_(element);
        element.sendKeys(textToSend);
    }

    public String getAttribute_(MobileElement element, String attribute){
        waitForVisibility_(element);
        return element.getAttribute(attribute);
    }

    public String getText_(MobileElement element){
        waitForVisibility_(element);
        return element.getText();
    }

}
