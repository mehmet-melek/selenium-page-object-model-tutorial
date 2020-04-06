package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {


    public WebDriver driver;
    public WebDriverWait driverWait;


    public BasePage (WebDriver driver){
        this.driver = driver;
        driverWait = new WebDriverWait(driver,15);
    }

    public void waitUntillVisible(By elementBy){
        driverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    public void click (By elementBy){
        waitUntillVisible(elementBy);
        driver.findElement(elementBy).click();
    }

    public void sendKeys (By elementBy, String text){
        waitUntillVisible(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }

    public String readText(By elementBy){
        waitUntillVisible(elementBy);
        return driver.findElement(elementBy).getText();
    }

    public void pageDown(){
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
    }

}
