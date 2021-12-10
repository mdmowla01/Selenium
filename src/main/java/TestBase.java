import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class TestBase {

    WebDriver driver;

    @BeforeTest
    @Parameters("browser")
    public void setup(String browser)
    {
        if(browser.equalsIgnoreCase("chrome"))
        {
            //System.setProperty("webdriver.chrome.driver", "C:\\Users\\taher\\IdeaProjects\\SeleniumAutomation\\WebDriver\\chromedriver.exe");
            //ChromeOptions options = new ChromeOptions();
            //driver = new ChromeDriver(options);
           String url = "http://52.191.13.216:4444/wd/hub";

            System.out.println(url);



            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("browserName", "chrome");
            try{
               driver = new RemoteWebDriver(new URL(url), cap );
            }catch (MalformedURLException e)
            {
                e.printStackTrace();
            }

            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }


    }

    public String getTitleText()
    {
        return driver.getTitle();
    }

    @AfterTest
    public void quitTest()
    {
        driver.quit();
        //driver.close();
    }








}
