package tests;

import base.BrowserStackBase;
import org.testng.annotations.Test;
import pages.CreateAccountPage;

public class SignUpTest extends BrowserStackBase {


    @Test
    public void CreateAccountTest(){
        CreateAccountPage createAccount = homePage.clickCreateAccountBtn();
        createAccount.setNameField("Programacion");
        createAccount.setPhoneField("+5493515602826");
        createAccount.setDateOfBirth("September 22, 1997");
        createAccount.clickNextButton();

        // The asserts not found because we need to switch

    }

}
