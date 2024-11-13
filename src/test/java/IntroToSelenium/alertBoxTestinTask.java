package IntroToSelenium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class alertBoxTestinTask {


  WebDriver driver;
  WebDriverWait wait;
  JavascriptExecutor js;

  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    driver.get("https://demoqa.com/alerts");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    wait = new WebDriverWait(driver, Duration.ofSeconds(30));
  }


  @Test
  public void validateJavascriptAlertBoxes() throws InterruptedException {


    js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.id("alertButton")));
    //first alert box
    driver.findElement(By.id("alertButton")).click();
    wait.until(ExpectedConditions.alertIsPresent());
    String alertBox1Text = driver.switchTo().alert().getText();
    Assert.assertEquals("You clicked a button", alertBox1Text);
    driver.switchTo().alert().accept();

    js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.id("timerAlertButton")));
    //second alertbox
    driver.findElement(By.id("timerAlertButton")).click();
      ///explicitly wait for the alert to be present.. it says 5 seconds
    wait.until(ExpectedConditions.alertIsPresent());

    String alertBox2Text = driver.switchTo().alert().getText();
    Assert.assertEquals("This alert appeared after 5 seconds", alertBox2Text);
    driver.switchTo().alert().accept();


    js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.id("confirmButton")));
    //third alertbox
    driver.findElement(By.id("confirmButton")).click();
    wait.until(ExpectedConditions.alertIsPresent());
    String alertBox3Text = driver.switchTo().alert().getText();
    Assert.assertEquals("Do you confirm action?", alertBox3Text);
    driver.switchTo().alert().accept();
    String actualAlertConfirmation = driver.findElement(By.id("confirmResult")).getText();
    String expectedAlertConfirmation = "You selected Ok";
    Assert.assertEquals(expectedAlertConfirmation, actualAlertConfirmation);


    js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.id("promtButton")));
    //four alertbox
    driver.findElement(By.id("promtButton")).click();
//    js.executeScript("arguments[0].click();", element);
    wait.until(ExpectedConditions.alertIsPresent());
    driver.switchTo().alert().sendKeys("TechCircle");
    driver.switchTo().alert().accept();
    String actualAlertPromptResult = driver.findElement(By.id("promptResult")).getText();
    Assert.assertTrue(actualAlertPromptResult.contains("TechCircle"));



  }


}
