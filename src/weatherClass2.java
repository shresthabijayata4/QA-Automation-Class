import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class weatherClass2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

//        ------Search Title Keyword ------------
        WebElement search = driver.findElement(By.xpath(" //*[@id=\"APjFqb\"]"));
        search.sendKeys("Today's Weather");
        search.sendKeys(Keys.ENTER );

        WebElement element = driver.findElement(By.xpath(" //a[text()='Change to English']"));
        element.click();



        search = driver.findElement(By.xpath(" //*[@id=\"APjFqb\"]"));

        search.clear();
        search.sendKeys("Tomorrow's Weather");
        search.submit();


        driver.quit();
    }
}
