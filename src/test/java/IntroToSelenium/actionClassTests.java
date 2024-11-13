package IntroToSelenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class actionClassTests {

  WebDriver driver;
  WebDriverWait wait;
  Actions action;

  @Before
  public void setUp(){
    driver = new ChromeDriver();
    action = new Actions(driver);
    driver.get("https://webdriveruniversity.com/Actions/index.html");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    wait = new WebDriverWait(driver, Duration.ofSeconds(30));
  }

  @Test
  public void takingSomeAction() throws InterruptedException {
      //drag and drop

    WebElement source = driver.findElement(By.xpath("//*[@id='draggable']"));
    WebElement target = driver.findElement(By.xpath("//*[@id='droppable']"));
    Thread.sleep(2000);
    action.dragAndDrop(source , target).build().perform();

//double click

   WebElement doubleClickTarget = driver.findElement(By.xpath("//*[@id='double-click']"));
   action.doubleClick(doubleClickTarget).build().perform();

//hover over/ mouse over
  //hover button 1
    WebElement hoverButton1 = driver.findElement(By.xpath("//*[@id='div-hover']/div/button[text()='Hover Over Me First!']"));
      action.moveToElement(hoverButton1).build().perform();
      driver.findElement(By.xpath("//*[@id='div-hover']/div/button[text()='Hover Over Me First!']//following-sibling::div/a")).click();
      System.out.println("Hover button 1 Link 1 alert " + driver.switchTo().alert().getText());
      driver.switchTo().alert().accept();

// hover button 2
    WebElement hoverButton2 = driver.findElement(By.xpath("//*[@id='div-hover']/div/button[text()='Hover Over Me Second!']"));
    action.moveToElement(hoverButton2).build().perform();
    driver.findElement(By.xpath("//*[@id='div-hover']/div/button[text()='Hover Over Me Second!']//following-sibling::div/a")).click();
    System.out.println("Hover button 2 Link 1 alert " + driver.switchTo().alert().getText());
    driver.switchTo().alert().accept();

// hover button 3, alert1
    WebElement hoverButton3 = driver.findElement(By.xpath("//*[@id='div-hover']/div/button[text()='Hover Over Me Third!']"));
    action.moveToElement(hoverButton3).build().perform();
    driver.findElement(By.xpath("//*[@id='div-hover']/div/button[text()='Hover Over Me Third!']//following-sibling::div/a[1]")).click();
    System.out.println("Hover button 3 Link 1 alert " + driver.switchTo().alert().getText());
    driver.switchTo().alert().accept();

    // hover button 3, alert 2
    driver.findElement(By.xpath("//*[@id='div-hover']/div/button[text()='Hover Over Me " +
        "Third!']//following-sibling::div/a[2]")).click();
    System.out.println("Hover button 3 Link 2 alert " + driver.switchTo().alert().getText());
    driver.switchTo().alert().accept();










  }
}
