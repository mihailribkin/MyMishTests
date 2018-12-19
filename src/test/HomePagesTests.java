package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HomePagesTests extends TestBase{
    @Test
    public void HomePagesTests() throws InterruptedException {
        Thread.sleep(10000);
        waitUntilElementIsLoaded(driver,By.xpath("//span[contains(text(), 'Login')]"), 20);
        List<WebElement> topLinksList = driver.findElements(By.cssSelector(".mat-button-wrapper .mat-button-wrapper"));
        System.out.println("Login:" + topLinksList.get(0).getText());
        System.out.println("Create Account:" + topLinksList.get(1).getText());
        WebElement goToEventsButton = driver.findElement(
                By.className("mat-stroked-button"));
        // System.out.println("Text of button: " + goToEventsButton.getText());
        Thread.sleep(5000);
        Assert.assertTrue(goToEventsButton.getText().equals("Go to Event list"));
    }

    private void waitUntilElementIsLoaded(WebDriver driver, By locator, int time) {
    new WwebDriverWait (driver, time).utilnew(ExcepectedConditions.presecneOFElementLocated(locator);

        }
catch(Exception e) {
        e.printStackTrace();

}

    @Test
    public void goToEventsTest() throws InterruptedException {

        Thread.sleep(10000);
        List<WebElement> topLinksList = driver.findElements(By.cssSelector(".mat-button-wrapper .mat-button-wrapper"));
        System.out.println("Login:" + topLinksList.get(0).getText());
        System.out.println("Create Account:" + topLinksList.get(1).getText());
        WebElement goToEventsButton = driver.findElement(
                By.className("mat-stroked-button"));
        System.out.println("Text of button: " + goToEventsButton.getText());
        Thread.sleep(5000);
        goToEventsButton.click();
        Thread.sleep(5000);
        WebElement titlePage = driver.findElement(By.xpath("//h1[@class='gorisontal-center']"));
        Assert.assertTrue(titlePage.getText().equals("Find event"));
    }
}