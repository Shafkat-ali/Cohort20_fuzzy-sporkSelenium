package IntroToSelenium;

import org.assertj.core.api.SoftAssertions;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AssertionTetstingSoftAssert {



  WebDriver driver;

  @Before
  public void setUp(){
    driver = new ChromeDriver();
    driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @Test
  public void assertingContactUsForms(){

    SoftAssertions sA = new SoftAssertions();

   String contactUsText = driver.findElement(By.xpath("//*[@name='contactme']")).getText();
   String firstNamePlaceholder = driver.findElement(By.name("first_name")).getAttribute("placeholder");
   String lastNamePlaceholder = driver.findElement(By.name("last_name")).getAttribute("placeholder");;
   String emailPlaceholder = driver.findElement(By.name("email")).getAttribute("placeholder");;
   String commentPlaceholder = driver.findElement(By.name("message")).getAttribute("placeholder");;
   String buttonResetText = driver.findElement(By.xpath("//*[@id='form_buttons']/input[@type='reset']")).getAttribute("type");
   String buttonSubmitText = driver.findElement(By.xpath("//*[@id='form_buttons']/input[@type='submit']")).getAttribute("type");

    sA.assertThat(contactUsText).isEqualTo("CONTACT USA");
    sA.assertThat(firstNamePlaceholder).isEqualTo( "First Name");
    sA.assertThat(lastNamePlaceholder).isEqualTo( "Last Name");
    sA.assertThat(emailPlaceholder).isEqualTo( "Email Address");
    sA.assertThat(commentPlaceholder).isEqualTo( "Comments");
    sA.assertThat(buttonResetText).isEqualTo( "reset");
    sA.assertThat(buttonSubmitText).isEqualTo( "submit");

    sA.assertAll();
  }

}
