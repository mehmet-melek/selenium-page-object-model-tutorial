package tests;

import org.junit.jupiter.api.Test;
import pageobjects.SeleniumHomePage;

public class EditLinkTest extends TestBase {

    @Test
    public void lastUpdateLinkControl(){

        SeleniumHomePage seleniumHomePage = new SeleniumHomePage(driver);

        seleniumHomePage.goToHomePage()
                .goToDocPage()
                .goToGuidelines()
                .goToPom()
                .goToGitHubForLastUpdate()
                .assertGithub();
    }
}
