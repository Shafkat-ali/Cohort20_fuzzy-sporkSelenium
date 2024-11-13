package IntroToSelenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumWaitTesting {

  WebDriver driver; //default value of this driver instance is NULL

  @Before
  public void setUp(){
    driver = new ChromeDriver();
    driver.get("https://webdriveruniversity.com/Ajax-Loader/index.html");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));   // implicit wait
  }
        //Thread.sleep(3000);
  @Test
  public void waitingForButton(){

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));  // explicit wait , conditional wait
    WebElement button =  driver.findElement(By.xpath("//*[@id='button1']"));
    wait.until(ExpectedConditions.visibilityOf(button));
    button.click();

    ///////// Thread.sleep(3000);

    FluentWait<WebDriver> fluentWait =
        new FluentWait<>(driver)
            .withTimeout(Duration.ofSeconds(30))
            .pollingEvery(Duration.ofSeconds(5))
            .ignoring(NoSuchElementException.class);

    fluentWait.until(ExpectedConditions.visibilityOf(button));
    button.click();



  }

}
