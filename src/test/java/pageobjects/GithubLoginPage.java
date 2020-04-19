package pageobjects;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class GithubLoginPage extends BasePage {
    public GithubLoginPage(WebDriver driver) {
        super(driver);
    }
    
    public boolean assertGithub() {
        return ((driver.getCurrentUrl().contains("github.com")));
        
    }
    
}
