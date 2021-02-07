package testSteps;

import UiPages.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginPageSteps {
    public LoginPage loginPage;

    @Step
    public void isOnLoginPage(){
        loginPage.open();
    }

    @Step
    public void loginToApp(){
        loginPage.login();
    }
}
