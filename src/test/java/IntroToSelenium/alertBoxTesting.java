package IntroToSelenium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class alertBoxTesting {

  WebDriver driver;

  @Before
  public void setUp(){
    driver = new ChromeDriver();
    driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @Test
  public void validateJavascriptAlertBoxes() throws InterruptedException {

    driver.findElement(By.xpath("//h2[text() = 'JavaScript Alert']//following-sibling::div//span")).click();
    Thread.sleep(2000);
    String alertBox1Text = driver.switchTo().alert().getText();
    Assert.assertEquals("I am an alert box!", alertBox1Text);
    driver.switchTo().alert().accept();




    driver.findElement(By.xpath("//h2[text() = 'JavaScript Confirm Box']//following-sibling::div//span")).click();
    Thread.sleep(2000);
    String alertBox2Text = driver.switchTo().alert().getText();
    Assert.assertEquals("Press a button!", alertBox2Text);
    driver.switchTo().alert().accept();

    String actualAlertConfirmation = driver.findElement(By.xpath("//*[@id='confirm-alert-text']")).getText();
    String expectedAlertConfirmation = "You pressed OK!";
    Assert.assertEquals(expectedAlertConfirmation, actualAlertConfirmation);

  }

}
