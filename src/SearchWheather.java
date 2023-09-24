import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SearchWheather {
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


//        ------get weather data  ------------


        WebElement location = driver.findElement(By.xpath(" //span[@class='BBwThe']"));
        WebElement temperature = driver.findElement(By.id("wob_tm"));

        String ariaLabelToFind = "°Celsius"; // Replace with your desired aria-label value.
        String classNameToFind = "wob_t";
        String cssSelector = "[aria-label='" + ariaLabelToFind + "']." + classNameToFind;
        WebElement Celcius = driver.findElement(By.cssSelector(cssSelector));


        WebElement Day = driver.findElement(By.className("wob_dts"));

        WebElement weatherStatus = driver.findElement(By.id("wob_dc"));


//        ------Display Data------------


        showWeather(temperature, Celcius, Day, weatherStatus  );


//        ------Click on the tomorrow's Wheather ------------

        System.out.println("Location:"+ location.getText());
        String cssWeather = "[data-wob-di= '1']" ;
        WebElement Tomorrow_weather = driver.findElement(By.cssSelector(cssWeather));

        Tomorrow_weather.click();



        showWeather(temperature, Celcius, Day, weatherStatus  );


        driver.quit();


    }
    public static WebElement showWeather( WebElement temperature, WebElement Celcius, WebElement Day, WebElement weatherStatus) {
        System.out.println("Temperature:"+ temperature.getText() + Celcius.getText());
        System.out.println("Day:"+ Day.getText());
        System.out.println("Status:"+ weatherStatus.getText());
        return temperature;
    };





}
