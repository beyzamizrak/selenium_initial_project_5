import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import java.util.Date;

public class TestCase4 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");

       WebElement footer =  driver.findElement(By.cssSelector("p[class='pull-left']"));

        System.out.println(footer.getText());
        System.out.println(footer.isDisplayed());

        Driver.quitDriver();



    }
}
