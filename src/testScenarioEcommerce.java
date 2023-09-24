import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class testScenarioEcommerce {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");


       String  placeholderUsername = "[placeholder='Username']";
        String  placeholderPassword = "[placeholder='Password']";
        WebElement userName = driver.findElement(By.cssSelector(placeholderUsername));
        WebElement password = driver.findElement(By.cssSelector(placeholderPassword));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        boolean loggedIn = false;

        while (!loggedIn) {
            userName = driver.findElement(By.cssSelector(placeholderUsername));
            password = driver.findElement(By.cssSelector(placeholderPassword));
            userName.clear();
            password.clear();
            getInput(userName, password, loginButton);

            if (driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html")) {
                System.out.println("Login successful!");
                loggedIn = true;
            } else {

                System.out.println("Login failed. Please try again.");

//                userName = driver.findElement(By.cssSelector(placeholderUsername));
//                password = driver.findElement(By.cssSelector(placeholderPassword));
//                userName.clear();
//                password.clear();
//             getInput(userName, password, loginButton);

            }
        }

    }

    public static String getInput(WebElement userName, WebElement password, WebElement loginButton) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String user = scanner.nextLine();
        System.out.print("Enter your password: ");
        String pass = scanner.nextLine();
        scanner.close();

        userName.sendKeys(user);
        password.sendKeys(pass);

        loginButton.click();
       return user;

    };


    //    public static WebElement getUserDetails( WebElement userName, WebElement password, String User, String Pass) {
//        userName.sendKeys(User);
//        password.sendKeys(Pass);
//        return userName;
//
//    };
}
