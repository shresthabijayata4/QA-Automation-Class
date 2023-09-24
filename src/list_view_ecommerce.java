import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class list_view_ecommerce {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        String  placeholderUsername = "[placeholder='Username']";
        String  placeholderPassword = "[placeholder='Password']";
        WebElement userName = driver.findElement(By.cssSelector(placeholderUsername));
        WebElement password = driver.findElement(By.cssSelector(placeholderPassword));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        String user = "standard_user";
        String pass = "secret_sauce";
        getUserDetails(userName, password,user, pass );
        loginButton.click();

        List<WebElement> links = driver.findElements(By.className("inventory_item_name"));

        System.out.println("Number of links: " + links.size());

        for (WebElement link : links) {
            System.out.println(link.getText());
        }






    }

    public static  void  getUserDetails( WebElement userName, WebElement password, String User, String Pass) {
        userName.sendKeys(User);
        password.sendKeys(Pass);

    };
}
