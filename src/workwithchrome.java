import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class workwithchrome {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        //*[@id="APjFqb"]
        WebElement search = driver.findElement(By.xpath(" //*[@id=\"APjFqb\"]"));
        search.sendKeys("Test");

        search.sendKeys(Keys.ENTER );
        System.out.println("hello");
        driver.quit();
    }
}
