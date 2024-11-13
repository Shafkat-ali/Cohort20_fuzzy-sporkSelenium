package IntroToSelenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class arrayOfProductsList {

  WebDriver driver;
  WebDriverWait wait;

  @Before
  public void setUp(){
    driver = new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    driver.findElement(By.name("username")).sendKeys("Admin");
    driver.findElement(By.name("password")).sendKeys("admin123");
    driver.findElement(By.xpath("//button")).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text() = 'Dashboard']")));
  }

  @Test
  public void clickingValidationList(){
    clickMainManuOption("PIM");
    profileDropDownMenu("Logout");
  }

  public void clickMainManuOption(String eachItem) {
    List<WebElement> leftMainMenuOptions = driver.findElements(By.xpath("//ul[@class='oxd-main-menu']/li"));
    for (WebElement option : leftMainMenuOptions) {
      if (option.getText().equals(eachItem)) {
        option.click();
        break;
      }
    }
  }

  public static void profileDropDownMenu(String profileOption){

    //implement code here
  }

}
