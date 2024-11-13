package IntroToSelenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicsOfSelenium {

  WebDriver driver; //default value of this driver instance is NULL

@Before
public void setUp(){
  driver = new ChromeDriver();
  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  driver.manage().window().maximize();

}

@Test
public void basicsOfSelMethods() throws InterruptedException {
   String theTitleOfThePage =  driver.getTitle();
   System.out.println("The Title of the page is here ---> " + theTitleOfThePage);
 //sout is the shortcut to system.out.println
  driver.navigate().to("https://www.youtube.com");
  Thread.sleep(3000);
  theTitleOfThePage =  driver.getTitle();
  System.out.println("The Title of the page2 is here ---> " + theTitleOfThePage);

}

  @Test
  public void getURL() throws InterruptedException {
    String URL =  driver.getCurrentUrl();
    System.out.println("The CURRENT URL of the page is here ---> " + URL);
    driver.navigate().to("https://www.amazon.com");
    Thread.sleep(3000);
    URL =  driver.getCurrentUrl();
    System.out.println("The CURRENT URL of the page2 is here ---> " + URL);
    driver.navigate().back();
    Thread.sleep(3000);
    URL =  driver.getCurrentUrl();
    System.out.println("We should have navigated back to page1, and the URL is ---> " + URL);


  }

  @Ignore
  @Test
  public void pageSource(){
    String pageSource =  driver.getPageSource();
    System.out.println("The page source (HTML DOME)  of the page is here ---> " + pageSource);
  }


  @After
  public void tearDown(){
      driver.close();
  }

}
