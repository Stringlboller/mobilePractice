package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccountPage extends BasePage{

    public CreateAccountPage(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "com.twitter.android:id/name_field")
    @iOSXCUITFindBy(id = "")
    private MobileElement nameField;

    @AndroidFindBy(id = "com.twitter.android:id/phone_or_email_field")
    @iOSXCUITFindBy(id = "")
    private MobileElement phoneField;

    @AndroidFindBy(id = "com.twitter.android:id/birthday_field")
    @iOSXCUITFindBy(id = "")
    private MobileElement dateOfBirthField;

    @AndroidFindBy(id = "com.twitter.android:id/cta_button")
    @iOSXCUITFindBy(id = "")
    private MobileElement nextBtn;


    public void setNameField(String name){
        type_(nameField, name);
    }

    public void setPhoneField(String phoneNumber){
        type_(phoneField, phoneNumber);
    }

    public void setDateOfBirth(String dateOfBirth){
        type_(dateOfBirthField, dateOfBirth);
    }

    public void clickNextButton(){
        click_(nextBtn);
    }


}
