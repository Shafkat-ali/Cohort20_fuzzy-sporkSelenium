package demo.automationtesting;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class signUp {

  WebDriver driver;

@Before
public void setUp(){
    driver = new ChromeDriver();
    driver.get("https://demo.automationtesting.in/Index.html");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //implicit
}

@Ignore
@Test
public void signingUp(){
    driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
    driver.findElement(By.id("enterimg")).click();

    driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[1]/div[1]/input")).sendKeys("Catherine");
    driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[1]/div[2]/input")).sendKeys("Sabat");

    //cindy
  driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[2]//textarea")).sendKeys("My Address");
  driver.findElement(By.xpath("//input[@type='email']")).sendKeys("MyEmail");
  driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("111111111");
  driver.findElement(By.id("msdd")).click();
  driver.findElement(By.xpath("//div[@style='display: block;']//li[2]")).click();

  String pwd = "asdfjkl";
  driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[12]//input")).sendKeys(pwd);
  driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[13]//input")).sendKeys(pwd);

}

@Test
public void signUpEhab() throws InterruptedException {
  driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
  driver.findElement(By.id("enterimg")).click();
  Thread.sleep(3000);

  driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[1]/div[1]/input")).sendKeys("Ehab");
  driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[1]/div[2]/input")).sendKeys("El-Khatib");
  driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[2]/div/textarea")).sendKeys("123rd street, New York, NY 10000");
  driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[3]/div[1]/input")).sendKeys("abc123@gmail.com");
  driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[4]/div[1]/input")).sendKeys("703-999-2805");
  driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[5]/div[1]/label[1]/input")).click();
  Thread.sleep(500);
  driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[6]/div[1]/div[2]/input")).click();
  driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[7]/div/multi-select/div[1]")).click();
  driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[7]/div[1]/multi-select/div[2]/ul/li[8]/a")).click();
  driver.findElement(By.xpath("/html/body")).click();
  //driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[10]/div/span/span[1]/span")); //country couldn't figure out how to select

  driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[11]/div[1]/select")).click();
  driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[11]/div[1]/select/option[90]")).click();
  driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[11]/div[2]/select")).click();
  driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[11]/div[2]/select/option[13]")).click();
  driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[11]/div[3]/select")).click();
  driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[11]/div[3]/select/option[23]")).click();
  driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[12]/div/input")).sendKeys("Password123");
  driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[13]/div/input")).sendKeys("Password123");
}





}
