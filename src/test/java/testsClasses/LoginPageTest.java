package testsClasses;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import testSteps.LoginPageSteps;

@RunWith(SerenityRunner.class)
public class LoginPageTest {

    @Managed(uniqueSession = true)
    WebDriver browser;

    @Steps
    LoginPageSteps loginPageSteps;

    @Test
    public void loginTest() {
        loginPageSteps.isOnLoginPage();
        loginPageSteps.loginToApp();
    }

    @Pending
    @Test
    public void pending(){

    }
}
