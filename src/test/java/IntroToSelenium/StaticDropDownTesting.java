package IntroToSelenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class StaticDropDownTesting {



    WebDriver driver;

    @Before
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    @Test
    public void dropDown() throws InterruptedException {

        Select select = new Select(driver.findElement(By.id("dropdowm-menu-1")));

        Thread.sleep(2000);
// at first
        //THE VALUE OF THE DROP DOWN IS JAVA

        select.selectByIndex(2); //python //ehab C#
        Thread.sleep(2000);

        select.selectByValue("c#");
        Thread.sleep(2000);

        select.selectByVisibleText("SQL");
        Thread.sleep(2000);



        ///List<WebElement> options = select.getAllSelectedOptions();


    }





}
