package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SeleniumDocPage extends BasePage {
    public SeleniumDocPage(WebDriver driver) {
        super(driver);
    }
    
    By guidlineslink    = By.xpath("//a[contains(text(),'Guidelines')]");
    By pomLink          = By.xpath("//a[contains(text(),'Page object models')]");
    By lastUpdateButton = By.xpath("//a[@class='highlight' and contains(text(),'Modify:')]");
    
    
    public SeleniumDocPage goToGuidelines() {
        waitUntilVisible(guidlineslink);
        click(guidlineslink);
        return this;
    }
    
    public SeleniumDocPage goToPom() {
        waitUntilVisible(pomLink);
        click(pomLink);
        return this;
    }
    
    public GithubLoginPage goToGitHubForLastUpdate() {
        pageDown();
        waitUntilVisible(lastUpdateButton);
        click(lastUpdateButton);
        return new GithubLoginPage(driver);
    }
    
    
}
