import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;



import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import java.util.List;
        import java.util.Scanner;

public class testCaseSwagWeb {
    //    static WebDriver driver = new ChromeDriver();
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));



        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");


//        -------Invalid username invalid password -------

//        userDetails("test", "test", driver);
//        userDetails("standard_user", "test", driver);
//        userDetails("locked_out_user", "", driver);
//        userDetails("hello_test", "secret_sauce", driver);
//
        userDetails("standard_user", "secret_sauce", driver);




//        -------valid username invalid password -------



//
        listOutLink(driver);

//        dropdownSelect(1, driver);
//        dropdownSelect( 2, driver);
//        dropdownSelect( 3, driver);


//        WebElement cart1 = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
//
////        addToCart(cart1);
//        cart1.click();


    }
    public static void userDetails( String user, String pass, WebDriver driver){
        String placeholderUsername = "[placeholder='Username']";
        String placeholderPassword = "[placeholder='Password']";
        WebElement userName = driver.findElement(By.cssSelector(placeholderUsername));
        WebElement password = driver.findElement(By.cssSelector(placeholderPassword));
        WebElement Error = driver.findElement(By.className("error-message-container"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        getUserDetails(userName, password, user, pass);
        loginButton.click();
        System.out.println("Error message" +Error.getText());
        clearForm(userName, password, Error);
    }

    public static void getUserDetails(WebElement userName, WebElement password, String User, String Pass) {
        userName.sendKeys(User);
        password.sendKeys(Pass);

    }


    ;

    public static void clearForm(WebElement userName, WebElement password, WebElement Error) {
        System.out.println("Error message" +Error.getText());
        userName.sendKeys(Keys.CONTROL, "a");
        userName.sendKeys(Keys.BACK_SPACE);
        password.sendKeys(Keys.CONTROL, "a");
        password.sendKeys(Keys.BACK_SPACE);


    }

    public static void dropdownSelect (Integer optionNumber, WebDriver driver ){


        WebElement dropdown = driver.findElement(By.className("product_sort_container"));
        Select select = new Select(dropdown);

        select.selectByIndex(optionNumber);



    }

    public static void addToCart(WebElement cart1){


        cart1.click();
    }

    public static void listOutLink(WebDriver driver){
        List<WebElement> links = driver.findElements(By.className("inventory_item_name"));

        System.out.println("Number of links: " + links.size());


        for (WebElement link : links) {
            System.out.println(link.getText());
        }

    }



//    public static void logout() {
//
//        WebElement menuBurger = driver.findElement(By.id("react-burger-menu-btn"));
//        menuBurger.click();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//       WebElement logout = driver.findElement(By.id("logout_sidebar_link"));
//        logout.click();
//        System.out.println("Logged Out");
//
//
//       logout.click();

//    }



}

