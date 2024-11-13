package IntroToSelenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class windowHandlesTesting {

  WebDriver driver;


  @Before
  public void setUp(){
    driver = new ChromeDriver();
    driver.get("https://demoqa.com/browser-windows");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @Test
  public void openAndSwitchHandles1(){
    driver.findElement(By.xpath("//*[@id='tabButton']")).click();
    System.out.println( "Title of the page before switching " + driver.getTitle());

    Set<String> ids =  driver.getWindowHandles();
    Iterator <String> it = ids.iterator();
    String parentID = it.next();
    String childID = it.next();
////////////////////////////////////////
    System.out.println("parent windowHandle ID -> " +parentID);
    System.out.println("child windowHandle ID -> " +childID);
    ////////////////////////////////////////
//switching to child windows
    driver.switchTo().window(childID);
    System.out.println( "Title of the page after switching " + driver.getTitle());
    System.out.println(driver.findElement(By.xpath("//*[@id='sampleHeading']")).getText());

//////////////
    //switching back to parent window
    driver.switchTo().window(parentID);
    System.out.println( "Title of the page after switching back to the parent window " + driver.getTitle());


  }





}
