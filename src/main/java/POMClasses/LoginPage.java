package POMClasses;

import Utilities.DriverClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends ParentClass {

    private WebDriver driver;

    public LoginPage() {
        driver = DriverClass.getDriver();

        PageFactory.initElements(driver, this);
        //  PageFactory.initElements(DriverClass.getDriver(), this);  // boyle de yazabilirsin
    }

    @FindBy(id = "user_login")
    private WebElement UserNameInput;

    @FindBy(id = "user_password")
    private WebElement PasswordInput;

    @FindBy(css = "input[type='submit']")
    private WebElement SignInButton;


    WebElement myElement;

    public void findElementAndClickFunctionality(String elementName) {

        switch (elementName) {

            case "SignInButton":
                myElement = SignInButton;
                break;


        }

        clickFunctionality(myElement);

    }

    public void findElementAndSendKeysFunction(String elementName, String value) {

        switch (elementName) {

            case "UserNameInput":
                myElement = UserNameInput;
                break;

            case "PasswordInput":
                myElement = PasswordInput;
                break;
        }

        sendKeysFunctionality(myElement, value);
    }
}
