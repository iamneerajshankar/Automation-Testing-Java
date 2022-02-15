package BasicTesting;

import java.io.File;
import java.io.IOException;

/* 
Test Case 2: To open https://www.neerajshankar.tech/, screenshot and save it in file

@author - Neeraj shankar - codewithneeraj@outlook.com
*/
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;

public class Capture_Screenshot {

    static void Take_Screenshot() throws InterruptedException, IOException{
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.navigate().to("https://commons.apache.org/proper/commons-io/download_io.cgi");

        //Mazimize current window
        driver.manage().window().maximize();

        //Delay execution for 5 seconds to view the maximize operation
        Thread.sleep(5000);

        //Convert web driver object to TakeScreenshot
        TakesScreenshot screenshot = ((TakesScreenshot)driver);

        //create image file calling getScreenshotAs
        File source_file = screenshot.getScreenshotAs(OutputType.FILE);

        File dest_file = new File("../Automation-Testing-Java/src/Screenshots/test2.png");

        //Move file from source to destination
        FileUtils .copyFile(source_file, dest_file);
        //Close the browser
        driver.quit();


    
        
    }

    
    public static void main(String[] args) throws InterruptedException, IOException{
        Take_Screenshot();
    }
}
