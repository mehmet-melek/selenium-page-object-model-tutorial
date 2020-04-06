package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumHomePage extends BasePage {

    public SeleniumHomePage(WebDriver driver) {
        super(driver);
    }

    String seleniumHomePageURL ="http://www.selenium.dev/";
    By docButton = By.xpath("//a[@class='nav-item' and text()='Documentation']");

    public SeleniumHomePage goToHomePage(){
        driver.get(seleniumHomePageURL);
        return this;
    }

    public SeleniumDocPage goToDocPage(){
        click(docButton);
        return new SeleniumDocPage(driver);
    }

}
