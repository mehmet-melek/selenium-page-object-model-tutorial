package tests;

import org.junit.jupiter.api.Test;
import pageobjects.SeleniumHomePage;

public class LastUpdateControlTest extends TestBase {

    @Test
    public void lastUpdateLinkTest(){

        SeleniumHomePage seleniumHomePage = new SeleniumHomePage(driver);

        seleniumHomePage.goToHomePage()
                .goToDocPage()
                .goToGuidelines()
                .goToPom()
                .goToGitHubForLastUpdate()
                .assertGithub();
    }
}
