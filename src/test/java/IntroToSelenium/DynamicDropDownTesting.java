package IntroToSelenium;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DynamicDropDownTesting {

    WebDriver driver;

    @Before
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    @Ignore
    @Test
    public void dropDownMoMoDou(){
        WebElement fromButton = driver.findElement(By.id("fromCity"));
        WebElement toButton = driver.findElement(By.id("toCity"));

        fromButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//input[@type='text'][@autocomplete='off']")).sendKeys("dulles");
        driver.findElement(By.xpath("//p[contains(text(),'Washington-Dulles')]")).click();

        toButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//div[@class='react-autosuggest__container react-autosuggest__container--open']//input[@type='text']")).sendKeys("dallas");
        driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']")).click();
    }


    @Test
    public void dropDownShafkat() throws InterruptedException {
        WebElement fromButton = driver.findElement(By.id("fromCity"));
        WebElement toButton = driver.findElement(By.id("toCity"));

        fromButton.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='text' and @aria-controls='react-autowhatever-1']")).sendKeys("IAD");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//p[contains(text(),'Washington-Dulles')]")).click();


        toButton.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@type='text' and @aria-controls='react-autowhatever-1']")).sendKeys("URU");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//p[contains(text(),'Urumqi, China')]")).click();

    }

}
