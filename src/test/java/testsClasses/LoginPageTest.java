package testsClasses;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import testSteps.LoginPageSteps;

@RunWith(SerenityRunner.class)
public class LoginPageTest {

    @Managed()
    WebDriver browser;

    @Steps
    LoginPageSteps loginPageSteps;

    @Test
    public void loginTest() {
        loginPageSteps.isOnLoginPage();
        loginPageSteps.loginToApp();
    }
}
