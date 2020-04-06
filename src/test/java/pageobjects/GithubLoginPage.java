package pageobjects;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;


public class GithubLoginPage extends BasePage {
    public GithubLoginPage(WebDriver driver) {
        super(driver);
    }

    public void assertGithub(){
        Assertions.assertTrue(driver.getCurrentUrl().contains("github.com"));
    }

}
