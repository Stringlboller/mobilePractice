package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MainWelcomePage extends BasePage{

    public MainWelcomePage(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "com.twitter.android:id/primary_action")
    @iOSXCUITFindBy(id = "")
    private MobileElement createAccountBtn;


    public CreateAccountPage clickCreateAccountBtn(){
        click_(createAccountBtn);
        return new CreateAccountPage(driver);
    }



}
