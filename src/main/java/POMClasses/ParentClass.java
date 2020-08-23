package POMClasses;

import Utilities.DriverClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

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


    public void handleDropdown(WebElement dropdownName){

        Select slc = new Select(dropdownName);

        slc.selectByIndex(RandomGenerator(slc.getOptions().size()));

    }

    public int RandomGenerator(int max){

        Random rnd = new Random();

//              max = 2  0 , 1
//              max = 3 0 , 1 ,2
//              max = 2 1 --> 2
//              max = 2-1 = 1 0 +1 = 1
        int randomNum = rnd.nextInt(max-1)+1;

        return randomNum;

    }
}
