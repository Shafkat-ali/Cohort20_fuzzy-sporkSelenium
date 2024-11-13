package IntroToSelenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RadioButtonsTesting {

  WebDriver driver;

  @Before
  public void setUp(){
    driver = new ChromeDriver();
    driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }



    @Test
    public void radioVerification(){
      String Color ="Yellow";
      WebElement GreenRadioBtn=driver.findElement(By.xpath("//form[@id='radio-buttons']/input[1]"));
      WebElement BlueRadioBtn=driver.findElement(By.xpath("//form[@id='radio-buttons']/input[2]"));
      WebElement YellowRadioBtn=driver.findElement(By.xpath("//form[@id='radio-buttons']/input[3]"));
      WebElement OrangeRadioBtn=driver.findElement(By.xpath("//form[@id='radio-buttons']/input[4]"));
      WebElement PurpleRadioBtn=driver.findElement(By.xpath("//form[@id='radio-buttons']/input[5]"));

    // String radioButtonColor =  GreenRadioBtn.getAttribute("value");
      //

      switch(Color){
        case("Green"):
          if(!GreenRadioBtn.isSelected()){
            GreenRadioBtn.click();
          }
          break;
        case("Blue"):
          if(!BlueRadioBtn.isSelected()){
            BlueRadioBtn.click();
          }
          break;
        case("Yellow"):
          if(!YellowRadioBtn.isSelected()){
            YellowRadioBtn.click();
          }
          break;
        case("Orange"):
          if(!OrangeRadioBtn.isSelected()){
            OrangeRadioBtn.click();
          }
          break;
        case("Purple"):
          if(!PurpleRadioBtn.isSelected()){
            PurpleRadioBtn.click();
          }
          break;

      }

    }






  }

