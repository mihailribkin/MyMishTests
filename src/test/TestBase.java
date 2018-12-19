package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestBase {
    WebDriver driver = new ChromeDriver();
    @BeforeMethod
    public void initWebDriver(){
        driver.get("https://mish.sheygam.com/#/wellcome");
        driver.manage().window().maximize();
    }
    @AfterSuite
    public void tearDown(){
        driver.quit();

    }
}
