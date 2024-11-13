package IntroToSelenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class iframeTesting {

  WebDriver driver;

  @Before
  public void setUp(){
    driver = new ChromeDriver();
    driver.get("https://webdriveruniversity.com/IFrame/index.html");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

@Test
  public void clickinlineFrameProducts() throws InterruptedException {

  Thread.sleep(2000);
     //driver.switchTo().frame(0);
     driver.switchTo().frame(driver.findElement(By.id("frame")));
      driver.findElement(By.xpath("//*[text()='Our Products']")).click();

     //these two switchs the driver back to the parent/default frame
      driver.switchTo().defaultContent();
      //or
      driver.switchTo().parentFrame();

  }

}
