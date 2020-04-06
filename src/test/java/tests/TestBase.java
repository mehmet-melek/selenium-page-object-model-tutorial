package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

    public WebDriver driver;

    @BeforeAll
    public static void setupConfiguration(){
        System.setProperty("webdriver.chrome.driver","/opt/chromedriver");
    }

    @BeforeEach
    public void setupDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @AfterEach
    public void teardown(){
        driver.quit();
    }

}
