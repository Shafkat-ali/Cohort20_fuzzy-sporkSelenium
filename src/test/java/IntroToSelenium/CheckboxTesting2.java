package IntroToSelenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CheckboxTesting2 {


  WebDriver driver;

  @Before
  public void setUp(){
    driver = new ChromeDriver();
    driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @Test
  public void fourCheckboxValidation() throws InterruptedException {

    WebElement checkboxOption1 = driver.findElement(By.xpath("//div[@id='checkboxes']/label[1]/input"));
    Boolean checkBoxOption1Status =  checkboxOption1.isSelected();

    if(checkBoxOption1Status == false){
      System.out.println("Checkbox box Option 1" + " Is not checked, hence we will check");
      Thread.sleep(3000);
      checkboxOption1.click();
    }else{
      System.out.println("Checkbox box Option 1" + " already selected");
      Thread.sleep(3000);
      checkboxOption1.click();
    }

    WebElement checkboxOption2 = driver.findElement(By.xpath("//div[@id='checkboxes']/label[2]/input"));
    Boolean checkBoxOption2Status =  checkboxOption2.isSelected();

    if(checkBoxOption2Status == false){
      System.out.println("Checkbox box Option 2" + " Is not checked, hence we will check");
      Thread.sleep(3000);
      checkboxOption2.click();
    }else{
      System.out.println("Checkbox box Option 2" + " already selected");
      Thread.sleep(3000);
      checkboxOption2.click();
    }


    WebElement checkboxOption3 = driver.findElement(By.xpath("//div[@id='checkboxes']/label[3]/input"));
    Boolean checkBoxOption3Status =  checkboxOption3.isSelected();

    if(checkBoxOption3Status == false){
      System.out.println("Checkbox box Option 3" + " Is not checked, hence we will check");
      Thread.sleep(3000);
      checkboxOption3.click();
    }else{
      System.out.println("Checkbox box Option 3" + " already selected");
    }

    WebElement checkboxOption4 = driver.findElement(By.xpath("//div[@id='checkboxes']/label[4]/input"));
    Boolean checkBoxOption4Status =  checkboxOption4.isSelected();

    if(checkBoxOption4Status == false){
      System.out.println("Checkbox box Option 4" + " Is not checked, hence we will check");
      Thread.sleep(3000);
      checkboxOption4.click();
    }else{
      System.out.println("Checkbox box Option 4" + " already selected");
      Thread.sleep(3000);
      checkboxOption4.click();
    }



  }






}
