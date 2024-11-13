import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class OpeningBrowser {


  public static void main(String[] args) {

 //initialize WebDriver

    //Declaring vs Instantiating

   WebDriver chromeD = new ChromeDriver();
//   WebDriver firefoxD = new FirefoxDriver();
//   WebDriver safariD = new SafariDriver();
//   WebDriver edgeD = new EdgeDriver();


    //open a website
    chromeD.get("https://www.realmadrid.com/");

    //safariD.get("https://www.youtube.com");


    int numb = 4;

    // int numb;
     // = 4

    ///   Animal (interface) or class/ ---> inherited by Dogs, Dragons, Horses

  }
}
