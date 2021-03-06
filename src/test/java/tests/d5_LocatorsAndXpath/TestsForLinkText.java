package tests.d5_LocatorsAndXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilitis.WebDriverFactory;
import utilitis.BrowserUtilities;

public class TestsForLinkText {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/");

        driver.findElement(By.linkText("Autocomplete")).click();
        BrowserUtilities.wait(2);
        driver.quit();
    }
}
