import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");


        String  placeholderUsername = "[placeholder='Username']";
        String  placeholderPassword = "[placeholder='Password']";
        WebElement userName = driver.findElement(By.cssSelector(placeholderUsername));
        WebElement password = driver.findElement(By.cssSelector(placeholderPassword));
        WebElement loginButton = driver.findElement(By.id("login-button"));


//        -------Invalid username invalid password -------

        String user = "test";
        String pass = "test";
        getUserDetails(userName, password,user, pass );
        loginButton.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


//        -------valid username invalid password -------



        clearForm(userName, password);
                 user = "";
                 pass = "";

                 getUserDetails(userName, password,user, pass );
                 loginButton.click();
                 try {
                 Thread.sleep(2000);
                 } catch (InterruptedException e) {
                 e.printStackTrace();
                 }

        clearForm(userName, password);
                 user = "";
                 pass = "test";

                 getUserDetails(userName, password,user, pass );
                 loginButton.click();
                 try {
                 Thread.sleep(2000);
                 } catch (InterruptedException e) {
                 e.printStackTrace();
                 }


    clearForm(userName, password);
         user = "standard_user";
                 pass = "test";

                 getUserDetails(userName, password,user, pass );
                 loginButton.click();
                 try {
                 Thread.sleep(2000);
                 } catch (InterruptedException e) {
                 e.printStackTrace();
                 }

//        -------Empty username empty password -------

        clearForm(userName, password);
                 user = "";
                 pass = "";

                 getUserDetails(userName, password,user, pass );
                 loginButton.click();
                 try {
                 Thread.sleep(2000);
                 } catch (InterruptedException e) {
                 e.printStackTrace();
                 }

//        -------empty username invalid password -------

                 clearForm(userName, password);
                 user = "";
                 pass = "test";

                 getUserDetails(userName, password,user, pass );
                 loginButton.click();
                 try {
                 Thread.sleep(2000);
                 } catch (InterruptedException e) {
                 e.printStackTrace();
                 }

//        -------valid username empty password -------

                 clearForm(userName, password);
                 user = "locked_out_user";
                 pass = "";

                 getUserDetails(userName, password,user, pass );
                 loginButton.click();
                 try {
                 Thread.sleep(2000);
                 } catch (InterruptedException e) {
                 e.printStackTrace();
                 }

//        -------Invalid username valid password -------

                 clearForm(userName, password);
                 user = "hello_test";
                 pass = "secret_sauce";

                 getUserDetails(userName, password,user, pass );
                 loginButton.click();
                 try {
                 Thread.sleep(2000);
                 } catch (InterruptedException e) {
                 e.printStackTrace();
                 }

//        -------space username space password -------

                 clearForm(userName, password);
                 user = " ";
                 pass = " ";

                 getUserDetails(userName, password,user, pass );
                 loginButton.click();
                 try {
                 Thread.sleep(2000);
                 } catch (InterruptedException e) {
                 e.printStackTrace();
                 }

//        -------valid username valid password -------

                 clearForm(userName, password);
                 user = "standard_user";
                 pass = "secret_sauce";

                 getUserDetails(userName, password,user, pass );
                 loginButton.click();
                 try {
                 Thread.sleep(2000);
                 } catch (InterruptedException e) {
                 e.printStackTrace();
                 }

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
    public static void clearForm(WebElement userName, WebElement password) {

        userName.sendKeys(Keys.CONTROL,"a");
        userName.sendKeys(Keys.BACK_SPACE);
        password.sendKeys(Keys.CONTROL,"a");
        password.sendKeys(Keys.BACK_SPACE);



    };

}
