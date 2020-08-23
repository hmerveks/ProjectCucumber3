package POMClasses;

import Utilities.DriverClass;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PayBillsPage extends ParentClass {

    public PayBillsPage() {

        PageFactory.initElements(DriverClass.getDriver(), this);  // boyle de yazabilirsin
    }

    @FindBy(partialLinkText = "Pay Bills")
    private WebElement PayBillsButton;

    @FindBy(partialLinkText = "Add New Payee")
    private WebElement AddNewPayeeButton;

    @FindBy(id = "np_new_payee_name")
    private WebElement PayeeNameInput;

    @FindBy(id = "np_new_payee_address")
    private WebElement PayeeAddressInput;

    @FindBy(id = "np_new_payee_account")
    private WebElement AccountInput;

    @FindBy(id = "np_new_payee_details")
    private WebElement PayeeDetailsInput;

    @FindBy(id = "add_new_payee")
    private WebElement AddButton;

    @FindBy(id = "alert_content")
    private WebElement SuccessMessage;

    @FindBy(css = "button[type='button']")
    private WebElement SuccessMessageClosingButton;

    @FindBy(partialLinkText = "Purchase Foreign Currency")
    private WebElement ForeignCurrencyButton;

    @FindBy(xpath = "//select[@id='pc_currency']")
    private WebElement CurrencyDropdown;

    @FindBy(id = "pc_amount")
    private WebElement AmountInput;

    @FindBy(id = "pc_inDollars_true")
    private WebElement USDollarRadioButton;

    @FindBy(id = "pc_inDollars_false")
    private WebElement SelectedRadioButton;

    @FindBy(id = "purchase_cash")
    private WebElement PurchaseButton;


    WebElement myElement;

    public void findElementAndClickFunctionality(String elementName) {

        switch (elementName) {

            case "PayBillsButton":
                myElement = PayBillsButton;
                break;

            case "AddNewPayeeButton":
                myElement = AddNewPayeeButton;
                break;

            case "AddButton":
                myElement = AddButton;
                break;

            case "SuccessMessageClosingButton":
                myElement = SuccessMessageClosingButton;
                break;

            case "ForeignCurrencyButton":
                myElement = ForeignCurrencyButton;
                break;

            case "CurrencyDropdown":
                myElement = CurrencyDropdown;
                break;

            case "USDollarRadioButton":
                myElement = USDollarRadioButton;
                break;

            case "SelectedRadioButton":
                myElement = SelectedRadioButton;
                break;

            case "PurchaseButton":
                myElement = PurchaseButton;
                break;
        }

        clickFunctionality(myElement);

    }

    public void findElementAndSendKeysFunction(String elementName, String value) {

        switch (elementName) {

            case "PayeeNameInput":
                myElement = PayeeNameInput;
                break;

            case "PayeeAddressInput":
                myElement = PayeeAddressInput;
                break;

            case "AccountInput":
                myElement = AccountInput;
                break;

            case "PayeeDetailsInput":
                myElement = PayeeDetailsInput;
                break;

            case "AmountInput":
                myElement = AmountInput;
                break;


        }
        sendKeysFunctionality(myElement, value);
    }

    public void handleAlerts(String whichMessage) {


        Assert.assertTrue(SuccessMessage.getText().contains(whichMessage));

    }

    public void FindElementAndHandleDropdown(String elementName) {

        switch (elementName) {

            case "CurrencyDropdown":
                myElement = CurrencyDropdown;
                break;


        }

        handleDropdown(myElement);
    }
}