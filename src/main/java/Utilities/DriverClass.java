package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverClass {

    private static WebDriver driver;

    static String browserName = "chrome";
    public static WebDriver getDriver(){

        if(driver==null){

            if(browserName.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup(); // webdrivermanager bonigarciadan geliyor
                driver = new ChromeDriver();
            }else if(browserName.equalsIgnoreCase("firefox")){
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
        }
        return driver;
    }
}
