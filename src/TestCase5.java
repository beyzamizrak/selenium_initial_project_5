import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.Waiter;

public class TestCase5 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");

        WebElement testCases = driver.findElement(By.xpath("(//ul//li)[5]/a"));
// driver.findElement(By.xpath("(//div[@class='shop-menu pull-right']/ul/li)[5]/a")); -> this code doesnt work!!
        testCases.click();
        Waiter.pause(3);

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        Driver.quitDriver();
    }
}
