package UiPages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends PageObject {

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "id_order")
    private WebElement orderRef;

    @FindBy(id = "message")
    private WebElement message;

    By subjectHeading = By.id("id_contact");

    By fileUpload = By.id("fileUpload");

    public void enterContactDetails() {
        email.sendKeys("test@automation.com");
        orderRef.sendKeys("1");
        message.sendKeys("this is dummy message");
        element(subjectHeading).selectByVisibleText("Webmaster");
        upload("/users/test/logo.jpg").to(element(fileUpload));
    }

}
