import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public class TestCase1 {

    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");

        // Validating the site logo on top-left
        System.out.println(driver.findElement(By.cssSelector("img[src='/static/images/home/logo.png']")).isDisplayed());

        Driver.quitDriver();
    }
}
