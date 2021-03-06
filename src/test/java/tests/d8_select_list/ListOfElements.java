package tests.d8_select_list;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilitis.WebDriverFactory;

import java.util.List;

public class ListOfElements {

    @Test
    public void test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

       List<WebElement> buttons=driver.findElements(By.tagName("button"));

        System.out.println(buttons.size());
        Assert.assertEquals(buttons.size(),6);

        for(WebElement button:buttons){
            System.out.println(button.getText());
        }
    }
    @Test
    public void test2(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        List <WebElement> button= driver.findElements(By.tagName("buttton"));
        System.out.println(button.size());
    }
}
