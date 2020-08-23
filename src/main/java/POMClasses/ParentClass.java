package POMClasses;

import Utilities.DriverClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ParentClass {

    WebDriverWait wait;
    WebDriver driver;

    public ParentClass() {

        driver = DriverClass.getDriver();
        wait = new WebDriverWait(driver, 10);
    }

    public void clickFunctionality(WebElement elementToClick) {

        waitForClick(elementToClick);
        elementToClick.click();
    }

    public void sendKeysFunctionality(WebElement elementToSendKeys, String value) {

        waitForVisible(elementToSendKeys);
        elementToSendKeys.sendKeys(value);

    }

    public void waitForClick(WebElement elementToWait) {

        wait.until(ExpectedConditions.elementToBeClickable(elementToWait));

    }

    public void waitForVisible(WebElement elementToWait) {

        wait.until(ExpectedConditions.visibilityOf(elementToWait));

    }

    public void handleCurrencyDropdown(WebElement dropdownName,String shortMoneyName){

        Select slc = new Select(dropdownName);

        slc.selectByValue(shortMoneyName.toUpperCase());


       //slc.selectByIndex(RandomGenerator(slc.getOptions().size()));

    }
}
