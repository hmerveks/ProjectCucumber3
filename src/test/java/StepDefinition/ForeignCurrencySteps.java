package StepDefinition;

import POMClasses.ParentClass;
import POMClasses.PayBillsPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ForeignCurrencySteps extends ParentClass {

    PayBillsPage payBillsPage = new PayBillsPage();




    @When("^User fill out \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void userFillOut(String Currency, String Amount, String RadioButton){
        payBillsPage.FindElementAndHandleDropdown(Currency);
        payBillsPage.findElementAndSendKeysFunction("AmountInput",Amount);
        payBillsPage.findElementAndClickFunctionality(RadioButton);


    }
}
