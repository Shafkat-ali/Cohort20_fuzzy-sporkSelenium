package IntroToSelenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CheckboxTesting {

  WebDriver driver;

  @Before
 public void setUp(){
   driver = new ChromeDriver();
   driver.get("https://the-internet.herokuapp.com/checkboxes");
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 }

  @Test
 public void checkboxVerification() throws InterruptedException {
    WebElement checkboxBox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
    Boolean checkBoxOneStatus =  checkboxBox1.isSelected();

    if(checkBoxOneStatus == false){
      System.out.println("Checkbox box 1" + " Is not checked, hence we will check");
      Thread.sleep(3000);
      checkboxBox1.click();
    }else{
      System.out.println("Checkbox box 1" + " already selected");
      Thread.sleep(3000);
      checkboxBox1.click();
    }


   WebElement selectBox2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
   Boolean checkBoxTwoStatus =  selectBox2.isSelected();

   if(checkBoxTwoStatus == false){
     System.out.println("Checkbox  2" + " Is not checked, hence we will check");
     Thread.sleep(3000);
     selectBox2.click();
   }else{
     System.out.println("Checkbox box 2" + " already selected");
     Thread.sleep(3000);
     selectBox2.click();
   }


 }

}
