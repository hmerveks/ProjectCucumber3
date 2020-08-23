package StepDefinition;

import POMClasses.LoginPage;
import POMClasses.PayBillsPage;
import Utilities.DriverClass;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.List;

public class AddNewPayeeSteps {

    LoginPage loginPage = new LoginPage();
    PayBillsPage payBillsPage = new PayBillsPage();

    @Given("^Navigate to website$")
    public void navigate_to_website() {

        WebDriver driver = DriverClass.getDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        driver.manage().window().maximize();

    }


    @And("^Login to website username as \"([^\"]*)\" password as \"([^\"]*)\"$")
    public void login_to_website_username_as_password_as(String username, String password) {

        loginPage.findElementAndSendKeysFunction("UserNameInput", username);
        loginPage.findElementAndSendKeysFunction("PasswordInput", password);
        loginPage.findElementAndClickFunctionality("SignInButton");
    }

    @And("^Click on$")
    public void clickOn(DataTable ElementFromFeature) throws InterruptedException {

        List<String> eachElement = ElementFromFeature.asList(String.class);

        for (int i = 0; i < eachElement.size(); i++) {

            payBillsPage.findElementAndClickFunctionality(eachElement.get(i));
            Thread.sleep(1000);

        }
    }


    @When("^User fill out \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
    public void userFillOutAnd(String PayeeName, String PayeeAddress, String Account, String PayeeDetails) {

        payBillsPage.findElementAndSendKeysFunction("PayeeNameInput",PayeeName);
        payBillsPage.findElementAndSendKeysFunction("PayeeAddressInput",PayeeAddress);
        payBillsPage.findElementAndSendKeysFunction("AccountInput",Account);
        payBillsPage.findElementAndSendKeysFunction("PayeeDetailsInput",PayeeDetails);

        try {
            payBillsPage.findElementAndClickFunctionality("AddButton");

        } catch (TimeoutException exception) {
            System.out.println("you forgot to fill out some space");
        }


    }

    @Then("^\"([^\"]*)\" message should be displayed$")
    public void messageShouldBeDisplayed(String whichMessage) {

        payBillsPage.handleAlerts(whichMessage);
        payBillsPage.findElementAndClickFunctionality("SuccessMessageClosingButton");
    }



}
