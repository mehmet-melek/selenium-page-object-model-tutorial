package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.BaseTest;

public class BasePage {


    public WebDriver webDriver;
    public WebDriverWait webDriverWait;


    public BasePage (WebDriver webDriver){
        this.webDriver=webDriver;
        webDriverWait= new WebDriverWait(webDriver,15);
    }

    public void waitUntillVisible(By elementBy){
        webDriverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    public void click (By elementBy){
        waitUntillVisible(elementBy);
        webDriver.findElement(elementBy).click();
    }

    public void sendKeys (By elementBy, String text){
        waitUntillVisible(elementBy);
        webDriver.findElement(elementBy).sendKeys(text);
    }

    public String readText(By elementBy){
        waitUntillVisible(elementBy);
        return webDriver.findElement(elementBy).getText();
    }
}
