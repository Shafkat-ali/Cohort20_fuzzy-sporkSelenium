package OrangeHRMTestCases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class login {

  WebDriver driver;

  @Before
  public void setUp(){
    driver = new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  }

  @Test
  public void loginSuccesfullyWithValidCredentials() throws InterruptedException {

     Thread.sleep(5000);
                                //locator           //action
      driver.findElement(By.name("username")).sendKeys("Admin");

      driver.findElement(By.name("password")).sendKeys("admin123");

      driver.findElement(By.xpath("//button")).click();

      Thread.sleep(5000);
  }

  @After
  public void tearDown(){
      driver.close();
  }




}
