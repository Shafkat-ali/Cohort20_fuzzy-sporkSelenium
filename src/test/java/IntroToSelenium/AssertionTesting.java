package IntroToSelenium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AssertionTesting {




    WebDriver driver;

    @Before
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://practice.automationtesting.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    @Test
    public void assertTitleOfThePage(){
//HARD ASSERTIONS

        /// assertTrue
//        String textOfShop  = driver.findElement(By.id("menu-item-40")).getText();  /// Shop
//        Assert.assertTrue(textOfShop.equals("Shop"));
//        System.out.println("Assertion passed if this printed out");

        /// assertFalse
          String textOfShop  = driver.findElement(By.id("menu-item-40")).getText();  /// Shop
          Assert.assertFalse(textOfShop.equals("Cafe Shop"));
          System.out.println("Assertion passed if this printed out");

        //assert Equals
          String actualTitleOfThePage =  driver.getTitle();
          String expectedTitleOfThePage = "Automation Practice Site";
          Assert.assertEquals(expectedTitleOfThePage,actualTitleOfThePage);
    }

                //SOFT ASSERTION - READ UP ON SOFT ASSERTIONS



}
