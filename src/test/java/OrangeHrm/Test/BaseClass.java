package OrangeHrm.Test;

import OrangeHrm.Pages.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseClass {
    static WebDriver driver;
    protected static PageFactory pageFactory;
    @BeforeClass
    public static void setup(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        pageFactory = new PageFactory(driver);
    }
    @AfterClass
    public void close(){

        driver.close();
    }
}
