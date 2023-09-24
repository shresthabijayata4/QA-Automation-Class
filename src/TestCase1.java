import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class TestCase1 {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        String pageTitle = driver.getTitle();
        System.out.println("Title of the page: " + pageTitle);
        //*[@id="APjFqb"]
        WebElement search = driver.findElement(By.xpath(" //*[@id=\"APjFqb\"]"));
        search.sendKeys("Selenium");

        search.sendKeys(Keys.ENTER );

        driver.quit();
    }
}
