package UiPages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

//@DefaultUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account")
public class LoginPage extends PageObject {

    public void login() {
        shouldBeVisible(By.id("#email"));
        typeInto($("#email"), "test@gmail.com");
        $("#passwd").sendKeys("password");
        $("#SubmitLogin").click();
        //clickOn( $("#SubmitLogin"));
    }

    public void isEmailFieldVisible() {

    }

}
