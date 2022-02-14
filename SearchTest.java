package BasicTesting;

/* 
Test Case: To open www.google.com and search youtube.

@author - Neeraj shankar - codewithneeraj@outlook.com
*/

//required imports
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class SearchTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        // creating and instance of webdriver
        WebDriver driver = new ChromeDriver();

        // using the Webdriver instance to open and navigate to Google site
        driver.navigate().to("https://www.google.com/");

        // find web element "search box" and send values using sendKeys()
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"))
                .sendKeys("youtube");

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"))
                .sendKeys(Keys.RETURN);

        // to close the window open
        driver.quit();

    }

}
